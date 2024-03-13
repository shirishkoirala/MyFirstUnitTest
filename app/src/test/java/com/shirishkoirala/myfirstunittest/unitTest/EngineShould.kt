package com.shirishkoirala.myfirstunittest.unitTest

import com.shirishkoirala.myfirstunittest.Engine
import kotlinx.coroutines.runBlocking
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class EngineShould {
    private val engine = Engine()

    @Test
    fun turnOn() = runBlocking {
        engine.turnOn()
        assertTrue(engine.isTurnedOn)
    }

    @Test
    fun turnOff() = runBlocking {
        engine.turnOn()
        engine.turnOff()
        assertFalse(engine.isTurnedOn)
        assertEquals(15, engine.temperature)
    }

    @Test
    fun riseTheTemperatureWhenItsTurnedOn() = runBlocking {
        engine.turnOn()
        assertEquals(95, engine.temperature)
    }
}