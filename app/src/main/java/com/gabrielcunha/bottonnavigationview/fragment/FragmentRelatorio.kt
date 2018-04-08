package com.gabrielcunha.bottonnavigationview.fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gabrielcunha.bottonnavigationview.R

/**
 * Created by GABRIEL on 05/04/2018.
 */

class FragmentRelatorio : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        var rootView = inflater!!.inflate(R.layout.fragment_relatorio, container, false)
        return rootView
    }
}