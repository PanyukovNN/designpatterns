package com.panyukovnn.designpatterns.chainofresponsibility;

public class ConsoleNotifier extends Notifier {

    public ConsoleNotifier(Priority priority) {
        super(priority);
    }

    @Override
    protected void writeMessage(String message) {
        System.out.println("Console: " + message);
    }
}
