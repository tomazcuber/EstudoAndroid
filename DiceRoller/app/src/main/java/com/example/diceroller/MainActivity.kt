package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var diceImage1 : ImageView
    lateinit var diceImage2 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImage1 = findViewById(R.id.dice_image1)
        diceImage2 = findViewById(R.id.dice_image2)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{ rollDice() }

//        val countUpButton: Button = findViewById(R.id.countup_button)
//        countUpButton.setOnClickListener { countUp() }
    }

    private fun getRandomDiceImage() : Int {
        val randomInt = (1..6).random()

        return when(randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }

    private fun rollDice() {
        diceImage1.setImageResource(getRandomDiceImage())
        diceImage2.setImageResource(getRandomDiceImage())
    }

    private fun countUp() {
//        val resultText: TextView = findViewById(R.id.result_text)
//        if(resultText.text.toString() == getString(R.string.initial_label)) {
//            resultText.text = "1"
//        } else if(resultText.text.toString() != "6"){
//            var resultValue : Int = resultText.text.toString().toInt()
//            resultValue++
//            resultText.text = resultValue.toString()
//        }
    }
}