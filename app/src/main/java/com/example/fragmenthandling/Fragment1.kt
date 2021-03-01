package com.example.fragmenthandling

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class Fragment1: Fragment(){


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("Fragment_Lifecycle", "onCreatedView of Fragment1")
        return inflater.inflate(R.layout.f_frag1,container,false)
    }


    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("Fragment_Lifecycle", "onAttach of Fragment1")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("Fragment_Lifecycle", "onCreate of Fragment1")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.i("Fragment_Lifecycle", "onActivityCreate of Fragment1")
    }


    override fun onPause() {
        super.onPause()
        Log.i("Fragment_Lifecycle", "onPause of Fragment1")
    }

    override fun onStart() {
        super.onStart()
        Log.i("Fragment_Lifecycle", "onStart of Fragment1")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Fragment_Lifecycle", "onResume of Fragment1")
    }

    override fun onDetach() {
        super.onDetach()
        Log.i("Fragment_Lifecycle", "onDetach of Fragment1")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Fragment_Lifecycle", "onDestroy of Fragment1")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("Fragment_Lifecycle", "onDestroyView of Fragment1")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Fragment_Lifecycle", "onStop of Fragment1")
    }
}