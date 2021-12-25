package com.panyukovnn.designpatterns.command;

/**
 * Инкапсуляция запроса в объект
 *
 * Используется чтобы задать параметры клиентов для обработки определенных запросов,
 * создать очередь запросов и поддерживать отмену операций.
 */
public class Main {

    public static void main(String[] args) {
        Database database = new Database();
        Developer developer = new Developer(
                new InsertCommand(database),
                new UpdateCommand(database),
                new SelectCommand(database),
                new DeleteCommand(database)
        );

        developer.insertRecord();
        developer.updateRecord();
        developer.selectRecord();
        developer.deleteRecord();
    }
}
