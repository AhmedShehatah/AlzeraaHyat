package com.creativa.alzeraahyat.adapters

import android.view.View
import com.creativa.alzeraahyat.R
import com.creativa.alzeraahyat.databinding.CourseGalleryBinding
import com.creativa.alzeraahyat.databinding.CourseInfoBinding
import com.creativa.alzeraahyat.databinding.GalleryModelBinding
import com.creativa.alzeraahyat.databinding.TrainerInfoBinding
import com.squareup.picasso.Picasso
import com.xwray.groupie.GroupieAdapter
import com.xwray.groupie.viewbinding.BindableItem

class CoursesDetailsAdapter {
    class CourseDetails : BindableItem<CourseInfoBinding>() {
        override fun bind(holder: CourseInfoBinding, p1: Int) {

        }

        override fun getLayout(): Int = R.layout.course_info

        override fun initializeViewBinding(p0: View): CourseInfoBinding {
            return CourseInfoBinding.bind(p0)
        }
    }

    class TrainerDetails : BindableItem<TrainerInfoBinding>() {
        override fun bind(holder: TrainerInfoBinding, p1: Int) {

        }

        override fun getLayout(): Int = R.layout.trainer_info

        override fun initializeViewBinding(p0: View): TrainerInfoBinding {
            return TrainerInfoBinding.bind(p0)
        }
    }

    class GalleryDetails : BindableItem<CourseGalleryBinding>() {
        override fun bind(holder: CourseGalleryBinding, p1: Int) {
            val adapter = GroupieAdapter()
            adapter.add(GalleryModel())
            adapter.add(GalleryModel())
            adapter.add(GalleryModel())
            holder.rvGallery.adapter = adapter

        }

        override fun getLayout(): Int = R.layout.course_gallery

        override fun initializeViewBinding(p0: View): CourseGalleryBinding {
            return CourseGalleryBinding.bind(p0)
        }
    }

    class GalleryModel : BindableItem<GalleryModelBinding>() {
        override fun bind(holder: GalleryModelBinding, p1: Int) {
//            Picasso.get().load(R.drawable.ic_land).into(holder.avatar)
        }

        override fun getLayout(): Int = R.layout.gallery_model
        override fun initializeViewBinding(p0: View): GalleryModelBinding {
            return GalleryModelBinding.bind(p0)
        }
    }

}