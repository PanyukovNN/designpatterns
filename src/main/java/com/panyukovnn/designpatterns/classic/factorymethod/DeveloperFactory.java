package com.panyukovnn.designpatterns.classic.factorymethod;

public class DeveloperFactory {

    public Developer defineDeveloper(CodeType codeType) {
        if (codeType == CodeType.JAVA) {
            return new JavaDeveloper();
        } else if (codeType == CodeType.PYTHON) {
            return new PythonDeveloper();
        } else {
            throw new IllegalArgumentException("Impossible to identify developer by code type " + codeType.name());
        }
    }
}
