package com.example.l.commoncomponent.widget.date

import android.content.Context
import android.support.annotation.Nullable
import android.util.AttributeSet
import android.view.View
import org.xml.sax.Attributes

/**
 *@author $汪金龙$
 *@desc 天
 *@date 2018/11/5 17:28
 */
class DayView : View {
    constructor(context: Context) : this(context, null)
    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs!!, 0)
    //defStyleAttr需要在theme中声明
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : this(context, attrs, defStyleAttr, 0)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int, defStyleRes: Int) : super(context, attrs, defStyleAttr, defStyleRes) {
        //初始化
    }
}