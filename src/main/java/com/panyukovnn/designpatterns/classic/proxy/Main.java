package com.panyukovnn.designpatterns.classic.proxy;

import com.panyukovnn.designpatterns.classic.proxy.service.DownloadUtil;
import com.panyukovnn.designpatterns.classic.proxy.service.VideoService;
import com.panyukovnn.designpatterns.classic.proxy.service.VideoServiceCacheProxyImpl;
import com.panyukovnn.designpatterns.classic.proxy.service.VideoServiceImpl;

/**
 * Паттерн proxy (заместитель) позволяет добавить новое поведение до и после выполнения методов сервиса
 * Таким образом, декорируются все методы.
 * Также представляет возможность обеспечения контроля доступа к определенному объекту.
 *
 * Метод, использующий прокси сервис не замечает отличий от основного сервиса.
 *
 * Широко используется спрингом.
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
