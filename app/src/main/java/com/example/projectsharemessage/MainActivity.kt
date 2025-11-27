package com.example.projectsharemessage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Button

const val EXTRA_MESSAGE = "com.example.projectsharemessage.MESSAGE"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSendMessage.setOnClickListener { view: View ->

            //akses editText
            val editText = findViewById<EditText>(R.id.editMessage)
            val message = editText.text.toString()

            // Membuat intent → kirim pesan ke SecondActivity
            val intent = Intent(this, SecondActivity::class.java).apply {
                putExtra(EXTRA_MESSAGE, message)
            }

            startActivity(intent)
        }
    }

    private val btnSendMessage: Button
        get() = findViewById(R.id.btnSendMessage)
}
