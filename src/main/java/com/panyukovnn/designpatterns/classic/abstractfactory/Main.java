package com.panyukovnn.designpatterns.classic.abstractfactory;

import com.google.common.collect.ImmutableMap;
import com.panyukovnn.designpatterns.classic.abstractfactory.factory.AbstractFactory;
import com.panyukovnn.designpatterns.classic.abstractfactory.factory.MacFactory;
import com.panyukovnn.designpatterns.classic.abstractfactory.factory.WindowsFactory;
import com.panyukovnn.designpatterns.classic.abstractfactory.model.OperationSystem;

import java.util.Map;

/**
 * Данный паттерн представляет собой следующий уровень асбтракции над фабрикой
 * Необоходим для создания разных видов объектов со схожими характеристиками
 */
public class Main {

    private final static Map<OperationSystem, AbstractFactory> osFactoryMap = new ImmutableMap.Builder<OperationSystem, AbstractFactory>()
            .put(OperationSystem.MAC, new MacFactory())
            .put(OperationSystem.WINDOWS, new WindowsFactory())
            .build();

    public static void main(String[] args) {
        OperationSystem os = OperationSystem.WINDOWS;

        AppWindow app = new AppWindow(osFactoryMap.get(os));

        app.process();
    }
}
