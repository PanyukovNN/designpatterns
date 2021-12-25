package com.panyukovnn.designpatterns.decorator.service;

import java.util.Random;

public class LoadingServiceImpl implements LoadingService {

    @Override
    public void loadOneVideo(String videoId) {
        waitSeconds((new Random().nextInt(2) + 1) * 300);
    }

    @Override
    public void loadAllVideos() {
        waitSeconds((new Random().nextInt(5) + 1) * 1000);
    }

    private void waitSeconds(int seconds) {
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
