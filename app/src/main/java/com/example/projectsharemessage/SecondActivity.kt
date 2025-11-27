package com.example.projectsharemessage

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        //Get the Intent that started this activity and extract the string
        val message = intent.getStringExtra(EXTRA_MESSAGE)

        //Capture the layout's TextView and set the string as its text
        val txvMessage = findViewById<TextView>(R.id.txvMessage)
        txvMessage.text = message
    }
}
