package com.example.deviz.extension

import androidx.navigation.NavController
import androidx.navigation.navOptions
import com.example.deviz.R

fun NavController.navigateWithAnim(navId: Int) {
    val options = navOptions {
        anim {
            enter = R.anim.slide_in_right
            exit = R.anim.slide_out_left
            popEnter = R.anim.slide_in_left
            popExit = R.anim.slide_out_right
        }
    }
    this.navigate(navId, null, options)
}