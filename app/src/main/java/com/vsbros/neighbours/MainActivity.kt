package com.vsbros.neighbours

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        add_information.setOnClickListener {

            Log.i("MainActivity", "Clicked on Add Image")

            main_text.setText("Text Gets Changed")
        }

    }
}
