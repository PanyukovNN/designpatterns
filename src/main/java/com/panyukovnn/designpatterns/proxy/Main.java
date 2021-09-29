package com.panyukovnn.designpatterns.proxy;

import com.panyukovnn.designpatterns.proxy.service.DownloadUtil;
import com.panyukovnn.designpatterns.proxy.service.VideoService;
import com.panyukovnn.designpatterns.proxy.service.VideoServiceCacheProxyImpl;
import com.panyukovnn.designpatterns.proxy.service.VideoServiceImpl;

/**
 * Proxy demo class
 */
public class Main {

    public static void main(String[] args) {
        test(new VideoServiceImpl());
        test(new VideoServiceCacheProxyImpl());
    }

    private static void test(VideoService videoService) {
        DownloadUtil.renderPopularVideos(videoService);
        DownloadUtil.renderVideoPage(videoService, "Title1");
        DownloadUtil.renderVideoPage(videoService, "Title2");
        DownloadUtil.renderVideoPage(videoService, "Title1");
        DownloadUtil.renderVideoPage(videoService, "Title3");
    }
}
