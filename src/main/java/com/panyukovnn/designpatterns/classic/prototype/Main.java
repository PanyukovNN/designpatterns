package com.panyukovnn.designpatterns.classic.prototype;

import com.panyukovnn.designpatterns.classic.prototype.model.FootballGame;
import com.panyukovnn.designpatterns.classic.prototype.service.FootballGameFactory;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 *  Данный паттерн необходим для создания копий заданного объекта
 *
 *  Применяется:
 *   - для динамического создания классов
 *   - чтобы не строить иерархию клссов, используя фабрики
 *
 *  Встроенный интерфейс Cloneable является реализацией данного шаблона
 */
public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Map<LocalDateTime, Double> x1 = new HashMap<>();
        x1.put(LocalDateTime.now(), 1.11d);

        FootballGame footballGame = new FootballGame("Team1", "Team2", 1, 0, x1);
        FootballGame cloneFootballGame = footballGame.clone();

        FootballGameFactory footballGameFactory = new FootballGameFactory(footballGame);
        FootballGame prototypeFootballGame = footballGameFactory.cloneGame();

        cloneFootballGame.getX1().put(LocalDateTime.now().plusDays(1), 1.52d);
        prototypeFootballGame.getX1().put(LocalDateTime.now().plusDays(2), 2.07d);

        // У простого клона поле x1 ссылается на тот же объект, что и footballGame
        System.out.println(footballGame.hashCode() + ": " + footballGame);
        System.out.println(cloneFootballGame.hashCode() + ": " + cloneFootballGame);
        // В свою очередь, у прототипа поле x1 является уже новым объектом
        System.out.println(prototypeFootballGame.hashCode() + ": " + prototypeFootballGame);
    }
}
