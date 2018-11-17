package com.example.l.commoncomponent.widget.date

import android.content.Context
import android.util.AttributeSet
import android.view.ViewGroup

/**
 * @author $汪金龙$
 * @desc 月
 * @date 2018/10/23 15:51
 */
class MonthView : ViewGroup {
    constructor(context: Context) : this(context,null)

    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs!!,0)

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        //初始化
    }
    override fun onLayout(changed: Boolean, l: Int, t: Int, r: Int, b: Int) {

    }
}
