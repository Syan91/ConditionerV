package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
    @Test
    public void currentTemperatureInRangeIncr() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(15);
        conditioner.setMaxTemperature(30);
        conditioner.setCurrentTemperature(20);
        conditioner.increaseCurrentTemperature();
        assertEquals(21, conditioner.getCurrentTemperature());
    }

    @Test
    public void currentTemperatureInRangeDecr() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(15);
        conditioner.setMaxTemperature(30);
        conditioner.setCurrentTemperature(29);
        conditioner.decreasedCurrentTemperature();
        assertEquals(28, conditioner.getCurrentTemperature());
    }

    @Test
    public void currentTemperatureOnLimitDecr() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(15);
        conditioner.setMaxTemperature(30);
        conditioner.setCurrentTemperature(30);
        conditioner.decreasedCurrentTemperature();
        assertEquals(29, conditioner.getCurrentTemperature());
    }

    @Test
    public void currentTemperatureOnLimitIncr() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(15);
        conditioner.setMaxTemperature(30);
        conditioner.setCurrentTemperature(15);
        conditioner.increaseCurrentTemperature();
        assertEquals(16, conditioner.getCurrentTemperature());
    }

    @Test
    public void currentTemperatureOverLimitMin() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(15);
        conditioner.setMaxTemperature(30);
        conditioner.setCurrentTemperature(-10);
        assertEquals(0, conditioner.getCurrentTemperature());
    }

    @Test
    public void currentTemperatureOverLimitMax() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(15);
        conditioner.setMaxTemperature(30);
        conditioner.setCurrentTemperature(100);
        assertEquals(0, conditioner.getCurrentTemperature());
    }
    @Test
    public void currentTemperatureOnLimitNoIncr() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(15);
        conditioner.setMaxTemperature(30);
        conditioner.setCurrentTemperature(30);
        conditioner.increaseCurrentTemperature();
        assertEquals(30, conditioner.getCurrentTemperature());
    }
    @Test
    public void currentTemperatureOnLimitNoDecr() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(15);
        conditioner.setMaxTemperature(30);
        conditioner.setCurrentTemperature(15);
        conditioner.decreasedCurrentTemperature();
        assertEquals(15, conditioner.getCurrentTemperature());
    }
}