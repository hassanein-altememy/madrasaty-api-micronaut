package com.madrasaty.user.data.repo

import com.madrasaty.user.data.entity.Person
import io.micronaut.data.repository.kotlin.CoroutineCrudRepository
import java.util.*

interface SchoolRepo: CoroutineCrudRepository<Person, UUID> {
}