package com.example.fragmenthandling

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


/**
 * Observe Lifecycle of Fragment with activity
 * Associated files :-
        * Fragment1
        * activity_main.xml
        * f_frag1.xml
 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}