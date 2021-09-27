package com.leavingston.baseactivityfragmentviewmodel.activities

import android.os.Bundle
import com.leavingston.baseactivityfragmentviewmodel.R
import com.leavingston.baseactivityfragmentviewmodel.activities.baseActivity.BaseActivity
import com.leavingston.baseactivityfragmentviewmodel.databinding.ActivityMainBinding
import com.leavingston.baseactivityfragmentviewmodel.fragments.Fragment
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override val navHost: Int
        get() = R.id.login_nav_host

    override fun getViewBinding(): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

            openNewFragment(Fragment())

    }





}