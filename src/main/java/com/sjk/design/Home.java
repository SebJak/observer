package com.sjk.design;

public class Home {

    public static void main(String[] args) {
        Sensor sensor = new Sensor();
        Display display = new Display(sensor);

        sensor.changeValue("New Value");
        sensor.changeValue("Value changed");
    }
}
