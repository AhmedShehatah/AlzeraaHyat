package com.creativa.alzeraahyat.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.creativa.alzeraahyat.R
import com.creativa.alzeraahyat.databinding.TypesModelBinding
import com.creativa.alzeraahyat.models.CoursesType

class TypesOfCoursesAdapter(private val list: ArrayList<CoursesType>) :
    RecyclerView.Adapter<TypesOfCoursesAdapter.ViewHolder>() {
    inner class ViewHolder(binding: TypesModelBinding) : RecyclerView.ViewHolder(binding.root) {
        val text = binding.textView
        val root = binding.root
        val image = binding.imageView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            TypesModelBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = list[position]
        holder.text.text = item.name
        holder.image.setImageResource(item.image)
        if (position == 1)
            holder.root.setOnClickListener {
                it.findNavController()
                    .navigate(R.id.action_fragmentTypesOfCourses_to_coursesFragment)
            }
        else holder.root.setOnClickListener {
            Toast.makeText(
                holder.root.context,
                "Coming soon",
                Toast.LENGTH_SHORT
            ).show()
        }

    }

    override fun getItemCount(): Int = list.size
}