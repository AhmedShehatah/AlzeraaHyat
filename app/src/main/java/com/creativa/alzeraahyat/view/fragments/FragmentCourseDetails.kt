package com.creativa.alzeraahyat.view.fragments

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.creativa.alzeraahyat.adapters.CoursesDetailsAdapter
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
        binding.btnBook.setOnClickListener {

            val url = "https://forms.gle/AbAn4KwYhVUjiphv5"
            try {
                val uri: Uri = Uri.parse("googlechrome://navigate?url=$url")
                val i = Intent(Intent.ACTION_VIEW, uri)
                i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                startActivity(i)
            } catch (e: ActivityNotFoundException) {
                // Chrome is probably not installed
                Toast.makeText(requireContext(), "Error", Toast.LENGTH_SHORT).show()
            }

        }
    }

}