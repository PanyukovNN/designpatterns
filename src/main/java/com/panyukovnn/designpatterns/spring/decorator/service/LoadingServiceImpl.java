package com.panyukovnn.designpatterns.spring.decorator.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.concurrent.CompletableFuture;

@Primary
@Service("loadingService")
public class LoadingServiceImpl implements LoadingService {

    @Override
    public void loadOneVideo(String videoId) {
        waitSeconds((new Random().nextInt(2) + 1) * 300);
    }

    @Override
    public void loadAllVideos() {
        waitSeconds((new Random().nextInt(5) + 1) * 1000);
    }

    public CompletableFuture get() {
        return new CompletableFuture();
    }

    private void waitSeconds(int seconds) {
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
