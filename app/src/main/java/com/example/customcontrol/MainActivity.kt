package com.example.customcontrol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.customcontrol.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        binding.titleLayout.setTitle("首页")
        binding.titleLayout.setEdit{
            Toast.makeText(this, "You Clicked Edit Button", Toast.LENGTH_SHORT).show()
        }
    }

}