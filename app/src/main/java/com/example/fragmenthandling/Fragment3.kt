package com.example.fragmenthandling

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

class Fragment3: Fragment() {
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        Log.i("Fragment_Lifecycle", "onCreatedView of Fragment3")
        return inflater.inflate(R.layout.f_frag3,container,false)
    }


    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("Fragment_Lifecycle", "onAttach of Fragment3")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("Fragment_Lifecycle", "onCreate of Fragment3")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.i("Fragment_Lifecycle", "onActivityCreate of Fragment3")

        val showMessiButton = view?.findViewById<Button>(R.id.btnshowMessi)
        showMessiButton?.setOnClickListener {
            val fragmentManager =  fragmentManager
            val fragmentTransaction = fragmentManager?.beginTransaction()
            fragmentTransaction?.add(R.id.frameLayout, MessiFragment())
            fragmentTransaction?.commit()
        }

        val showRonaldoButton = view?.findViewById<Button>(R.id.btnshowRonaldo)
        showRonaldoButton?.setOnClickListener {
            val fragmentManager =  fragmentManager
            val fragmentTransaction = fragmentManager?.beginTransaction()
            fragmentTransaction?.add(R.id.frameLayout, RonaldoFragment())
            fragmentTransaction?.commit()

        }

        val showNeymarButton = view?.findViewById<Button>(R.id.btnshowNeymar)
        showNeymarButton?.setOnClickListener {
            val fragmentManager =  fragmentManager
            val fragmentTransaction = fragmentManager?.beginTransaction()
            fragmentTransaction?.add(R.id.frameLayout, Neymarfragment())
            fragmentTransaction?.commit()
        }
    }


    override fun onPause() {
        super.onPause()
        Log.i("Fragment_Lifecycle", "onPause of Fragment3")
    }

    override fun onStart() {
        super.onStart()
        Log.i("Fragment_Lifecycle", "onStart of Fragment3")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Fragment_Lifecycle", "onResume of Fragment3")
    }

    override fun onDetach() {
        super.onDetach()
        Log.i("Fragment_Lifecycle", "onDetach of Fragment3")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Fragment_Lifecycle", "onDestroy of Fragment3")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("Fragment_Lifecycle", "onDestroyView of Fragment3")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Fragment_Lifecycle", "onStop of Fragment3")
    }
}