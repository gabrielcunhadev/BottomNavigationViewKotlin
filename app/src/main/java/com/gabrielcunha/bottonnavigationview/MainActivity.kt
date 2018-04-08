package com.gabrielcunha.bottonnavigationview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.view.MenuItem
import android.widget.FrameLayout
import com.gabrielcunha.bottonnavigationview.fragment.FragmentTransacao
import com.gabrielcunha.bottonnavigationview.fragment.FragmentHome
import com.gabrielcunha.bottonnavigationview.fragment.FragmentRelatorio

class MainActivity : AppCompatActivity() {

    private var content: FrameLayout? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        content = findViewById<FrameLayout>(R.id.content)

        val navigation = findViewById<BottomNavigationView>(R.id.navigation)
        navigation.setOnNavigationItemSelectedListener (object : BottomNavigationView.OnNavigationItemSelectedListener {

            override fun onNavigationItemSelected(item: MenuItem): Boolean {
                when (item.itemId) {
                    R.id.nav_home -> {
                        val fragment = FragmentHome.Companion.newInstance()
                        addFragment(fragment)

                        return true
                    }
                    R.id.nav_transacoes -> {
                        val fragment = FragmentTransacao()
                        addFragment(fragment)

                        return true
                    }
                    R.id.nav_relatorios -> {
                        var fragment = FragmentRelatorio()
                        addFragment(fragment)

                        return true
                    }
                }
                return false
            }
        })

        val fragment = FragmentHome.Companion.newInstance()
        addFragment(fragment)
    }



    private fun addFragment(fragment : Fragment) {
        supportFragmentManager
                .beginTransaction()
                .setCustomAnimations(R.anim.design_bottom_sheet_slide_in, R.anim.design_bottom_sheet_slide_out)
                .replace(R.id.content, fragment, fragment.javaClass.simpleName)
                .addToBackStack(fragment.javaClass.simpleName)
                .commit()
    }

}
