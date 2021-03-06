package com.gabrielcunha.bottonnavigationview.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import com.gabrielcunha.bottonnavigationview.R

/**
 * Created by GABRIEL on 04/04/2018.
 */

class FragmentHome : Fragment () {

    /**
     * Inicializa newInstance para passar parametros
     */
    companion object {
        fun newInstance() : FragmentHome{
            var fragmentHome = FragmentHome()
            var args = Bundle()

            fragmentHome.arguments = args
            return fragmentHome
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var rootView = inflater!!.inflate(R.layout.fragment_home, container, false)
        return rootView
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var editTextHome = view!!.findViewById<EditText>(R.id.etHome) as EditText
    }
}