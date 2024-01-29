package com.ilkayinan.kotlincalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ilkayinan.kotlincalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.toplabutton.setOnClickListener {
            val number1Text = binding.number1.text.toString()
            val number2Text = binding.number2.text.toString()

            val number1 = number1Text.toIntOrNull()
            val number2 = number2Text.toIntOrNull()

            if (number1 != null && number2 != null) {
                val sonuc: Double
                sonuc = number1.toDouble() + number2.toDouble()
                binding.sonuctext.text = "$sonuc"
            } else {
                binding.sonuctext.text = "Please enter valid numbers"
            }
        }
        binding.cikarbutton.setOnClickListener {
            val number1Text = binding.number1.text.toString()
            val number2Text = binding.number2.text.toString()

            val number1 = number1Text.toIntOrNull()
            val number2 = number2Text.toIntOrNull()

            if (number1 != null && number2 != null) {
                val sonuc: Double
                sonuc = number1.toDouble() - number2.toDouble()
                binding.sonuctext.text = "$sonuc"
            } else {
                binding.sonuctext.text = "Please enter valid numbers"
            }
        }
        binding.carpbutton.setOnClickListener {
            val number1Text = binding.number1.text.toString()
            val number2Text = binding.number2.text.toString()

            val number1 = number1Text.toIntOrNull()
            val number2 = number2Text.toIntOrNull()

            if (number1 != null && number2 != null) {
                val sonuc: Double
                sonuc = number1.toDouble() * number2.toDouble()
                binding.sonuctext.text = "$sonuc"
            } else {
                binding.sonuctext.text = "Please enter valid numbers"
            }
        }
        binding.bolbutton.setOnClickListener {
            val number1Text = binding.number1.text.toString()
            val number2Text = binding.number2.text.toString()

            val number1 = number1Text.toIntOrNull()
            val number2 = number2Text.toIntOrNull()

            if (number1 != null && number2 != null) {
                val sonuc: Double
                sonuc = number1.toDouble() / number2.toDouble()
                binding.sonuctext.text = "$sonuc"
            } else {
                binding.sonuctext.text = "Please enter valid numbers"
            }
        }

    }
}