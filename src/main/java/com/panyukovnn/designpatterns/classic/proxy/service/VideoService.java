package com.panyukovnn.designpatterns.classic.proxy.service;

import com.panyukovnn.designpatterns.classic.proxy.model.Video;

import java.util.HashMap;

/**
 * Service for working with videos
 */
public interface VideoService {

    /**
     * Returns popular videos
     *
     * @return popular video map
     */
    HashMap<String, Video> findPopularVideos();

    /**
     * Download video by title
     *
     * @param title video title
     * @return video entity
     */
    Video downloadVideo(String title);
}
