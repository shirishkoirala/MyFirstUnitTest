package com.shirishkoirala.myfirstunittest.unitTest

import com.shirishkoirala.myfirstunittest.Car
import com.shirishkoirala.myfirstunittest.Engine
import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.runBlocking
import org.junit.Test
import org.mockito.Mockito.mock
import org.mockito.Mockito.times
import org.mockito.Mockito.verify

class CarShould {
    private val engine: Engine = mock()
    private val car = Car(engine, 5.0)

    @Test
    fun looseFuelWhenTurnedOn() = runBlocking{
        car.turnOn()
        assertEquals(4.5, car.fuel)
    }

    @Test
    fun carShouldTurnOnItsEngine() = runBlocking {
        car.turnOn()
        verify(engine, times(1)).turnOn()
    }
}