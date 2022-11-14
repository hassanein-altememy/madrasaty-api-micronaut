package com.madrasaty.user.data.repo

import com.madrasaty.user.data.entity.Parent
import io.micronaut.data.repository.kotlin.CoroutineCrudRepository
import java.util.*

interface ParentRepo: CoroutineCrudRepository<Parent, UUID> {
}