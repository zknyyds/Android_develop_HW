package com.bluixe.lecture3

import android.animation.Animator
import android.animation.AnimatorInflater
import android.animation.AnimatorListenerAdapter
import android.animation.AnimatorSet
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.core.animation.addListener

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val animator = AnimatorInflater.loadAnimator(this, R.animator.like)
        val animator1 = AnimatorInflater.loadAnimator(this, R.animator.like_step1)
        val animator2 = AnimatorInflater.loadAnimator(this, R.animator.like_step2)
        val animator3 = AnimatorInflater.loadAnimator(this, R.animator.like_step3)
        val animatorSet = AnimatorSet()
        animator.setTarget(findViewById(R.id.like))
        val like = findViewById<ImageView>(R.id.like)
        val coin = findViewById<ImageView>(R.id.coin)
        val store = findViewById<ImageView>(R.id.store)
        animator.addListener(object:AnimatorListenerAdapter() {
            override fun onAnimationEnd(animation: Animator?) {
                super.onAnimationEnd(animation)
                like.setColorFilter(Color.RED)
                coin.setColorFilter(Color.RED)
                store.setColorFilter(Color.RED)

            }
        })
        animator.start()
    }

}