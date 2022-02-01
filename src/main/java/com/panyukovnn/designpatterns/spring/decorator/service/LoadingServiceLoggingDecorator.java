package com.panyukovnn.designpatterns.spring.decorator.service;

import org.springframework.stereotype.Service;

@Service
public class LoadingServiceLoggingDecorator extends LoadingServiceDecorator {

    public LoadingServiceLoggingDecorator(LoadingService loadingService) {
        super(loadingService);
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
