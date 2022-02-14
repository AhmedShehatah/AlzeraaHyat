package com.creativa.alzeraahyat.view.fragments

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.creativa.alzeraahyat.R
import com.creativa.alzeraahyat.databinding.FragmentLoginBinding


class LoginFragment : BaseFragment<FragmentLoginBinding>() {
    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentLoginBinding
        get() = FragmentLoginBinding::inflate
    private lateinit var navController: NavController
    override fun setupOnViewCreated(view: View) {
        navController = Navigation.findNavController(view)
        binding.btnLogin.setOnClickListener {
            navController.navigate(R.id.action_loginFragment_to_fragmentTypesOfCourses)
        }
    }
}