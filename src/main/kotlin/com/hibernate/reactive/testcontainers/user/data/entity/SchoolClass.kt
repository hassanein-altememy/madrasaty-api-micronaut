package com.hibernate.reactive.testcontainers.user.data.entity

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.OneToMany

@Entity
class SchoolClass (
    @Id
    val name: String?=null,
    @OneToMany
    var students: List<Student>?=null,
    @OneToMany
    var teachers: List<Teacher>?=null
)
