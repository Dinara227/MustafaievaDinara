package com.company;

public class NonFlyingBird extends Bird{
    public NonFlyingBird(String name, boolean feathers, boolean layEggs) {
        super(name, feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("The bird can't fly.");
    }
}