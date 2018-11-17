package com.example.l.commoncomponent.widget.views.varietyiv

import android.graphics.Canvas
import android.graphics.Path
import com.example.l.commoncomponent.APP_TAG

/**
 * @author $汪金龙$
 * @desc 创建path路径
 * @date 2018/11/5 9:15
 */
class PathUtils {
    companion object {
        /**
         * 创建圆形路径
         */
        fun createCirclePath(path: Path, x: Float, y: Float, radius: Float, canvas: Canvas) {
            path.addCircle(x, y, radius, Path.Direction.CW)
            canvas.clipPath(path)
        }

        /**
         * 创建圆角路径
         */
        fun createCornersPath(path: Path, x: Float, y: Float, radius: Float, corners: Int, canvas: Canvas) {
            canvas.clipPath(path)
        }

        /**
         * 创建三角形路径
         */
        fun createTrianglePath(path: Path, x: Float, y: Float, canvas: Canvas) {
            path.moveTo(x, 0f)
            path.lineTo(x * 2, y * 2)
            path.lineTo(0f, y * 2)
            path.close()
            canvas.clipPath(path)
        }

        /**
         * 创建五边形路径
         */
        fun createPentagonPath(path: Path, x: Float, y: Float, canvas: Canvas) {
            //边长
            val side = (x / Math.cos(Math.PI / 5)).toFloat()
            path.moveTo(x, 0f)
            path.lineTo(x * 2, (x * Math.tan(Math.PI / 5)).toFloat())
            path.lineTo(x + side / 2, y * 2)
            path.lineTo(x - side / 2, y * 2)
            path.lineTo(0f, (x * Math.tan(Math.PI / 5)).toFloat())
            path.close()
            canvas.clipPath(path)
        }

        /**
         * 创建六边形路径
         */
        fun createHexagonPath(path: Path, x: Float, y: Float, canvas: Canvas) {
            path.moveTo(x, 0f)
            path.lineTo((x + x * Math.cos(Math.PI / 6)).toFloat(), x / 2)
            path.lineTo((x + x * Math.cos(Math.PI / 6)).toFloat(), x / 2 + y)
            path.lineTo(x, y * 2)
            path.lineTo((x - x * Math.cos(Math.PI / 6)).toFloat(), x / 2 + y)
            path.lineTo((x - x * Math.cos(Math.PI / 6)).toFloat(), x / 2)
            path.close()
            canvas.clipPath(path)
        }

        /**
         * 创建八边形路径
         */
        fun createOctagonPath(path: Path, x: Float, y: Float, canvas: Canvas) {
            val restSide = (Math.tan(Math.PI / 8) * x / (1 + Math.tan(Math.PI / 8))).toFloat()
            path.moveTo(x, 0f)
            path.lineTo(2 * x - restSide, restSide)
            path.lineTo(x * 2, y)
            path.lineTo(2 * x - restSide, 2 * y - restSide)
            path.lineTo(x, y * 2)
            path.lineTo(restSide, y * 2 - restSide)
            path.lineTo(0f, y)
            path.lineTo(restSide, restSide)
            path.close()
            canvas.clipPath(path)
        }
    }
}
