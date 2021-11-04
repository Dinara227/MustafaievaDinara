package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Year;

public class Person {
    private String name;
    private int birthYear;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    Person(){    }

    Person(String name, int birthYear){
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    //method to count age
    public int age(){
        int age;
        age = Year.now().getValue() - birthYear;
        return age;
    }

    //input method
    public void input() {
        try {
            System.out.print("Enter your name: ");
            this.name = reader.readLine();
            System.out.print("Enter your birth year: ");
            this.birthYear = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //output method
    public void output(){
        System.out.printf("Name: %s \nBirth Year: %d \n", name, birthYear);
    }

    @Override
    public String toString(){
        return "Name: " + name + "\nBirth Year: " + birthYear;
    }

    //change name method
    public void changeName()  {
        String newName = null;
        try {
            newName = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.name = newName;
    }
}
