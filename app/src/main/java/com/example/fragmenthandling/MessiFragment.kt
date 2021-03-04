package com.example.fragmenthandling

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class MessiFragment: Fragment() {
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        Log.i("Fragment_Lifecycle", "onCreatedView of MessiFragment")
        return inflater.inflate(R.layout.messi,container,false)
    }


    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("Fragment_Lifecycle", "onAttach of MessiFragment")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("Fragment_Lifecycle", "onCreate of MessiFragment")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.i("Fragment_Lifecycle", "onActivityCreate of MessiFragment")
    }


    override fun onPause() {
        super.onPause()
        Log.i("Fragment_Lifecycle", "onPause of MessiFragment")
    }

    override fun onStart() {
        super.onStart()
        Log.i("Fragment_Lifecycle", "onStart of MessiFragment")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Fragment_Lifecycle", "onResume of MessiFragment")
    }

    override fun onDetach() {
        super.onDetach()
        Log.i("Fragment_Lifecycle", "onDetach of MessiFragment")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Fragment_Lifecycle", "onDestroy of MessiFragment")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("Fragment_Lifecycle", "onDestroyView of MessiFragment")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Fragment_Lifecycle", "onStop of MessiFragment")
    }
}