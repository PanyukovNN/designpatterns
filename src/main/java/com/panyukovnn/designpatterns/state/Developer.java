package com.panyukovnn.designpatterns.state;

public class Developer {

    private Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void changeActivityState() {
        if (activity instanceof Coding) {
            setActivity(new Reading());
        } else if (activity instanceof Reading) {
            setActivity(new Training());
        } else if (activity instanceof Training) {
            setActivity(new Coding());
        }
    }

    public void justDoIt() {
        activity.justDoIt();
    }
}
