package com.madrasaty.user.data.repo

import com.madrasaty.user.data.entity.Login
import io.micronaut.data.jpa.repository.JpaRepository
import io.micronaut.data.repository.kotlin.CoroutineCrudRepository
import java.util.*

interface LoginRepo: JpaRepository<Login, UUID>