package com.panyukovnn.designpatterns.composite;

/**
 * Компоновщик
 *
 * Цель - скомпонировать объекты в структуру по типу дерева
 *
 * Мы испльзуем этот шаблон, чтобы группировать мелкие компоненты в более крупные
 */
public class Project {

    public static void main(String[] args) {
        // Есть команда
        Team team = new Team();

        // Есть разработчики
        Developer javaDeveloper = new JavaDeveloper();
        Developer cppDeveloper = new CppDeveloper();

        // Добавляем всех разработчиков в команду
        team.addDeveloper(javaDeveloper);
        team.addDeveloper(cppDeveloper);

        // Отдаём всем разработчикам команду - писать код
        team.createProject();
    }
}
