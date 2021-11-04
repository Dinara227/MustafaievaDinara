package com.company;

public class Dog {
    private String name;
    private Breed breed;
    private int age;

    public Dog(){};

    public Dog(String name, Breed breed, int age){
        this.name = name;
        this.breed = breed;
        this.age = age;
    };

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public boolean equals(Dog d1) {
        return  this.name == d1.name;
    }

    public void output(){
        System.out.printf("Name: %s \nBreed: %s \n", name, breed);
    }
}