package com.madrasaty.user.data.repo

import com.madrasaty.user.data.entity.Student
import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository
import java.util.*

@Repository
interface StudentRepo :JpaRepository<Student, UUID>