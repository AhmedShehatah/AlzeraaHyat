package com.creativa.alzeraahyat

import android.view.View
import com.creativa.alzeraahyat.databinding.CourseGalleryBinding
import com.creativa.alzeraahyat.databinding.CourseInfoBinding
import com.creativa.alzeraahyat.databinding.TrainerInfoBinding
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

        }

        override fun getLayout(): Int = R.layout.course_gallery

        override fun initializeViewBinding(p0: View): CourseGalleryBinding {
            return CourseGalleryBinding.bind(p0)
        }
    }

}