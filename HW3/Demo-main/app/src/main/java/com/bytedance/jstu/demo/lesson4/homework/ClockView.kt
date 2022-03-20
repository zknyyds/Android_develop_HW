package com.bytedance.jstu.demo.lesson4.homework

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.os.Handler
import android.util.AttributeSet
import android.view.View
import com.bytedance.jstu.demo.R
import java.util.*


class ClockView : View {
    private var mPaint: Paint? = null
    /**
     * 描边线的粗细
     */
    private val strokeWidth = 3

    /**
     * 时钟是否在走（即是否第一次onDraw）
     */
    private var isRunning = false
    private var mHandler: Handler? = null
    private var clockRunnable: Runnable? = null

    /**
     * 时钟圆的半径
     */
    private val radius = 500
    private val clockNumbers =
        arrayOf("12", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11")

    /**
     * 时钟上需要绘制的数字
     */
    private var num: String? = null

    /**
     * 用于测量文本的宽、高度（这里主要是来获取高度）
     */
    private val textBounds = Rect()
    private var hour = 0
    private var min = 0
    private var second = 0
    private var hourAngle = 0f
    private var minAngle = 0f
    private var secAngle = 0f

    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {
        init()
    }

    constructor(context: Context?) : super(context) {
        init()
    }

    private fun init() {
        mPaint = Paint()
        mHandler = Handler()
        //		cal = Calendar.getInstance();
        clockRunnable = object : Runnable {
            //里面做的事情就是每隔一秒，刷新一次界面
            override fun run() {
                //线程中刷新界面
                postInvalidate()
                mHandler!!.postDelayed(this, 1000)
            }
        }
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        if (!isRunning) {
            runClock()
        } else {
            initPaint()
            //绘制圆形部分
            drawClockCircle(canvas)
            //绘制刻度线
            drawClockScale(canvas)
            //绘制数字
            drawClockNumber(canvas)
            //绘制中心原点
            drawClockDot(canvas)
            //绘制三个指针
            drawClockPoints(canvas)
        }
    }

    /**
     * 绘制三个指针
     * @param canvas
     */
    private fun drawClockPoints(canvas: Canvas) {
//        cal = Calendar.getInstance()
        hour = Calendar.getInstance().get(Calendar.HOUR) //Calendar.HOUR获取的是12小时制，Calendar.HOUR_OF_DAY获取的是24小时制
        min = Calendar.getInstance().get(Calendar.MINUTE)
        second = Calendar.getInstance().get(Calendar.SECOND)

        //计算时分秒指针各自需要偏移的角度
        hourAngle = hour.toFloat() / 12 * 360 + min.toFloat() / 60 * (360 / 12) //360/12是指每个数字之间的角度
        minAngle = min.toFloat() / 60 * 360
        secAngle = second.toFloat() / 60 * 360
        //下面将时、分、秒指针按照各自的偏移角度进行旋转，每次旋转前要先保存canvas的原始状态
        canvas.save()
        canvas.rotate(hourAngle, (width / 2).toFloat(), (height / 2).toFloat())
        canvas.drawLine(
            (width / 2).toFloat(),
            (height / 2).toFloat(),
            (width / 2).toFloat(),
            (height / 2 - 300).toFloat(),
            mPaint!!
        ) //时针长度设置为300
        canvas.restore()
        canvas.save()
        canvas.rotate(minAngle, (width / 2).toFloat(), (height / 2).toFloat())
        canvas.drawLine(
            (width / 2).toFloat(),
            (height / 2).toFloat(),
            (width / 2).toFloat(),
            (height / 2 -400).toFloat(),
            mPaint!!
        ) //分针长度设置为400
        canvas.restore()
        canvas.save()
        canvas.rotate(secAngle, (width / 2).toFloat(), (height / 2).toFloat())
        canvas.drawLine(
            (width / 2).toFloat(),
            (height / 2).toFloat(),
            (width / 2).toFloat(),
            (height / 2-470).toFloat(),
            mPaint!!
        ) //秒针长度设置为470
        canvas.restore()
    }

    /**
     * 绘制中心原点
     */
    private fun drawClockDot(canvas: Canvas) {
        mPaint!!.reset()
        //		mPaint.setAntiAlias(true);
        mPaint!!.color = Color.BLUE
        mPaint!!.style = Paint.Style.FILL
        canvas.drawCircle((width / 2).toFloat(), (height / 2).toFloat(), 10f, mPaint!!)
        initPaint()
    }

    /**
     * 绘制数字（从正上方12点处开始绘制）
     * @param canvas
     */
    private fun drawClockNumber(canvas: Canvas) {
        //先保存一下当前画布的状态，因为后面画布会进行旋转操作，而在绘制完刻度后，需要恢复画布状态
        canvas.save()
        //		mPaint.setStrokeWidth(2);
        mPaint!!.textSize = 100f
        //计算12点处 数字 的坐标
        val preX = width / 2
        val preY = height / 2 - radius - strokeWidth - 10 //10为圆与数字文本之间的间距
        //x，y才是文本真正的准确坐标，需要减去文本的自身宽、高因素
        var x: Int
        var y: Int
        //计算画布每次需要旋转的角度
        val degree = 360 / clockNumbers.size
        for (i in clockNumbers.indices) {
            num = clockNumbers[i]
            mPaint!!.getTextBounds(num, 0, num!!.length, textBounds)
            x = (preX - mPaint!!.measureText(num) / 2).toInt()
            y = preY - textBounds.height() //从文本的中心点处开始绘制
            canvas.drawText(num!!, x.toFloat(), y.toFloat(), mPaint!!)
            canvas.rotate(
                degree.toFloat(),
                (width / 2).toFloat(),
                (height / 2).toFloat()
            ) //以圆中心进行旋转
        }
        //绘制完后，记得把画布状态复原
        canvas.restore()
    }

    /**
     * 绘制刻度线（总共60条）
     * 从正上方，即12点处开始绘制一条直线，后面的只是旋转一下画布角度即可
     * @param canvas
     */
    private fun drawClockScale(canvas: Canvas) {
        //先保存一下当前画布的状态，因为后面画布会进行旋转操作，而在绘制完刻度后，需要恢复画布状态
        canvas.save()
        //计算12点处刻度的开始坐标
        val startX = width / 2
        val startY = height / 2 - radius //y坐标即园中心点的y坐标-半径
        //计算12点处的结束坐标
        val stopY1 = startY + 30 //整点处的线长度为30
        val stopY2 = startY + 15 //非整点处的线长度为15
        //计算画布每次旋转的角度
        val degree = (360 / 60).toFloat()
        for (i in 0..59) {
            if (i % 5 == 0) canvas.drawLine(
                startX.toFloat(), startY.toFloat(), startX.toFloat(), stopY1.toFloat(),
                mPaint!!
            ) //绘制整点长的刻度
            else canvas.drawLine(
                startX.toFloat(), startY.toFloat(), startX.toFloat(), stopY2.toFloat(),
                mPaint!!
            ) //绘制非整点处短的刻度
            canvas.rotate(degree, (width / 2).toFloat(), (height / 2).toFloat()) //以圆中心进行旋转
        }
        //绘制完后，记得把画布状态复原
        canvas.restore()
    }

    /**
     * 绘制时钟的圆形部分
     * @param canvas
     */
    private fun drawClockCircle(canvas: Canvas) {
        //获得圆的圆点坐标
        val x = width / 2
        val y = height / 2
        canvas.drawCircle(x.toFloat(), y.toFloat(), radius.toFloat(), mPaint!!)
    }

    private fun initPaint() {
        mPaint!!.reset()
        mPaint!!.color = Color.YELLOW
        mPaint!!.style = Paint.Style.STROKE //设置描边
        mPaint!!.strokeWidth = strokeWidth.toFloat() //设置描边线的粗细
        mPaint!!.isAntiAlias = true //设置抗锯齿，使圆形更加圆滑
    }

    private fun runClock() {
        isRunning = true
        mHandler!!.postDelayed(clockRunnable!!, 1000)
    }
}