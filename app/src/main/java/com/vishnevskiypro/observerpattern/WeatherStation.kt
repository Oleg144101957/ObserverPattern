package com.vishnevskiypro.observerpattern

import java.util.*
import kotlin.random.Random.Default.nextInt

class WeatherStation {
    var degrees = 0
    private val people: MutableList<ManBehavior> = LinkedList()

    fun addMan(manBehavior: ManBehavior){
        people.add(manBehavior)
    }

    fun remove(manBehavior: ManBehavior){
        people.remove(manBehavior)
    }

    fun updateWeather(){
        degrees = nextInt(400)
        people.forEach {
            it.getCloth(degrees = degrees)
        }

        var handler = android.os.Handler()
        handler.postDelayed({updateWeather()}, 2_000)
    }


}