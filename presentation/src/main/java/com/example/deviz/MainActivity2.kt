package com.example.deviz

<<<<<<< HEAD
import android.R
import android.graphics.drawable.InsetDrawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.CompoundButtonCompat
import com.example.deviz.databinding.MenuLeftSideBinding


class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: MenuLeftSideBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MenuLeftSideBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding) {
            radioButton1.buttonDrawable = InsetDrawable(CompoundButtonCompat.getButtonDrawable(radioButton1), 32, 0, 32, 0)
        }
=======
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
>>>>>>> origin/commit
    }
}