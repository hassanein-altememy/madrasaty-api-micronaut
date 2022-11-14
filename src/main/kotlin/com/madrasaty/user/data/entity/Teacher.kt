package com.madrasaty.user.data.entity

import javax.persistence.Entity
import javax.persistence.OneToMany

@Entity
class Teacher : Person(){
    @OneToMany
    var schoolClasses: List<SchoolClass>?=null
}