package com.panyukovnn.designpatterns.classic.memento;

import java.time.LocalDateTime;

public class Project {

    private String version;
    private LocalDateTime date;

    public void setVersionAndDate(String version) {
        this.version = version;
        this.date = LocalDateTime.now();
    }

    public Save save() {
        return new Save(version);
    }

    public void load(Save save) {
        this.version = save.getVersion();
        this.date = save.getDate();
    }

    @Override
    public String toString() {
        return "Project{" +
                "version='" + version + '\'' +
                ", date=" + date +
                '}';
    }
}
