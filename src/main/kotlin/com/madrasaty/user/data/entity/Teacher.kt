package com.madrasaty.user.data.entity

import javax.persistence.Entity
import javax.persistence.OneToMany

@Entity
class Teacher : Person(){
    @OneToMany
    val schoolClasses: MutableList<SchoolClass> = mutableListOf()
}