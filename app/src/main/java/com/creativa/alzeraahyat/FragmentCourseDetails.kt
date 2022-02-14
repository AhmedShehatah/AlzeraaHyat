package com.creativa.alzeraahyat

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.creativa.alzeraahyat.databinding.FragmentCourseDetialsBinding
import com.xwray.groupie.GroupieAdapter

class FragmentCourseDetails : BaseFragment<FragmentCourseDetialsBinding>() {
    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentCourseDetialsBinding
        get() = FragmentCourseDetialsBinding::inflate
    private lateinit var navController: NavController
    override fun setupOnViewCreated(view: View) {
        navController = Navigation.findNavController(view)
        val adapter = GroupieAdapter()
        adapter.add(CoursesDetailsAdapter.CourseDetails())
        adapter.add(CoursesDetailsAdapter.TrainerDetails())
        adapter.add(CoursesDetailsAdapter.GalleryDetails())
        binding.rvCoursesDetails.adapter = adapter

    }
}