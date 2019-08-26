package com.sjk.design;

public class Display implements Subscriber {

    private String text;
    private Subject sensor;

    public Display(Subject sensor) {
        this.sensor = sensor;
        this.sensor.subscribe(this);
    }

    public Display() {

    }

    @Override
    public void update(String value) {
        this.text = value;
        System.out.println("Value updated: " + value);
    }

    public String getText() {
        return text;
    }
}
