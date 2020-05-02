package com.example.randomizer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import java.util.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //link the variable with the button id
        val rollButton = findViewById<Button>(R.id.Roll_Button)
        val resultsTextView = findViewById<TextView>(R.id.Results_textView)
        val seekBar = findViewById<SeekBar>(R.id.seekBar)

        //where we specify what happen when clicked
        rollButton.setOnClickListener {
            val rand = Random().nextInt(seekBar.progress) //to help generate a random value from zero to the value of the seek bar
            resultsTextView.text = rand.toString();
        }

    }
}
