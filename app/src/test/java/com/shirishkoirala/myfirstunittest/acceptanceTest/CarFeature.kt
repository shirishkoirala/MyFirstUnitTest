package com.shirishkoirala.myfirstunittest.acceptanceTest

import com.shirishkoirala.myfirstunittest.Car
import com.shirishkoirala.myfirstunittest.Engine
import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertTrue
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking
import org.junit.Test
import kotlin.concurrent.timer

class CarFeature {
    private var engine = Engine()
    private val car = Car(engine, 6.0)

    @Test
    fun carIsLosingFuelWhenTurnedOn() = runBlocking{
        car.turnOn()
        assertEquals(5.5, car.fuel)
    }

    @Test
    fun carIsTurningOnItsEngineAndIncreasesTheTemperature() = runBlocking {
        car.turnOn()
        assertEquals(95, car.engine.temperature)
        assertTrue(car.engine.isTurnedOn)
    }
}