package com.creativa.alzeraahyat.view.fragments

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.GridLayoutManager
import com.creativa.alzeraahyat.R
import com.creativa.alzeraahyat.adapters.TypesOfCoursesAdapter
import com.creativa.alzeraahyat.databinding.FragmentTypesOfCoursesBinding
import com.creativa.alzeraahyat.models.CoursesType


class FragmentTypesOfCourses : BaseFragment<FragmentTypesOfCoursesBinding>() {
    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentTypesOfCoursesBinding
        get() = FragmentTypesOfCoursesBinding::inflate
    private lateinit var navController: NavController

    override fun setupOnViewCreated(view: View) {
        navController = Navigation.findNavController(view)
        binding.rvTypes.layoutManager = GridLayoutManager(requireContext(), 2)
        val list = ArrayList<CoursesType>()
        list.add(CoursesType("اونلاين", R.drawable.ic_baseline_laptop_mac_24))
        list.add(CoursesType("عملي", R.drawable.ic_icon2))
        list.add(CoursesType("الاختبارات", R.drawable.ic_test))
        list.add(CoursesType("المسار التعليمي", R.drawable.ic_baseline_menu_book_24))
        binding.rvTypes.adapter = TypesOfCoursesAdapter(list)
    }
}