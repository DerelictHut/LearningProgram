package com.example.l.commoncomponent

import android.app.Activity
import android.content.Context
import android.support.v4.content.ContextCompat
import android.util.AttributeSet
import android.view.Gravity
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.example.l.commoncomponent.utils.WindowUtils

/**
 *@author $汪金龙$
 *@desc 简单的头部共项目使用
 *@date 2018/11/14 17:13
 */
class HeadTitle @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {
    private var mPromptTv: TextView

    init {
        orientation = VERTICAL
        val lp = LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        val title = LinearLayout(context)
        title.layoutParams = lp
        title.setBackgroundResource(R.color.c122)
        title.orientation = HORIZONTAL
        val lllp = LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, WindowUtils.dp2px(context, 56f))
        val back = ImageView(context)
        back.layoutParams = lllp
        back.setImageResource(R.drawable.svg_back_c100)
        back.setPadding(WindowUtils.dp2px(context, 16f), 0, WindowUtils.dp2px(context, 16f), 0)
        title.addView(back)
        mPromptTv = TextView(context)
        mPromptTv.layoutParams = lllp
        mPromptTv.gravity = Gravity.CENTER
        mPromptTv.setTextColor(ContextCompat.getColor(context, R.color.c100))
        mPromptTv.textSize = 16f
        title.addView(mPromptTv)
        addView(title)
        back.setOnClickListener {
            (context as Activity).finish()
        }
    }

    fun setPrompt(prompt: String) {
        mPromptTv.text = prompt
    }
}