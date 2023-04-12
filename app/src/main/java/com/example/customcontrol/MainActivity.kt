package com.example.customcontrol

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.customcontrol.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var num = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        val sp = getSharedPreferences("data", MODE_PRIVATE)
        num = sp.getInt("key_num", 0)
        show()
        binding.mainTextNum.text = num.toString()
        binding.titleLayout.setTitle("首页")
        binding.titleLayout.setEdit {
            Toast.makeText(this, "You Clicked Edit Button", Toast.LENGTH_SHORT).show()
        }
        //+1事件
        binding.mainBtnAdd.setOnClickListener {
            num++
            show()
        }
        //-1事件
        binding.mainBtnSub.setOnClickListener {
            num--
            show()
        }
    }
    private fun save() {
        getSharedPreferences("data", Context.MODE_PRIVATE).edit().apply {
            putInt("key_num", num)
        }.apply()
    }
   private fun show(){
        binding.mainTextNum.text = num.toString()
        save()
    }
}