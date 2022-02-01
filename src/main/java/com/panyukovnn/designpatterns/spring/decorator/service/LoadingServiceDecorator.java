package com.panyukovnn.designpatterns.spring.decorator.service;

public class LoadingServiceDecorator implements LoadingService {

    private final LoadingService wrappee;

    public LoadingServiceDecorator(LoadingService loadingService) {
        this.wrappee = loadingService;
    }

    @Override
    public void loadOneVideo(String videoId) {
        wrappee.loadOneVideo(videoId);
    }

    @Override
    public void loadAllVideos() {
        wrappee.loadAllVideos();
    }
}
