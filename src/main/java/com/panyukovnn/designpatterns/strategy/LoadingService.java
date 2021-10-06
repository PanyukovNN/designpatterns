package com.panyukovnn.designpatterns.strategy;

public class LoadingService {

    private final LoadingStrategy strategy;

    public LoadingService(LoadingStrategy strategy) {
        this.strategy = strategy;
    }

    public void processLoading() {
        strategy.load();
    }
}
