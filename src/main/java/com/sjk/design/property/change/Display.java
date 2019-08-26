package com.sjk.design.property.change;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Display implements PropertyChangeListener {

    private String text;

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if(evt.getPropertyName().equals("value")) {
            text = (String) evt.getNewValue();
        }
    }

    public String getText() {
        return text;
    }
}
