package com.panyukovnn.designpatterns.classic.prototype.service;

import com.panyukovnn.designpatterns.classic.prototype.model.FootballGame;

public class FootballGameFactory {

    private final FootballGame game;

    public FootballGameFactory(FootballGame game) {
        this.game = game;
    }

    public FootballGame cloneGame() {
        return game.copy();
    }
}
