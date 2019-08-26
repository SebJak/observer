package com.sjk.design;

public interface Subject {

    void subscribe(Subscriber subscriber);

    void unsubscribe(Subscriber subscriber);

    void changeUpdate();
}
