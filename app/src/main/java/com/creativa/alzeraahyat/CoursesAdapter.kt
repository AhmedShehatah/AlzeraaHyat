package com.creativa.alzeraahyat

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.creativa.alzeraahyat.databinding.ItemCourseBinding

class CoursesAdapter(private val list: ArrayList<Course>) :
    RecyclerView.Adapter<CoursesAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoursesAdapter.ViewHolder {
        return ViewHolder(
            ItemCourseBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = list[position]

        holder.courseName.text = item.name
        holder.courseTeacher.text = item.teacher
        holder.courseTime.text = item.time
        holder.itemView.setOnClickListener {
            it.findNavController().navigate(R.id.action_coursesFragment_to_fragmentCourseDetails)
        }

    }

    override fun getItemCount(): Int {
        return list.size
    }

    class ViewHolder(val binding: ItemCourseBinding) : RecyclerView.ViewHolder(binding.root) {
        val image = binding.imageView
        val courseName = binding.tvCourseName
        val courseTeacher = binding.tvCourseTeacher
        val courseTime = binding.tvCourseTime
    }


}