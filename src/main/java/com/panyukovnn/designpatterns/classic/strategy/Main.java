package com.panyukovnn.designpatterns.classic.strategy;

import com.google.common.collect.ImmutableMap;

import java.util.Map;

/**
 * Стратегия
 * Цель - взаимозаменяемость семейства классов
 * Позволяет динамически менять поведение
 */
public class Main {

    private static Map<LoadingType, LoadingStrategy> type2strategy = new ImmutableMap.Builder<LoadingType, LoadingStrategy>()
            .put(LoadingType.POST, new PostLoadingStrategy())
            .put(LoadingType.STORY, new StoryLoadingStrategy())
            .build();

    public static void main(String[] args) {
        LoadingService postLoadingService = new LoadingService(type2strategy.get(LoadingType.POST));
        postLoadingService.processLoading();
        System.out.println("================");

        LoadingService storyLoadingService = new LoadingService(type2strategy.get(LoadingType.STORY));
        storyLoadingService.processLoading();
    }
}
