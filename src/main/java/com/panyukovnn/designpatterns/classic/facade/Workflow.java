package com.panyukovnn.designpatterns.classic.facade;

public class Workflow {

    private Developer developer = new Developer();
    private Job job = new Job();
    private BugTracker bugTracker = new BugTracker();

    public void solveProblems() {
        job.doJob();
        bugTracker.startSprint();
        developer.doingJobBeforeDeadline(bugTracker);
    }
}
