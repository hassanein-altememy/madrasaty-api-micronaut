package com.madrasaty.user.data.repo

import com.madrasaty.user.data.entity.Login
import com.madrasaty.user.data.entity.Person
import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository
import java.util.*

@Repository
interface PersonRepo: JpaRepository<Person, UUID> {
    fun findByLoginsLoginNameAndLoginsPasswordAndLoginsActiveTrue(loginName: String, password: String): Person?
}