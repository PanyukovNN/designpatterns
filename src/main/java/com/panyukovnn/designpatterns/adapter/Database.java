package com.panyukovnn.designpatterns.adapter;

public interface Database {

    void insert(Object o);

    void update(Object o);

    Object[] select();

    void remove();
}
