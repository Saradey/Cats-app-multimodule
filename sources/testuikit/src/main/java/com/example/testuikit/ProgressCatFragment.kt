package com.example.testuikit

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_progress_cat.*

class ProgressCatFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_progress_cat, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        prgCat.startAnimation()
    }
}