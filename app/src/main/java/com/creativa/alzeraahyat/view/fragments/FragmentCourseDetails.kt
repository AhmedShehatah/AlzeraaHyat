package com.creativa.alzeraahyat.view.fragments

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.creativa.alzeraahyat.databinding.FragmentCourseDetialsBinding
import com.creativa.alzeraahyat.view.fragments.BaseFragment

class FragmentCourseDetails : BaseFragment<FragmentCourseDetialsBinding>() {
    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentCourseDetialsBinding
        get() = FragmentCourseDetialsBinding::inflate
    private lateinit var navController: NavController
    override fun setupOnViewCreated(view: View) {
        navController = Navigation.findNavController(view)
    }
}