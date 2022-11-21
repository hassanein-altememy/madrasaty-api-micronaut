package com.madrasaty.user.data.entity

import javax.persistence.Entity
import javax.persistence.OneToMany

@Entity
class Student : Person() {
    @OneToMany
    val parents: MutableList<Parent> = mutableListOf()
}