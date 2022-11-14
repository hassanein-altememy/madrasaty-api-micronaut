package com.hibernate.reactive.testcontainers.user.data.entity

import javax.persistence.Entity
import javax.persistence.OneToMany

@Entity
class Parent : Person() {
    @OneToMany
    var children: List<Student>? = null
}