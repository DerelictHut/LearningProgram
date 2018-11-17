package com.example.l.commoncomponent.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.l.commoncomponent.R
import kotlinx.android.synthetic.main.activity_widget_use.*

/**
 *@author $汪金龙$
 *@desc 控件使用
 *@date 2018/11/5 16:40
 */
class WidgetUseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_widget_use)
        gl_list.setPrompt("控件使用方法")
        gl_list.addData(this, VarietyImageViewActivity::class.java, "VarietyImageView使用")
    }
}