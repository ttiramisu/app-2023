package com.saltedcaramel.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnClickMe = findViewById<Button>(R.id.mybutton)
        val tvMyTextView = findViewById<TextView>(R.id.textView)
        val resetBtn = findViewById<Button>(R.id.button4)
        var timesClicked = 0
        btnClickMe.setOnClickListener {
            timesClicked = timesClicked + 1
            tvMyTextView.text = timesClicked.toString()
        }
        resetBtn.setOnClickListener {
            timesClicked = 0
            tvMyTextView.text = timesClicked.toString()
            Toast.makeText(this, "Reset successfully", Toast.LENGTH_LONG).show()
        }
    }
}