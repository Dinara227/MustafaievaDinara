package com.company;

public class FlyingBird extends Bird {
    public FlyingBird(String name, boolean feathers, boolean layEggs) {
        super(name, feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("The bird can fly.");
    }
}