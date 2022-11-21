package com.madrasaty.user.data.repo

import com.madrasaty.user.data.entity.Parent
import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository
import io.micronaut.data.model.query.builder.sql.Dialect
import java.util.*

@Repository
interface ParentRepo: JpaRepository<Parent, UUID>
