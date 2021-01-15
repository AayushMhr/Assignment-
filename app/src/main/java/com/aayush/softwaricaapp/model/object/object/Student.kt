package com.aayush.softwaricaapp.`object`

import com.aayush.softwaricaapp.model.student



object Student {
    var lstStudent= arrayListOf<student>()
    fun addStudent(){
        lstStudent= arrayListOf();
        lstStudent.add(student(
                studentName ="mark zuckerberg",studentAge = "36",studentGender = "Male",
                studentAddress ="Sanepa", imageLink = "https://www.gstatic.com/tv/thumb/persons/589228/589228_v9_ba.jpg"))

        lstStudent.add(student(
                studentName ="Saugat Malla",studentAge = "35",studentGender = "Male",
                studentAddress ="Satdobato", imageLink = "https://upload.wikimedia.org/wikipedia/commons/f/fc/Saugat_malla.jpg"
        ))
    }
}