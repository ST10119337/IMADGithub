package com.example.exercise2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputField: EditText = findViewById(R.id.inputField)
        val checkButton: Button = findViewById(R.id.checkButton)
        val resultText: TextView = findViewById(R.id.resultText)

        checkButton.setOnClickListener {
            val inputText = inputField.text.toString().trim()

            if (inputText.isNotEmpty()) {
                val number = inputText.toInt()

                val message = if (number % 2 == 0) {
                    "Input value $number is an EVEN number."
                } else {
                    "Input value $number is an ODD number."
                }

                resultText.text = message
            } else {
                resultText.text = "Please enter a valid integer value."
            }
        }
    }
}
