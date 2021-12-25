package com.panyukovnn.designpatterns.spring.strategy.publicator;

import com.panyukovnn.designpatterns.spring.strategy.model.PublicatorType;

public interface Publicator {

    void publish();

    PublicatorType getType();
}
