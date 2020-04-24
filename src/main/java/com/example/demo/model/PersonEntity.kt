package com.example.demo.model

import java.time.LocalDate

data class PersonEntity(var firstName: String?, var lastName: String?, var phoneNumber: String?, var birthdate: LocalDate?) {

    // Necessary for MapStruct
    constructor() : this(null, null, null, null)

}