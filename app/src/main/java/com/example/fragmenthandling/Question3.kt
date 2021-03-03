package com.example.fragmenthandling

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction

class Question3: AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.question3)


//DIALOG FRAGMENT
        val dialog = DialogFragment()
        dialog.show(supportFragmentManager , "DialogFragment")


//PREFERENCE FRAGMENT
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        val preferenceFragment = PrefFragment()
        fragmentTransaction.add(android.R.id.content , preferenceFragment )
        fragmentTransaction.commit()
    }
}