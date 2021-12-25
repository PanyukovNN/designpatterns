package com.panyukovnn.designpatterns.decorator.service;

public class LoggingDecorator extends LoadingServiceDecorator {

    public LoggingDecorator(LoadingService source) {
        super(source);
    }

    @Override
    public void loadOneVideo(String videoId) {
        System.out.println("Start loading video with id " + videoId + ".");
        super.loadOneVideo(videoId);
        System.out.println("Video loading finished.");
    }

    @Override
    public void loadAllVideos() {
        System.out.println("Start loading all videos");
        super.loadAllVideos();
        System.out.println("All videos loading finished.");
    }
}
