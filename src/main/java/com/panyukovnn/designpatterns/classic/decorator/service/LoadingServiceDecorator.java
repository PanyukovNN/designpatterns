package com.panyukovnn.designpatterns.decorator.service;

public class LoadingServiceDecorator implements LoadingService {

    private final LoadingService wrappee;

    public LoadingServiceDecorator(LoadingService source) {
        this.wrappee = source;
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
