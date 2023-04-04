package com.zookeeper.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() }
    }

    private fun rollDice() {
        var tv: TextView = findViewById(R.id.textView);
        Toast.makeText(this, "Dados jogados!", Toast.LENGTH_SHORT).show()
        Thread.sleep(500)
        tv.text = Dice(6).roll().toString()
    }
}