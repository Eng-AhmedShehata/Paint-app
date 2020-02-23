package com.ashehata.paintapp.customCanvas

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import android.view.View

class Canvas(context: Context, attri: AttributeSet?) : View(context, attri) {

    val paint = Paint()
    private val path = Path()

    init {
        paint.apply {
            isAntiAlias = true
            color = Color.RED
            strokeJoin = Paint.Join.ROUND
            style = Paint.Style.STROKE
            strokeWidth = 8F

        }
    }
    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        canvas.drawPath(path, paint)

    }

    override fun dispatchTouchEvent(event: MotionEvent): Boolean {
        val x = event.x
        val y = event.y

        Log.v("canvas", "touched")
        when (event.action) {
            MotionEvent.ACTION_DOWN -> path.moveTo(x, y)
            MotionEvent.ACTION_MOVE -> path.lineTo(x, y)
            else -> return false
        }
        invalidate()
        return true
    }
}