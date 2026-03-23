package com.example.sayhello

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.sayhello.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //lateinit var button1 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //button1 = findViewById<Button>(R.id.button1)

        binding.button1.setOnClickListener {
            Toast.makeText(this, "버튼을 눌렀어요", Toast.LENGTH_LONG).show()
            binding.textview1.text="Hello World!"
        }
    }
}