package com.example.wordsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class problemActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problem)
        val textView:TextView=findViewById<TextView>(R.id.single_problem)
        val beginstr =intent?.extras?.getString(DetailActivity.SINGPROBLEM).toString()
        val problem=resources.getStringArray(R.array.problems).toList().
                filter { it.startsWith(beginstr) }.take(1)
        var descrip="抱歉，目前还未更新相应的题目"
        if (problem.size==1){
            descrip=problem[0]
        }
        textView.text=descrip
    }
}