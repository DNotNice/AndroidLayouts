package com.example.workingwithlayouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    private  lateinit var btn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        btn = findViewById(R.id.Btn)
        btn.setOnClickListener { val intent =  Intent(this , ThirdActivity::class.java)
            startActivity(intent)}
    }
}