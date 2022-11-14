package com.madrasaty.user.data.repo

import com.madrasaty.user.data.entity.Login
import io.micronaut.data.repository.kotlin.CoroutineCrudRepository
import java.util.*

interface LoginRepo: CoroutineCrudRepository<Login, UUID> {
}