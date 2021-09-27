package com.leavingston.baseactivityfragmentviewmodel.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.leavingston.baseactivityfragmentviewmodel.databinding.SecondFragmentBinding
import com.leavingston.baseactivityfragmentviewmodel.fragments.baseFragment.BaseFragment
import com.leavingston.baseactivityfragmentviewmodel.viewmodels.ViewModelFirst
import org.koin.androidx.viewmodel.ext.android.viewModel
import java.util.*

class SecondFragment : BaseFragment<SecondFragmentBinding>() {

    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> SecondFragmentBinding
        get() = SecondFragmentBinding::inflate


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.secondFragmentTextView.text = firstViewModel.secondFragment

        binding.secondFragmentTextView.setOnClickListener {
            firstViewModel.newToastMessage("Second fragment has been SHOWN 2")
            firstViewModel.toastMessage.observe(viewLifecycleOwner, androidx.lifecycle.Observer {
                Toast.makeText(requireContext(), it, Toast.LENGTH_SHORT).show()
            })
            openFragmentListener?.openNewFragment(Fragment())
        }
    }
}