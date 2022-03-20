package com.bytedance.jstu.demo.lesson4.homework

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bytedance.jstu.demo.R
import kotlinx.coroutines.delay
import java.util.Calendar
import kotlin.properties.Delegates

/**
 *  author : neo
 *  time   : 2021/10/30
 *  desc   :
 */
class ClockActivity : AppCompatActivity() {
    lateinit var clocktime :TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clock)
//        clocktime=findViewById<TextView>(R.id.clocktime)

    }

    private fun updatetime() {
        var hour = Calendar.getInstance().get(Calendar.HOUR) //Calendar.HOUR获取的是12小时制，Calendar.HOUR_OF_DAY获取的是24小时制
        var min = Calendar.getInstance().get(Calendar.MINUTE)
        var second = Calendar.getInstance().get(Calendar.SECOND)
        Log.i("lalla","{$hour}:{$min}:{$second}")
//        clocktime.text="{$hour}:{$min}:{$second}"
    }
}

