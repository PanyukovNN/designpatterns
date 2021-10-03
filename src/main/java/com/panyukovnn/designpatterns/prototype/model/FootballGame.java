package com.panyukovnn.designpatterns.prototype.model;

import lombok.Getter;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@Getter
public class FootballGame implements ClonableGame, Cloneable {

    private final String homeTeam;
    private final String awayTeam;
    private final int homeScore;
    private final int awayScore;
    private final Map<LocalDateTime, Double> x1;

    public FootballGame(String homeTeam, String awayTeam, int homeScore, int awayScore, Map<LocalDateTime, Double> x1) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeScore = homeScore;
        this.awayScore = awayScore;
        this.x1 = x1;
    }

    @Override
    public FootballGame copy() {
        return new FootballGame(homeTeam, awayTeam, homeScore, awayScore, new HashMap<>(this.x1));
    }

    @Override
    public FootballGame clone() throws CloneNotSupportedException {
        return (FootballGame) super.clone();
    }

    @Override
    public String toString() {
        return "Game{" +
                "homeTeam='" + homeTeam + '\'' +
                ", awayTeam='" + awayTeam + '\'' +
                ", homeScore=" + homeScore +
                ", awayScore=" + awayScore +
                ", x1=" + x1 +
                '}';
    }
}
