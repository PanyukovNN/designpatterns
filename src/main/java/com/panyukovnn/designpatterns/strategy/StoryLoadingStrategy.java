package com.panyukovnn.designpatterns.strategy;

public class StoryLoadingStrategy implements LoadingStrategy {


    @Override
    public void load() {
        System.out.println("Loading stories...");
        System.out.println("Stories loaded.");
    }
}
