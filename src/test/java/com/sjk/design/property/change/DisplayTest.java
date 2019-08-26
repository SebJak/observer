package com.sjk.design.property.change;

import org.junit.Test;

import static org.junit.Assert.*;

public class DisplayTest {
    @Test
    public void shouldBeDefaultValue() {
        //Given
        Sensor sensor = new Sensor();
        Display display = new Display();

        //then
        assertEquals(null, display.getText());
    }

    @Test
    public void shouldHaveChangedValue() {
        //Given
        Display display = new Display();
        Sensor sensor = new Sensor(display);


        //When
        sensor.changeValue("New Value");

        //then
        assertEquals("New Value", display.getText());
    }

    @Test
    public void shouldBeAbleToUnsubscribe() {
        //Given
        Display display = new Display();
        Sensor sensor = new Sensor(display);

        //When
        sensor.unsubscribe(display);
        sensor.changeValue("New Value");

        //then
        assertEquals(null, display.getText());
    }

    @Test
    public void shouldBeAbleToSubscribe() {
        //Given
        Sensor sensor = new Sensor();
        Display display = new Display();

        //When
        sensor.subscribe(display);
        sensor.changeValue("New Value");

        //then
        assertEquals("New Value", display.getText());
    }

}