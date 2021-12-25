package com.panyukovnn.designpatterns.classic.proxy.service;

import com.panyukovnn.designpatterns.classic.proxy.model.Video;
import lombok.experimental.UtilityClass;

import java.util.HashMap;

/**
 * Video download utility service
 */
@UtilityClass
public class DownloadUtil {

    /**
     * Call VideoService#downloadVideo
     *
     * @param videoService service for working with video
     * @param title video title
     */
    public void renderVideoPage(VideoService videoService, String title) {
        Video video = videoService.downloadVideo(title);

        System.out.println("\n-------------------------------");
        System.out.println("Video page (imagine fancy HTML)");
        System.out.println("Title: " + video.getTitle());
        System.out.println("-------------------------------");
    }

    /**
     * Call VideoService#findPopularVideos
     *
     * @param videoService service for working with video
     */
    public void renderPopularVideos(VideoService videoService) {
        HashMap<String, Video> popularVideos = videoService.findPopularVideos();

        System.out.println("\n-------------------------------");
        System.out.println("Most popular videos on YouTube (imagine fancy HTML)");

        popularVideos.values().forEach((video) -> System.out.println("Title: " + video.getTitle()));

        System.out.println("-------------------------------");
    }
}
