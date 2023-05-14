package com.example.deviz.extension

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.widget.ImageView

fun ImageView.scaleDown(
    scaleX: Float = 0.7f,
    scaleY: Float = 0.7f,
    duration: Long = 1000
) {
    val scaleDownX = ObjectAnimator.ofFloat(this, "scaleX", scaleX).apply {
        this.duration = duration
    }
    val scaleDownY = ObjectAnimator.ofFloat(this, "scaleY", scaleY).apply {
        this.duration = duration
    }
    val scaleDown = AnimatorSet()
    scaleDown.play(scaleDownX).with(scaleDownY)
    scaleDown.start()
}