package com.example.mad_practical_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.math.BigInteger

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)

        rollButton.setOnClickListener{rollDice()}
        val countButton: Button = findViewById(R.id.button_add)

        countButton.setOnClickListener{add()}
    }
    private fun rollDice() {
        val resultText: TextView = findViewById(R.id.result_text)

        val randomInt = (1..6).random()
        resultText.text = randomInt.toString()

        Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()
    }
    private fun add(){
        val resultText: TextView = findViewById(R.id.result_text)
        var number = resultText.text.toString().toIntOrNull()
        if(number == null){
            resultText.text == "1";
        }else {
            number++
            resultText.text = number.toString()
        }
    }
}
