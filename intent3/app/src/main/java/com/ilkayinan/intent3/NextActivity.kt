package com.ilkayinan.intent3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.ilkayinan.intent3.databinding.ActivityNextBinding

class NextActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNextBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNextBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intentFromMain = intent
        val name = intentFromMain.getStringExtra("name")
        val age = intentFromMain.getStringExtra("age")
        binding.name.text= name
        binding.age.text = age

    }
    fun previous(view: View){
        val intent = Intent(this@NextActivity,MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}