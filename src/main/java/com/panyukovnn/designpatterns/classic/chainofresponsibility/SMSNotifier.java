package com.panyukovnn.designpatterns.classic.chainofresponsibility;

public class SMSNotifier extends Notifier {

    public SMSNotifier(Priority priority) {
        super(priority);
    }

    @Override
    protected void writeMessage(String message) {
        System.out.println("SMS: " + message);
    }
}
