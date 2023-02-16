package com.example.dt_android_app

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class IncrementActivity : AppCompatActivity() {

    private val logTag = "IncrementActivity"
    private var number: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_increment)

        setupNumber(savedInstanceState)
        setupButton()

        Log.d(logTag, "Created")
    }


    private fun setupNumber(savedInstanceState: Bundle?) {
        number = savedInstanceState?.getInt("number") ?: 0
        findViewById<TextView>(R.id.number).text = number.toString()
    }

    private fun setupButton() {
        val squareButton = findViewById<Button>(R.id.button)
        squareButton.setOnClickListener {
            val intent = Intent(this, SquareActivity::class.java)
                .apply { putExtra("number", number) }
            startActivity(intent)
        }
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

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        if (isChangingConfigurations) {
            number++
        }
        outState.putInt("number", number)
        Log.d(logTag, "Instance saved with number $number")
    }
}