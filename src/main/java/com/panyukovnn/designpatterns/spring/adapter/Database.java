package com.panyukovnn.designpatterns.spring.adapter;

import org.springframework.stereotype.Service;

@Service
public interface Database {

    void insert(Object o);

    void update(Object o);

    Object[] select();

    void remove();
}
