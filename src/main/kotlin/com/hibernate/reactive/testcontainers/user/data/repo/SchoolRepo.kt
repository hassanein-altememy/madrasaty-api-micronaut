package com.hibernate.reactive.testcontainers.user.data.repo

import com.hibernate.reactive.testcontainers.user.data.entity.Person
import io.micronaut.data.repository.kotlin.CoroutineCrudRepository
import java.util.*

interface SchoolRepo: CoroutineCrudRepository<Person, UUID> {
}