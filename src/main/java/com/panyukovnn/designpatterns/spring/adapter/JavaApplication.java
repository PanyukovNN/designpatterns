package com.panyukovnn.designpatterns.spring.adapter;

import org.springframework.stereotype.Service;

@Service
public class JavaApplication {

    public void saveObject(Object o) {
        System.out.println("Saving java object...");
    }

    public void updateObject(Object o) {
        System.out.println("Updating java object...");
    }

    public Object[] loadObjects() {
        System.out.println("Loading java objects...");

        return new Object[0];
    }

    public void removeObject() {
        System.out.println("Removing java object...");
    }
}
