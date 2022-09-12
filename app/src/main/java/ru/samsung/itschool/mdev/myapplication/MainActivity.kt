package ru.samsung.itschool.mdev.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.button)
        btn.setOnClickListener() {
            counter()
        }
    }
    private fun counter() {
        val textView = findViewById<TextView>(R.id.textView)
        val textvalue = textView.text.toString()
        var count = textvalue.toInt()
        count++
        textView.text = count.toString()

    }
}