package com.hibernate.reactive.testcontainers.user.service

import com.hibernate.reactive.testcontainers.user.data.repo.LoginRepo
import com.hibernate.reactive.testcontainers.user.data.repo.ParentRepo
import com.hibernate.reactive.testcontainers.user.data.repo.SchoolRepo
import jakarta.inject.Inject
import jakarta.inject.Singleton

@Singleton
class UserService(
    @Inject val parentRepo: ParentRepo,
    @Inject val loginRepo: LoginRepo,
    @Inject val schoolRepo: SchoolRepo
)