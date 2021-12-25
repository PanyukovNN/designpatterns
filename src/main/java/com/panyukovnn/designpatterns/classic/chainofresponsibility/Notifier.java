package com.panyukovnn.designpatterns.classic.chainofresponsibility;

public abstract class Notifier {

    private final Priority priority;
    private Notifier nextNotifier;

    public Notifier(Priority priority) {
        this.priority = priority;
    }

    public void setNextNotifier(Notifier notifier) {
        this.nextNotifier = notifier;
    }

    public void processNotify(String message, Priority priority) {
        if (priority.getLevel() >= this.priority.getLevel()) {
            writeMessage(message);
        }

        if (nextNotifier != null) {
            nextNotifier.processNotify(message, priority);
        }
    }

    protected abstract void writeMessage(String message);
}
