package com.panyukovnn.designpatterns.prototype.service;

import com.panyukovnn.designpatterns.prototype.model.FootballGame;

public class FootballGameFactory {

    private final FootballGame game;

    public FootballGameFactory(FootballGame game) {
        this.game = game;
    }

    public FootballGame cloneGame() {
        return game.copy();
    }
}
