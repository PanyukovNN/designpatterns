package com.panyukovnn.designpatterns.spring.adapter;

import org.springframework.stereotype.Service;

@Service
public class JavaToDatabaseAdapter extends JavaApplication implements Database {

    @Override
    public void insert(Object o) {
        saveObject(o);
    }

    @Override
    public void update(Object o) {
        updateObject(o);
    }

    @Override
    public Object[] select() {
        return loadObjects();
    }

    @Override
    public void remove() {
        removeObject();
    }
}
