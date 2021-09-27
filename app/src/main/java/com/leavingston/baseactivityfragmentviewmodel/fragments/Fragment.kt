package com.leavingston.baseactivityfragmentviewmodel.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.lifecycle.Observer
import com.leavingston.baseactivityfragmentviewmodel.activities.SecondActivity
import com.leavingston.baseactivityfragmentviewmodel.databinding.FragmentMainBinding
import com.leavingston.baseactivityfragmentviewmodel.fragments.baseFragment.BaseFragment
import com.leavingston.baseactivityfragmentviewmodel.viewmodels.ViewModelFirst
import org.koin.androidx.viewmodel.ext.android.viewModel

class Fragment : BaseFragment<FragmentMainBinding>() {



    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentMainBinding
        get() = FragmentMainBinding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.FragmentTextView.text = firstViewModel.firstFragment

//            changeFragment()

        binding.FragmentTextView.setOnClickListener {

            firstViewModel.newToastMessage("First fragment has been SHOWN 1")
            firstViewModel.toastMessage.observe(viewLifecycleOwner, Observer {
                Toast.makeText(requireContext() , it , Toast.LENGTH_SHORT).show()
            })
            changeFragment()



        }


    }

    private fun changeFragment(){
        openFragmentListener?.openNewFragment(SecondFragment() )
    }


}