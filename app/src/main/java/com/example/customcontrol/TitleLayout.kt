package com.example.customcontrol

import android.app.Activity
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import com.example.customcontrol.databinding.TitleBinding

/**
 * @param context 上下文
 * @param attrs 属性集
 */
class TitleLayout(context: Context, attrs: AttributeSet) : LinearLayout(context, attrs) {
    //    private lateinit var titleBack: Button
//    private lateinit var titleEdit: Button
    private lateinit var binding: TitleBinding

    init {
        //动态加载布局
        LayoutInflater.from(context).inflate(R.layout.title, this)
        binding = TitleBinding.bind(this)
//        titleBack = findViewById(R.id.titleBack)
//        titleEdit = findViewById(R.id.titleEdit)
        binding.titleBack.setOnClickListener {
            val activity = context as Activity
            activity.finish()
        }
//        binding.titleEdit.setOnClickListener {
//
//        }
    }
    public fun setTitle(title:String){
        binding.textView.text=title
    }
    public fun setEdit(clickListener: OnClickListener){
        binding.titleEdit.setOnClickListener(clickListener)
    }
}