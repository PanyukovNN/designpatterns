package com.panyukovnn.designpatterns.classic.mediator;

/**
 * Посредник
 *
 * Цель - инкапсуляция способа взаимодействия множетсва объектов
 *
 * Необходим для определения объекта, который инкапсулирует способ взаимодействия множества
 * объектов и обеспечения слабой связи между этими объектами.
 */
public class SimpleChatRunner {

    public static void main(String[] args) {
        SimpleTextChat chat = new SimpleTextChat();

        User admin = new Admin(chat, "Admin");
        User user1 = new SimpleUser(chat, "User1");
        User user2 = new SimpleUser(chat, "User2");

        chat.setAdmin(admin);
        chat.addUserToChat(user1);
        chat.addUserToChat(user2);

        user1.sendMessage("Hello, I am the first user !");
        admin.sendMessage("And I am the administrator !");
    }
}
