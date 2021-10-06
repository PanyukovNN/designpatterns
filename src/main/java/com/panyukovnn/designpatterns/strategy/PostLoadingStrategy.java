package com.panyukovnn.designpatterns.strategy;

public class PostLoadingStrategy implements LoadingStrategy {

    @Override
    public void load() {
        System.out.println("Loading posts...");
        System.out.println("Posts loaded.");
    }
}
