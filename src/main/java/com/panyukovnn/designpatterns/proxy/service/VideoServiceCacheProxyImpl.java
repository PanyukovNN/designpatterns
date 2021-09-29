package com.panyukovnn.designpatterns.proxy.service;

import com.panyukovnn.designpatterns.proxy.model.Video;

import java.util.HashMap;

/**
 * Cache proxy video service implementation
 */
public class VideoServiceCacheProxyImpl implements VideoService {

    private final VideoService videoService;
    private final HashMap<String, Video> cachePopular = new HashMap<>();
    private final HashMap<String, Video> cacheAll = new HashMap<>();

    /**
     * ctor
     */
    public VideoServiceCacheProxyImpl() {
        this.videoService = new VideoServiceImpl();
    }

    @Override
    public HashMap<String, Video> findPopularVideos() {
        if (cachePopular.isEmpty()) {
            cachePopular.putAll(videoService.findPopularVideos());
        } else {
            System.out.println("Retrieved list from cache.");
        }

        return cachePopular;
    }

    @Override
    public Video downloadVideo(String title) {
        Video video = cacheAll.get(title);

        if (video == null) {
            cacheAll.put(title, videoService.downloadVideo(title));
        } else {
            System.out.println("Retrieved video '" + title + "' from cache.");
        }

        return cacheAll.get(title);
    }
}
