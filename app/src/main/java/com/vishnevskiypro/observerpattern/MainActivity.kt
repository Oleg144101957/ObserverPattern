package com.vishnevskiypro.observerpattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val weatherStation = WeatherStation()
        weatherStation.addMan(Man("Oleg", "Vishnevskiy"))
        weatherStation.addMan(Man("Ivan", "Ivanov"))
        weatherStation.addMan(Man("Will", "Smith"))
        weatherStation.addMan(Man("John", "Kanady"))

        weatherStation.updateWeather()
    }
}