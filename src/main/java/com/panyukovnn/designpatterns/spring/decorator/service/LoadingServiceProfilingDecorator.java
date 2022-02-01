package com.panyukovnn.designpatterns.spring.decorator.service;

import org.springframework.stereotype.Service;

@Service
public class LoadingServiceProfilingDecorator extends LoadingServiceDecorator {

    public LoadingServiceProfilingDecorator(LoadingService loadingService) {
        super(loadingService);
    }

    @Override
    public void loadOneVideo(String videoId) {
        long startTime = System.currentTimeMillis();

        super.loadOneVideo(videoId);

        long endTime = System.currentTimeMillis();
        System.out.println("Total one video loading time: " + (endTime-startTime) + "ms");
    }

    @Override
    public void loadAllVideos() {
        long startTime = System.currentTimeMillis();

        super.loadAllVideos();

        long endTime = System.currentTimeMillis();
        System.out.println("Total all videos loading time: " + (endTime-startTime) + "ms");
    }
}
