package com.example.myapplication

import java.util.*
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById<Button>(R.id.button)
        button1.text = "Find Age"
        button1.setOnClickListener(){
            val yearOfBirth = findViewById<TextView>(R.id.year)
            val yob:Int = yearOfBirth.text.toString().toInt()

            val myage = Calendar.getInstance().get(Calendar.YEAR) - yob
            val text = findViewById<TextView>(R.id.txt)
            if(myage > 100){
                text.text = "Congrats,you are dead"
            }else if(myage < 0){
                text.text = "Congrats,you are not even born"
            }else {
                text.text = "Your age is: $myage"
            }
        }


    }
}