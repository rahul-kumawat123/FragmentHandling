package com.example.fragmenthandling

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class RonaldoFragment: Fragment() {
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        Log.i("Fragment_Lifecycle", "onCreatedView of RonaldoFragment")
        return inflater.inflate(R.layout.ronaldo,container,false)
    }


    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("Fragment_Lifecycle", "onAttach of RonaldoFragment")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("Fragment_Lifecycle", "onCreate of RonaldoFragment")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.i("Fragment_Lifecycle", "onActivityCreate of RonaldoFragment")
    }


    override fun onPause() {
        super.onPause()
        Log.i("Fragment_Lifecycle", "onPause of RonaldoFragment")
    }

    override fun onStart() {
        super.onStart()
        Log.i("Fragment_Lifecycle", "onStart of RonaldoFragment")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Fragment_Lifecycle", "onResume of RonaldoFragment")
    }

    override fun onDetach() {
        super.onDetach()
        Log.i("Fragment_Lifecycle", "onDetach of RonaldoFragment")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Fragment_Lifecycle", "onDestroy of RonaldoFragment")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("Fragment_Lifecycle", "onDestroyView of RonaldoFragment")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Fragment_Lifecycle", "onStop of RonaldoFragment")
    }

}