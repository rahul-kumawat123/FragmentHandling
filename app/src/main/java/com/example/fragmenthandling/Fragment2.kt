package com.example.fragmenthandling

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class Fragment2: Fragment(){


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("Fragment_Lifecycle", "onCreatedView of Fragment 2")
        return inflater.inflate(R.layout.f_frag2,container,false)
    }


    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("Fragment_Lifecycle", "onAttach of Fragment 2")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("Fragment_Lifecycle", "onCreate of Fragment 2")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.i("Fragment_Lifecycle", "onActivityCreate of Fragment 2")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Fragment_Lifecycle", "onPause of Fragment 2")
    }

    override fun onStart() {
        super.onStart()
        Log.i("Fragment_Lifecycle", "onStart of Fragment 2")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Fragment_Lifecycle", "onResume of Fragment 2")
    }

    override fun onDetach() {
        super.onDetach()
        Log.i("Fragment_Lifecycle", "onDetach of Fragment 2")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Fragment_Lifecycle", "onDestroy of Fragment 2")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("Fragment_Lifecycle", "onDestroyView of Fragment 2")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Fragment_Lifecycle", "onStop of Fragment 2")
    }
}