package com.sliie.components.base

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment

abstract class BaseFragment(layout: Int) : Fragment(layout),
    View.OnClickListener {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViews()
        setupListener()
        setupToolbar()
        setupBackStackEntry()
        setupObserveData()
    }

    open fun setupViews() {}

    open fun setupToolbar() {
    }

    open fun setupBackStackEntry() {}

    open fun setupObserveData() {}

    open fun setupListener() {}

    override fun onClick(v: View?) {
    }

    protected fun onClickListeners(vararg views: View) {
        for (view in views)
            view.setOnClickListener(this)
    }

}