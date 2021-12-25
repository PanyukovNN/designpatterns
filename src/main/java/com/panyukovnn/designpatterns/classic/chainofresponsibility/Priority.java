package com.panyukovnn.designpatterns.classic.chainofresponsibility;

public enum Priority {

    MINOR(1),
    MEDIUM(2),
    HIGHEST(3);

    private final int level;

    public int getLevel() {
        return this.level;
    }

    Priority(int level) {
        this.level = level;
    }
}
