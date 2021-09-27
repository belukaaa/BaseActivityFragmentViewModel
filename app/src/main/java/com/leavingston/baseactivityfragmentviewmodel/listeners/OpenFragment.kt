package com.leavingston.baseactivityfragmentviewmodel.listeners

import androidx.fragment.app.Fragment

interface OpenFragment {
    fun openNewFragment(fragment: Fragment, toBackStack: Boolean = true)
}