package com.conamobile.pdpputextrahome

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

    lateinit var name:TextView
    lateinit var age:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        name = findViewById(R.id.text_name)
        age = findViewById(R.id.text_age)

        val name2: String? = intent.getStringExtra("name")
        val age2: String? = intent.getStringExtra("age")

        name.text = name2.toString()
        age.text = age2.toString()

    }
}