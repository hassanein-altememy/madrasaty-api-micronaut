package com.madrasaty

import com.madrasaty.user.data.entity.Parent
import com.madrasaty.user.data.entity.Student
import com.madrasaty.user.data.repo.LoginRepo
import com.madrasaty.user.data.repo.ParentRepo
import com.madrasaty.user.data.repo.SchoolRepo
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import jakarta.inject.Inject
import java.text.SimpleDateFormat
import org.junit.Test

@MicronautTest
class MadrasatyTest {

    @Inject
    lateinit var loginRepo : LoginRepo;

    @Inject
    lateinit var parentRepo : ParentRepo;

    @Inject
    lateinit var schoolRepo : SchoolRepo;

    @Test
    fun `Test inserting and selecting some data`() {
        val hassanein = Parent()
        hassanein.firstName = "Hassanein"
        hassanein.lastName = "Altememy"
        hassanein.address = "Menno ter Braakstraat 60, Den haag"
        hassanein.birthday = SimpleDateFormat("MM-dd-yyyy").parse("15-01-1978")
        val meryem = Student()
        meryem.firstName = "Meryem"
        meryem.lastName = "Altememy"
        meryem.address = "Menno ter Braakstraat 60, Den haag"
        meryem.birthday = SimpleDateFormat("MM-dd-yyyy").parse("27-07-2021")
        hassanein.children = listOf(meryem)

        println(parentRepo.save(hassanein))

        assert(true)

    }

}