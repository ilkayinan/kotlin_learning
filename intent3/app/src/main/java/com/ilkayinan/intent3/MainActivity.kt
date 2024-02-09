package com.ilkayinan.intent3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.ilkayinan.intent3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
    fun next(view: View){
        val intent = Intent(this@MainActivity,NextActivity::class.java)
        intent.putExtra("name",binding.editText.text.toString())
        intent.putExtra("age",binding.editText2.text.toString())
        startActivity(intent)
        finish()
    }

    override fun onStart() {
        super.onStart()
        binding.editText.setText("")
        binding.editText2.setText("")
    }
}