package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{ rollDice() }

        val countUpButton: Button = findViewById(R.id.countup_button)
        countUpButton.setOnClickListener { countUp() }
    }

    private fun rollDice() {
//        Toast.makeText(this, "button clicked",
//            Toast.LENGTH_SHORT).show()
        val randomInt = (1..6).random()
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()
    }

    private fun countUp() {
        val resultText: TextView = findViewById(R.id.result_text)
        if(resultText.text.toString() == getString(R.string.initial_label)) {
            resultText.text = "1"
        } else if(resultText.text.toString() != "6"){
            var resultValue : Int = resultText.text.toString().toInt()
            resultValue++
            resultText.text = resultValue.toString()
        }
    }
}