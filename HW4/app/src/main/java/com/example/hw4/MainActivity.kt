package com.example.hw4

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Looper
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.hw4.R
import com.example.hw4.TimeConsumeInterceptor
import com.example.hw4.api.dataBean
import com.example.translator.api.AppService
import com.example.translator.api.*
import okhttp3.Call
import okhttp3.EventListener
import okhttp3.OkHttpClient
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import okhttp3.*
import java.lang.StringBuilder
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    private var requestBtn: Button? = null
    private var showText: TextView? = null
    private var editView: EditText?=null
    private val okhttpListener = object : EventListener() {
        @SuppressLint("SetTextI18n")
        override fun dnsStart(call: Call, domainName: String) {
            super.dnsStart(call, domainName)
            updateShowTextView("\nDns Search: $domainName")
        }

        @SuppressLint("SetTextI18n")
        override fun responseBodyStart(call: Call) {
            super.responseBodyStart(call)
            updateShowTextView("\nResponse Start")
        }
    }

    private val client: OkHttpClient = OkHttpClient.Builder()
        .addInterceptor(TimeConsumeInterceptor())
        .eventListener(okhttpListener)
        .build()

    private var retrofit = Retrofit.Builder()
        .baseUrl("https://dict.youdao.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .client(client)
        .build()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        requestBtn = findViewById(R.id.button)
        showText = findViewById(R.id.tv)
        editView=findViewById(R.id.et)
        requestBtn?.setOnClickListener {
            updateShowTextView("", false)
            click()
        }
    }

    @SuppressLint("SetTextI18n")



    private fun updateShowTextView(text: String, append: Boolean =false) {
        if (Looper.getMainLooper() !== Looper.myLooper()) {
            // 子线程，提交到主线程中去更新 UI.
            runOnUiThread {
                updateShowTextView(text, append)
            }
        } else {
            showText?.text = if (append) showText?.text.toString() + text else text
        }
    }

    private fun request(word:String,callback: Callback<dataBean>) {
        try {
            val appService = retrofit.create(AppService::class.java)
            appService.getdata(word).enqueue(callback)
        } catch (error: Throwable) {
            updateShowTextView("request err: ${error.message}", false)
            error.printStackTrace()
        }
    }

    private fun click() {
        var word:String?= editView?.text.toString()
        if(word!=null){
            request(word, object : Callback<dataBean> {
                @SuppressLint("SetTextI18n")
                override fun onResponse(
                    call: retrofit2.Call<dataBean>,
                    response: Response<dataBean>
                ) {
                    val respFormatText = if (response.isSuccessful) {
                        val shuju:dataBean? = response.body()
//                        val translation_list= shuju?.web_trans?.webtranslation?.get(0)?.trans
                        val translation_list=shuju?.web_trans?.webtranslation
                        val res:StringBuilder= StringBuilder()
                        var count=0

                        for(i in (0 until translation_list?.size!!)){
                            for(j in translation_list?.get(i).trans){
//                                res.append("[${i+1}]:"+translation_list[i].value+'\n')
                                count+=1
                                res.append("[${count}:]  ${j.value}\n")
                                if(count>=5) break
                            }
                            if(count>=5) break
                        }
//                        for(i in (0 until translation_list?.size!!)){
//                            res.append("[${i+1}]:"+translation_list[i].value+'\n')
//                        }
                        Log.d("输出结果：",res.toString())
                        "This is ${shuju?.lang}  language. \nIt's meaning is that\n"+res.toString()

                    } else {
                        "查询没有结果;"
                    }
                    updateShowTextView(respFormatText)
                }

                override fun onFailure(call: retrofit2.Call<dataBean>, t: Throwable) {
                    updateShowTextView(t.message.toString(), false)
                }
            })
        }

    }
}