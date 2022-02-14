package com.creativa.alzeraahyat

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.creativa.alzeraahyat.databinding.TypesModelBinding

class TypesOfCoursesAdapter(private val list: ArrayList<String>) :
    RecyclerView.Adapter<TypesOfCoursesAdapter.ViewHolder>() {
    inner class ViewHolder(binding: TypesModelBinding) : RecyclerView.ViewHolder(binding.root) {
        val text = binding.textView

        val root = binding.root

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
        holder.text.text = item

        holder.root.setOnClickListener {
                it.findNavController().navigate(R.id.action_fragmentTypesOfCourses_to_coursesFragment)
        }


    }

    override fun getItemCount(): Int = list.size
}