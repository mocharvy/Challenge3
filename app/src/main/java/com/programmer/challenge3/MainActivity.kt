package com.programmer.challenge3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fm = supportFragmentManager
        val fragment = fm.findFragmentByTag(BlankFragment::class.java.simpleName)

        if (fragment !is BlankFragment) {
            fm.beginTransaction()
            .replace(R.id.fragmentContrainerView,BlankFragment())
            .commit()

        }
        }

    }
