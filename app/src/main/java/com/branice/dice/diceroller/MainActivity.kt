package com.branice.dice.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonToast: Button =findViewById(R.id.button_toast)
        buttonToast.setOnClickListener { toastMyButton() }

        val buttonRoll: Button =findViewById(R.id.button_roll)
          buttonRoll.setOnClickListener{rollDice() }

    }

    private fun toastMyButton(){
        Toast.makeText(this,"OOH My,First App!!!!",Toast.LENGTH_SHORT).show()
    }
    private fun rollDice(){
        val randomInt =(1..6).random()
        val textResult:TextView=findViewById(R.id.textResult)
        textResult.text=randomInt.toString()
    }
}