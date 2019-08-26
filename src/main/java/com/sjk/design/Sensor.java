package com.sjk.design;

import java.util.ArrayList;
import java.util.List;

public class Sensor implements Subject {

    private String value;

    private List<Subscriber> subscribers;

    public Sensor() {
        subscribers = new ArrayList<>();
    }

    public void changeValue(String value) {
        this.value = value;
        changeUpdate();
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void changeUpdate() {
        subscribers.stream().forEach(subscriber -> subscriber.update(value));
    }
}
