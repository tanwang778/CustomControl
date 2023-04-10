package com.example.customcontrol

import android.app.Activity
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast

class TitleLayout(context: Context, attrs: AttributeSet) : LinearLayout(context, attrs) {
    private lateinit var titleBack: Button
    private lateinit var titleEdit: Button
    init {
        LayoutInflater.from(context).inflate(R.layout.title, this)
        titleBack = findViewById(R.id.titleBack)
        titleEdit = findViewById(R.id.titleEdit)
        titleBack.setOnClickListener {
            val activity = context as Activity
            activity.finish()
        }
        titleEdit.setOnClickListener {
            Toast.makeText(context, "You Clicked Edit Button", Toast.LENGTH_SHORT).show()
        }
    }
}