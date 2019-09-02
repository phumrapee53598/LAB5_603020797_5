package com.example.lab5_intent_6030207975

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var data = intent.extras
        var newStudent = data?.getParcelable<Student>("stdData")
        idText.text = "student ID : ${newStudent?.id}"
        nameText.text = "student Name : ${newStudent?.name}"
        ageText.text = "student Age : ${newStudent?.age}"
    }
    fun  onClickClose(v:View){
        finish()
    }
}
