package com.ilkayinan.intentkotlin2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ilkayinan.intentkotlin2.databinding.ActivityNextBinding

class NextActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNextBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNextBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val intentFromMain = intent //getintent()
        val name = intentFromMain.get

    }
}