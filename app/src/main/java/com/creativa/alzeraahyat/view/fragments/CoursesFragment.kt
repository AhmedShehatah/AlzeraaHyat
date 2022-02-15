package com.creativa.alzeraahyat.view.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.creativa.alzeraahyat.R
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

        list.add(Course(R.drawable.farm1, "دورة زراعة الصوبة الزراعية", "اسلام", "5hours"))
        list.add(Course(R.drawable.farm2, "دورة شبكات الري", "اسلام", "5hours"))
        list.add(Course(R.drawable.farm3, "دورة التغذية والأعلاف", "اسلام", "5hours"))
        list.add(Course(R.drawable.farm4, "دورة تخطيط وتنسيق الحدائق والمتزهات", "اسلام", "5hours"))
        list.add(Course(R.drawable.farm6, "دورة المهارات الادارية للمهندسين الزرعايين والفنيين", "اسلام", "5hours"))
        list.add(Course(R.drawable.farm5, "دورة المكافجة البيلوجية للافات الحشرية", "اسلام", "5hours"))
        list.add(Course(R.drawable.farm7, "دورة استصلاح الاراضي  الزراعية", "اسلام", "5hours"))

        val adapter = CoursesAdapter(list)
        binding.recyclerView.adapter = adapter


    }
}