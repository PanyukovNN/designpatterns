package com.panyukovnn.designpatterns.classic.facade;

public class Developer {

    public void doingJobBeforeDeadline(BugTracker bugTracker) {
        if (bugTracker.isActiveSprint()) {
            System.out.println("Developer is resolving problems...");
        } else {
            System.out.println("Developer is reading habr...");
        }
    }
}
