package com.example.deviz.ui.introduce

import android.os.Bundle
import android.view.View
import androidx.cardview.widget.CardView
import androidx.viewpager2.widget.ViewPager2
import com.example.deviz.R
import com.example.deviz.adapter.ViewPagerAdapter
import com.example.deviz.base.BaseFragment
import com.example.deviz.databinding.ButtonLargeBinding
import com.example.deviz.databinding.ScreenIntroduceBinding
import com.example.deviz.ui.customview.IButtonLargeCallback

class IntroduceScreen : BaseFragment<ScreenIntroduceBinding>(ScreenIntroduceBinding::inflate) {

    private var hashmap: HashMap<Int, CardView> = hashMapOf()
    private var resource = context?.resources

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        hashmap = hashMapOf(0 to binding.cv1, 1 to binding.cv2, 2 to binding.cv3)
        resource = context?.resources
        binding.intro.adapter = ViewPagerAdapter()

        binding.nextButton.onClick(
            object : IButtonLargeCallback {
                override fun onClick() {
                    buttonNextClick()
                }
            }
        )

        binding.getStartedButton.onClick(
            object : IButtonLargeCallback {
                override fun onClick() {
                    buttonGetStartedClick()
                }
            }
        )

        binding.intro.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageScrolled(
                position: Int, positionOffset: Float, positionOffsetPixels: Int
            ) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels)
                changeIndicator()
            }

            override fun onPageScrollStateChanged(state: Int) {
                super.onPageScrollStateChanged(state)
                changeIndicator()
            }
        })
    }

    fun changeIndicator() {
        for (i in hashmap.keys) {
            val params = hashmap[i]?.layoutParams
            if (i == binding.intro.currentItem) {
                hashmap[i]?.setCardBackgroundColor(resource?.getColor(R.color.black) ?: 0)
            } else {
                hashmap[i]?.setCardBackgroundColor(resource?.getColor(R.color.silver) ?: 0)
            }
            hashmap[i]?.layoutParams = params
        }
    }

    private fun buttonNextClick() {
        binding.intro.currentItem = binding.intro.currentItem + 1
        if (binding.intro.currentItem == 2) {
            binding.nextButton.visibility = View.GONE
            binding.getStartedButton.visibility = View.VISIBLE
        }
    }

    private fun buttonGetStartedClick() {}

}