package com.panyukovnn.designpatterns.classic.adapter;

/**
 * Преобразование одного интерфейса в интерфейс класса, необходимого клиенту.
 *
 * Используется для совместной работы классов, интерфейсы которых несовместимы.
 */
public class DatabaseRunner {

    public static void main(String[] args) {
        Database database = new JavaToDatabaseAdapter() ;

        database.insert(new Object());
        database.update(new Object());
        database.select();
        database.remove();
    }
}
