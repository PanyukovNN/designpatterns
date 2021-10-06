package com.panyukovnn.designpatterns.chainofresponsibility;

/**
 * Связываение объектов-обработчиков в цепочку и передача запросов по ней.
 */
public class Main {

    public static void main(String[] args) {
        Notifier baseNotifier = new ConsoleNotifier(Priority.MINOR);
        Notifier emailNotifier = new EmailNotifier(Priority.MEDIUM);
        Notifier smsNotifier = new ConsoleNotifier(Priority.HIGHEST);

        baseNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smsNotifier);

        baseNotifier.processNotify("Hello guys :)", Priority.MINOR);
        baseNotifier.processNotify("We found small bug on project...", Priority.MEDIUM);
        baseNotifier.processNotify("Bug in production !!!", Priority.HIGHEST);
    }
}
