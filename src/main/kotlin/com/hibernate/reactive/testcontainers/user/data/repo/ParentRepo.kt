package com.hibernate.reactive.testcontainers.user.data.repo

import com.hibernate.reactive.testcontainers.user.data.entity.Parent
import io.micronaut.data.repository.kotlin.CoroutineCrudRepository
import java.util.*

interface ParentRepo: CoroutineCrudRepository<Parent, UUID> {
}