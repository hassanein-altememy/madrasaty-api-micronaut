package com.madrasaty.user.data.entity

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.OneToMany

@Entity
class SchoolClass {
    @Id
    val name: String?=null
    @OneToMany
    val students: MutableList<Student> = mutableListOf()
    @OneToMany
    var teachers: MutableList<Teacher> = mutableListOf()
}
