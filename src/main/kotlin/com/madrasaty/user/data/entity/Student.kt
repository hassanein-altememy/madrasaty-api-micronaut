package com.madrasaty.user.data.entity

import javax.persistence.Entity
import javax.persistence.OneToMany

@Entity
class Student : Person() {
    @OneToMany
    var parents: List<Parent> ? =null
}