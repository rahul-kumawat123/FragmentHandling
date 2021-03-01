package com.example.fragmenthandling

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class Question2: AppCompatActivity() {
    private lateinit var fragmentManager: FragmentManager
    private lateinit var transaction: FragmentTransaction

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.question2)

        val fragment1 = Fragment1()
        val fragment2 = Fragment2()

        fragmentManager = supportFragmentManager
        transaction = fragmentManager.beginTransaction()
        transaction.add(R.id.fl_fragmentContainer,fragment1)
        transaction.commit()

        val btnAdd = findViewById<Button>(R.id.btn_add)
        val btnReplace = findViewById<Button>(R.id.btn_replace)
        val btnHide = findViewById<Button>(R.id.btn_hide)
        val btnShow = findViewById<Button>(R.id.btn_show)
        val btnRemove = findViewById<Button>(R.id.btn_remove)


        btnAdd.setOnClickListener{
            changeFragment(fragment2)
        }

        btnReplace.setOnClickListener{
           changeFragment(fragment1)
        }

        btnHide.setOnClickListener {
            val frag = fragmentManager.findFragmentById(R.id.fl_fragmentContainer)
            if (frag != null) {
                transaction =fragmentManager.beginTransaction()
                transaction.hide(frag)
                transaction.commit()
            }
        }

        btnShow.setOnClickListener {
            val frag = fragmentManager.findFragmentById(R.id.fl_fragmentContainer)
            if (frag != null) {
                transaction =fragmentManager.beginTransaction()
                transaction.show(frag)
                transaction.commit()
            }
        }

        btnRemove.setOnClickListener {
            var frag = fragmentManager.findFragmentById(R.id.fl_fragmentContainer)
            if (frag != null) {
                transaction =fragmentManager.beginTransaction()
                transaction.remove(frag)
                transaction.commit()
            }
        }
    }

    private fun changeFragment(fragment: Fragment){
        transaction = fragmentManager.beginTransaction()
        transaction.replace(R.id.fl_fragmentContainer,fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}