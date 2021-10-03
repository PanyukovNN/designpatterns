package com.panyukovnn.designpatterns.decorator.service;

public class ProfilingDecorator extends LoadingServiceDecorator {

    public ProfilingDecorator(LoadingService source) {
        super(source);
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
