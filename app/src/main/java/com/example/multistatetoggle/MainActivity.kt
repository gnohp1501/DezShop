package com.example.multistatetoggle

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var toggle: MultiStateToggleButton
    private lateinit var toggle2: MultiStateToggleButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toggle = findViewById(R.id.toggle)
        toggle.isEnabled = true
        toggle.buttons[0].isSelected = true

        toggle2 = findViewById(R.id.toggle2)
        toggle2.isEnabled = false
        toggle2.buttons[0].isSelected = true
    }
}