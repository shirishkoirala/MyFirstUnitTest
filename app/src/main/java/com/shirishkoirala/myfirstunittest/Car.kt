package com.shirishkoirala.myfirstunittest

import android.util.Log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class Car(var engine: Engine, var fuel: Double) {

    suspend fun turnOn() {
        fuel -= 0.5
        CoroutineScope(Dispatchers.Main).launch {
            engine.turnOn().collect{
                Log.d("Car", "turnOn: $it")
            }
        }
    }
}