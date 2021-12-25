package com.panyukovnn.designpatterns.classic.chainofresponsibility;

public class EmailNotifier extends Notifier {

    public EmailNotifier(Priority priority) {
        super(priority);
    }

    @Override
    protected void writeMessage(String message) {
        System.out.println("Email: " + message);
    }
}
