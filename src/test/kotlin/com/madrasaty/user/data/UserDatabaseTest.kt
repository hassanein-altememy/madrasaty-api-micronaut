package com.madrasaty.user.data

import com.madrasaty.user.data.entity.Login
import com.madrasaty.user.data.entity.Parent
import com.madrasaty.user.data.entity.Student
import com.madrasaty.user.data.repo.ParentRepo
import com.madrasaty.user.data.repo.PersonRepo
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import jakarta.inject.Inject
import java.text.SimpleDateFormat
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

@MicronautTest
class UserDatabaseTest {

    @Inject
    lateinit var parentRepo : ParentRepo

    @Inject
    lateinit var personRepo: PersonRepo

    val hassanein = Parent().apply {
        firstName = "Hassanein"
        lastName = "Altememy"
        address = "Menno ter Braakstraat 60, Den haag"
        birthday = SimpleDateFormat("MM-dd-yyyy").parse("15-01-1978")
        logins.add(Login(null, "hassanein.altememy@gmail.com", "hassaneinPass", true))
    }

    val meryem = Student().apply {
        firstName = "Meryem"
        lastName = "Altememy"
        address = "Menno ter Braakstraat 60, Den haag"
        birthday = SimpleDateFormat("MM-dd-yyyy").parse("27-07-2021")
        logins.add(Login(null, "meryem.altememy@gmail.com", "meryemPass", true))
    }

    val ahmed = Parent().apply {
        firstName = "Ahmed"
        lastName = "Aziz"
        address = "Leiden"
        birthday = SimpleDateFormat("MM-dd-yyyy").parse("01-01-1982")
        logins.add(Login(null, "ahmed.aziz@gmail.com", "ahmedPass", false))
    }

    @Test
    fun `Test inserting and selecting Parent and Student`() {
        assertThat(hassanein.id).isNull()
        hassanein.children.add(meryem)
        val parent = parentRepo.save(hassanein)
        assertThat(parent.id).isNotNull
        assertThat(parent.firstName).isEqualTo(hassanein.firstName)
        assertThat(parent.children.get(0).firstName).isEqualTo(meryem.firstName)
    }

    @Test
    fun `Test selection of Person based on Login`() {
        meryem.parents.add(hassanein)
        hassanein.children.add(meryem)

        parentRepo.save(hassanein)
        parentRepo.save(ahmed)

        val loginParent = personRepo.findByLoginsLoginNameAndLoginsPasswordAndLoginsActiveTrue("hassanein.altememy@gmail.com", "hassaneinPass")

        assertThat(loginParent).isInstanceOf(Parent::class.java)

        val loginWrong = personRepo.findByLoginsLoginNameAndLoginsPasswordAndLoginsActiveTrue("blabla", "secondblala")
        assertThat(loginWrong).isNull()

        val loginStudent = personRepo.findByLoginsLoginNameAndLoginsPasswordAndLoginsActiveTrue("meryem.altememy@gmail.com", "meryemPass")
        assertThat(loginStudent).isInstanceOf(Student::class.java)

        val loginNotActive = personRepo.findByLoginsLoginNameAndLoginsPasswordAndLoginsActiveTrue("ahmed.aziz@gmail.com", "ahmedPass")
        assertThat(loginNotActive).isNull()

    }
}