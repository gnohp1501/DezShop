package com.example.deviz.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.viewbinding.ViewBinding

open class BaseFragment<VB : ViewBinding>
    (
    private val bindingInflater: (LayoutInflater) -> VB
) : Fragment() {

    lateinit var navController: NavController

    private var _binding: VB? = null
    open val binding: VB
        get() = _binding as VB

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        _binding = bindingInflater.invoke(inflater)
        _binding?.let {
            return it.root
        } ?: throw IllegalArgumentException("Binding variable is null")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}