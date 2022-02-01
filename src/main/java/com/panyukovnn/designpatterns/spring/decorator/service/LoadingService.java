package com.panyukovnn.designpatterns.spring.decorator.service;

public interface LoadingService {
    void loadOneVideo(String videoId);

    void loadAllVideos();
}
