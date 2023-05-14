package com.example.deviz.ui.splash

import android.os.Bundle
import android.view.View
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.deviz.R
import com.example.deviz.base.BaseFragment
import com.example.deviz.databinding.ScreenSplashBinding
import com.example.deviz.extension.navigateWithAnim
import com.example.deviz.extension.scaleDown
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashScreen : BaseFragment<ScreenSplashBinding>(ScreenSplashBinding::inflate) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.logo.scaleDown()

        viewLifecycleOwner.lifecycleScope.launch {
            binding.progressBar.visibility = View.VISIBLE
            delay(2000)
            findNavController().navigateWithAnim(R.id.nav_first_run)
        }

        super.onViewCreated(view, savedInstanceState)
    }

}