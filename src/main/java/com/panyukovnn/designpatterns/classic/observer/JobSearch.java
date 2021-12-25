package com.panyukovnn.designpatterns.classic.observer;

/**
 * Необходим для определения зависимости "один ко многим" между объектами
 *
 * При изменении одного объекта все остальные будут уведомлены
 */
public class JobSearch {

    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();

        jobSite.addVacancy("Junior java position");
        jobSite.addVacancy("Middle java position");

        Observer firstSubscriber = new Subscriber("Ivan");
        Observer secondSubscriber = new Subscriber("Oleg");

        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);

        jobSite.addVacancy("Senior java position");

        jobSite.removeVacancy("Junior java position");
    }
}
