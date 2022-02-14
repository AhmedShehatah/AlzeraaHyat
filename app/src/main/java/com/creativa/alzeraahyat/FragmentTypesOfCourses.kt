package com.creativa.alzeraahyat

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.GridLayoutManager
import com.creativa.alzeraahyat.databinding.FragmentTypesOfCoursesBinding


class FragmentTypesOfCourses : BaseFragment<FragmentTypesOfCoursesBinding>() {
    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentTypesOfCoursesBinding
        get() = FragmentTypesOfCoursesBinding::inflate
    private lateinit var navController: NavController

    override fun setupOnViewCreated(view: View) {
        navController = Navigation.findNavController(view)
        binding.rvTypes.layoutManager = GridLayoutManager(requireContext(), 2)
        val list = ArrayList<String>()
        list.add("اونلاين")
        list.add("عملي")
        list.add("الاختبارات")
        list.add("المسار التعليمي")
        binding.rvTypes.adapter = TypesOfCoursesAdapter(list)
    }
}