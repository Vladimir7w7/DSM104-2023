package com.example.myapplicationpractica03dsm104

import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner

class MiLifeCycleObserver : DefaultLifecycleObserver{
    override fun onCreate(lifecycler: LifecycleOwner){
        super.onCreate(lifecycler)
        Log.d("MiLifeCycleObserver", "onCreate")
    }

    override fun onStart(lifecycler: LifecycleOwner) {
        super.onStart(lifecycler)
        Log.d("MiLifeCycleOberser", "onStart")
    }
}