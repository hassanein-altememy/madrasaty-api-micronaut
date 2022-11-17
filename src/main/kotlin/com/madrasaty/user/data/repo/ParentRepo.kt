package com.madrasaty.user.data.repo

import com.madrasaty.user.data.entity.Parent
import io.micronaut.data.jpa.repository.JpaRepository
import io.micronaut.data.repository.kotlin.CoroutineCrudRepository
import java.util.*

interface ParentRepo: JpaRepository<Parent, UUID> {
}
