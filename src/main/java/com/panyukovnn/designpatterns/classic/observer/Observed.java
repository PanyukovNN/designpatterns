package com.panyukovnn.designpatterns.classic.observer;

import com.panyukovnn.designpatterns.classic.observer.Observer;

public interface Observed {

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
