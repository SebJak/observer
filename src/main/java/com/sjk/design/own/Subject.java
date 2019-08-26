package com.sjk.design.own;

public interface Subject {

    void subscribe(Subscriber subscriber);

    void unsubscribe(Subscriber subscriber);

    void changeUpdate();
}
