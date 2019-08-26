package com.sjk.design.property.change;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Sensor {

    PropertyChangeSupport pcs = new PropertyChangeSupport(this);

    private String value;

    public Sensor() {

    }

    public Sensor(PropertyChangeListener listener) {
        pcs.addPropertyChangeListener(listener);
    }

    public void subscribe(PropertyChangeListener listener) {
        pcs.addPropertyChangeListener(listener);
    }

    public void unsubscribe(PropertyChangeListener listener) {
        pcs.removePropertyChangeListener(listener);
    }

    public void changeValue(String value) {
        pcs.firePropertyChange("value", this.value, value);
        this.value = value;
    }

}
