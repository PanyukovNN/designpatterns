package com.panyukovnn.designpatterns.classic.proxy.service;

import com.panyukovnn.designpatterns.classic.proxy.model.Video;

import java.util.HashMap;

/**
 * Video service implementation
 */
public class VideoServiceImpl implements VideoService {

    @Override
    public HashMap<String, Video> findPopularVideos() {
        connectToServer("http://www.youtube.com");

        System.out.print("Downloading populars... ");

        HashMap<String, Video> popularVideos = new HashMap<>();
        popularVideos.put("hash1", new Video("Title1"));
        popularVideos.put("hash2", new Video("Title2"));
        popularVideos.put("hash3", new Video("Title3"));

        System.out.println("Done!");

        return popularVideos;
    }

    @Override
    public Video downloadVideo(String title) {
        connectToServer("http://www.youtube.com/" + title);

        System.out.print("Downloading video... ");
        Video video = new Video("Some video title");
        System.out.println("Done!");

        return video;
    }

    private void connectToServer(String server) {
        System.out.println("Connecting to " + server + "... Connected!");
    }
}
