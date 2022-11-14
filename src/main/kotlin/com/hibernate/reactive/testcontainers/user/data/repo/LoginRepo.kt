package com.hibernate.reactive.testcontainers.user.data.repo

import com.hibernate.reactive.testcontainers.user.data.entity.Login
import io.micronaut.data.repository.kotlin.CoroutineCrudRepository
import java.util.*

interface LoginRepo: CoroutineCrudRepository<Login, UUID> {
}