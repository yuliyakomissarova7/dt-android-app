package com.example.dt_android_app

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SquareActivity : AppCompatActivity() {

    private val logTag = "SquareActivity"
    private var number: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_square)

        setupNumber()
        setupButton()

        Log.d(logTag, "Created")
    }

    private fun setupNumber() {
        number = intent.getIntExtra("number", 0)
        findViewById<TextView>(R.id.number).text = "${number * number}"
    }

    private fun setupButton() {
        findViewById<Button>(R.id.button).setOnClickListener { finish() }
    }

    override fun onStart() {
        super.onStart()
        Log.d(logTag, "Started")
    }

    override fun onResume() {
        super.onResume()
        Log.d(logTag, "Resumed")
    }

    override fun onPause() {
        super.onPause()
        Log.d(logTag, "Paused")
    }

    override fun onStop() {
        super.onStop()
        Log.d(logTag, "Stopped")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(logTag, "Destroyed")
    }
}