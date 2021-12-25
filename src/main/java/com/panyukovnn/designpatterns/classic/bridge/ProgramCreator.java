package com.panyukovnn.designpatterns.classic.bridge;

import java.util.Arrays;
import java.util.List;

/**
 * Паттерн Мост
 * Цель - отделить асбтракцию от реализации, чтобы можно было изменять их независимо друг от друга
 *
 * Позволяет получить преимущества наследования без потери гибкости
 */
public class ProgramCreator {

    public static void main(String[] args) {
        // Здесь мы обладаем гибкостью, можем создавать других разработчиков и другие системы
        // При этом они будут независимы друг от друга

        List<Program> programs = Arrays.asList(
                new BankSystem(new JavaDeveloper()),
                new StockExchange(new CppDeveloper())
        );

        for (Program program : programs) {
            program.developProgram();
        }
    }
}
