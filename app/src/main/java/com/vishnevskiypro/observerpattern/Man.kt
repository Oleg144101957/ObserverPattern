package com.vishnevskiypro.observerpattern

import android.util.Log

data class Man(val name: String, val surname: String) : ManBehavior {
    private val TAG = Man::class.java.simpleName

    override fun getCloth(degrees: Int) {
        Log.d(TAG, "Degrees $degrees")
        if (degrees > 200){
            Log.d("TAG", "Warm")
        } else {
            Log.d("TAG", "Cold")

        }

    }


}