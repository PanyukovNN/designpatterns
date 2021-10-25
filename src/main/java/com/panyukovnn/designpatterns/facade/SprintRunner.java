package com.panyukovnn.designpatterns.facade;

/**
 * Фасад
 *
 * Предоставить унифицированный интерфейс для работы с подсистемой
 */
public class SprintRunner {

    public static void main(String[] args) {
        Workflow workflow = new Workflow();
        workflow.solveProblems();

        
    }
}
