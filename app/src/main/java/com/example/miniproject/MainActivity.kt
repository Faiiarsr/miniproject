package com.example.miniproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

var result = "result"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button .setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra(result,"ว้ายผิดนะจ้ะ")
            startActivity(intent)
        }
    }
}