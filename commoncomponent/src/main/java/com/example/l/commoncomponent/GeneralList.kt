package com.example.l.commoncomponent

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.support.v4.content.ContextCompat
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.AttributeSet
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.annimon.stream.Collectors
import com.annimon.stream.Stream
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.example.l.commoncomponent.utils.WindowUtils
import kotlinx.android.synthetic.main.item_general_list.view.*
import java.util.ArrayList
import kotlin.jvm.JvmOverloads

/**
 *@author $汪金龙$
 *@desc 简单的列表共项目使用
 * <p>@JvmOverloads相当于重写了四个构造器，也可以用于方法的重载上
 *@date 2018/11/7 13:32
 */
class GeneralList @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0, defStyleRes: Int = 0
) : LinearLayout(context, attrs, defStyleAttr, defStyleRes) {
    private val mList = ArrayList<GeneralListBean>()
    private var mPromptTv: TextView
    private var mTitle: LinearLayout
    var mRv: RecyclerView
        private set
    var mAdapter =
            object : BaseQuickAdapter<GeneralListBean, BaseViewHolder>(R.layout.item_general_list, mList) {
                override fun convert(helper: BaseViewHolder, item: GeneralListBean) {
                    helper.setText(R.id.item_list_tv_content, item.content)
                    helper.setVisible(R.id.item_list_iv_icon, item.click)
//                    item_list_tv_content.text = item.content
//                    item_list_iv_icon.visibility = if (item.click) View.VISIBLE else View.INVISIBLE
                }
            }
        private set

    init {
        orientation = VERTICAL
        val lp = LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        mTitle = LinearLayout(context)
        mTitle.layoutParams = lp
        mTitle.setBackgroundResource(R.color.c122)
        mTitle.orientation = HORIZONTAL
        val lllp = LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, WindowUtils.dp2px(context, 56f))
        val back = ImageView(context)
        back.layoutParams = lllp
        back.setImageResource(R.drawable.svg_back_c100)
        back.setPadding(WindowUtils.dp2px(context, 16f), 0, WindowUtils.dp2px(context, 16f), 0)
        mTitle.addView(back)
        mPromptTv = TextView(context)
        mPromptTv.layoutParams = lllp
        mPromptTv.gravity = Gravity.CENTER
        mPromptTv.setTextColor(ContextCompat.getColor(context, R.color.c100))
        mPromptTv.textSize = 16f
        mTitle.addView(mPromptTv)
        mRv = RecyclerView(context)
        mRv.layoutParams = lp
        mRv.layoutManager = LinearLayoutManager(context)
        mRv.adapter = mAdapter
        addView(mTitle)
        addView(mRv)
        mAdapter.setOnItemClickListener { _, _, position ->
            if (mList[position].click) {
                mList[position].activity.startActivity(Intent(mList[position].activity,
                        mList[position].c))
            }
        }
        back.setOnClickListener {
            (context as Activity).finish()
        }
    }

    class GeneralListBean {
        lateinit var content: String
        lateinit var activity: Context
        lateinit var c: Class<*>
        var click = true
    }

    fun setPrompt(prompt: String) {
        mPromptTv.text = prompt
    }

    fun addData(activity: Context, c: Class<*>, content: String) {
        val bean = GeneralListBean()
        bean.activity = activity
        bean.content = content
        bean.c = c
        mList.add(bean)
        mAdapter.notifyDataSetChanged()
    }

    fun addData(content: String) {
        val bean = GeneralListBean()
        bean.content = content
        bean.click = false
        mList.add(bean)
        mAdapter.notifyDataSetChanged()
    }

    fun removeIndex(index: Int) {
        mList.removeAt(index)
        mAdapter.notifyDataSetChanged()
    }

    /**
     * 截断
     */
    fun limit(limit: Long) {
        if (limit < mList.size) {
            val list = Stream.of(mList).limit(limit)
                    .collect(Collectors.toList())
            mList.clear()
            mList.addAll(list)
            mAdapter.notifyLoadMoreToLoading()
        }
    }

    fun clear() {
        mList.clear()
        mAdapter.notifyDataSetChanged()
    }

    fun setTitleHidden() {
        removeView(mTitle)
    }
}