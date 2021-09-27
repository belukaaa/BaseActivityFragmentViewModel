package com.leavingston.baseactivityfragmentviewmodel.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.leavingston.baseactivityfragmentviewmodel.R
import com.leavingston.baseactivityfragmentviewmodel.activities.baseActivity.BaseActivity
import com.leavingston.baseactivityfragmentviewmodel.databinding.SecondActivityBinding
import com.leavingston.baseactivityfragmentviewmodel.fragments.SecondFragment
import kotlinx.android.synthetic.main.second_activity.view.*

class SecondActivity : BaseActivity<SecondActivityBinding>() {

    override val navHost: Int
        get() = R.id.login_nav_host

    override fun getViewBinding(): SecondActivityBinding {
        return SecondActivityBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        openNewFragment(SecondFragment())
    }


}