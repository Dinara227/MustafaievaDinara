package com.company;

public abstract class Bird {
    private String name;
    private boolean feathers;
    private boolean layEggs;

    public String getName() {
        return name;
    }

    public boolean isFeathers() {
        return feathers;
    }

    public boolean isLayEggs() {
        return layEggs;
    }

    public Bird(String name, boolean feathers, boolean layEggs) {
        this.name = name;
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public abstract void fly();

    public void output() {
        System.out.printf("The bird is: %s \n" +
                "Has it got feathers?: %s \n" +
                "Does it lay eggs?: %s \n", name, isFeathers(), isLayEggs());
    }
}
