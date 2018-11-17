package com.example.l.commoncomponent.widget.views.varietyiv

import android.app.Activity
import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Path
import android.support.annotation.IntDef
import android.support.v7.widget.AppCompatImageView
import android.util.AttributeSet
import com.example.l.commoncomponent.R

/**
 *@author $汪金龙$
 *@desc 可以设置圆形、圆角、三角形、五边形、六边形、八边形等ImageView
 *@date 2018/11/5 17:39
 */
class VarietyImageView(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : AppCompatImageView(context, attrs, defStyleAttr) {
    companion object {
        /**
         * 圆形、圆角、三角形、五边形、六边形、八边形
         */
        const val CIRCLE = 1
        const val CORNERS = 2
        const val TRIANGLE = 4
        const val PENTAGON = 8
        const val HEXAGON = 16
        const val OCTAGON = 32
    }
    constructor(context: Context?) : this(context, null)
    constructor(context: Context?, attrs: AttributeSet?) : this(context, attrs, 0)

    /**
     * 图片形状
     */
    private var mShape: Int = -1
    /**
     * 路径
     */
    private var mPath: Path
    /**
     * 边框画笔
     */
    private lateinit var mBorderPaint: Paint
    /**
     * 边框宽度
     */
    private lateinit var mBorderWidth: Paint
    /**
     * 圆角大小
     */
    private var mCorners = 4
    /**
     * 中心点x
     */
    private var mX = 0.toFloat()
    /**
     * 中心点y
     */
    private var mY = 0.toFloat()
    /**
     * 半径
     */
    private var mRadius = 0.toFloat()

    init {
        val ta = context?.obtainStyledAttributes(attrs, R.styleable.VarietyImageView)
        if (ta != null) {
            mShape = ta.getInt(R.styleable.VarietyImageView_variety_style, -1)
            ta.recycle()
        }
        mPath = Path()
    }

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
        mX = w / 2.toFloat()
        mY = h / 2.toFloat()
        //以宽高较小的作为控件宽高
        mRadius = Math.min(mX, mY)
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        if (mShape == -1 || mShape == CORNERS) {
            //未设置使用默认样式
            return
        }
        val side = Math.min(MeasureSpec.getSize(widthMeasureSpec), MeasureSpec.getSize(heightMeasureSpec))
        setMeasuredDimension(side, side)
    }

    override fun onDraw(canvas: Canvas) {
        if (mShape != -1) {
            mPath.reset()
            //设置样式
            when (mShape) {
                CIRCLE -> PathUtils.createCirclePath(mPath, mX, mY, mRadius, canvas)
                CORNERS -> PathUtils.createCornersPath(mPath, mX, mY, mRadius, mCorners, canvas)
                TRIANGLE -> PathUtils.createTrianglePath(mPath, mX, mY, canvas)
                PENTAGON -> PathUtils.createPentagonPath(mPath, mX, mY, canvas)
                HEXAGON -> PathUtils.createHexagonPath(mPath, mX, mY, canvas)
                OCTAGON -> PathUtils.createOctagonPath(mPath, mX, mY, canvas)
            }
            for (i in 1..10) {

            }
            for (i in 10 downTo 1) {

            }
            for (m in 1..10 step 2) {

            }
            for (n in 1 until 10) {

            }
        }
        super.onDraw(canvas)
    }

    /**
     * 设置图片形状
     */
    fun setImageViewShape(@STYLE shape: Int) {
        mShape = shape
    }

    /**
     * 设置图片圆角
     */
    fun setImageViewCorners(corner: Int) {
        mCorners = corner
    }

    /**
     * 自定义路径
     */
    fun setPath(path: Path) {
        mPath = path
    }

    @IntDef(CIRCLE, CORNERS, TRIANGLE, PENTAGON, HEXAGON, OCTAGON)
    @Retention(AnnotationRetention.SOURCE)
    annotation class STYLE

    fun VarietyImageView.showLongToast(msg:String){

    }
}