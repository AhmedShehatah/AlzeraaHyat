package com.creativa.alzeraahyat.view.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.creativa.alzeraahyat.adapters.CoursesAdapter
import com.creativa.alzeraahyat.databinding.FragmentCoursesBinding
import com.creativa.alzeraahyat.models.Course

class CoursesFragment : BaseFragment<FragmentCoursesBinding>() {
    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentCoursesBinding
        get() = FragmentCoursesBinding::inflate
    private lateinit var navController: NavController
    override fun setupOnViewCreated(view: View) {
        navController = Navigation.findNavController(view)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val list = ArrayList<Course>()

        for (i in 1..5) {
            list.add(Course("", "Name", "Teacher", "5 hours"))
        }

        val adapter = CoursesAdapter(list)
        binding.recyclerView.adapter = adapter


    }
}