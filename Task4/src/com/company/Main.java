package com.company;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person("Dinara", 1999);
        Person p2 = new Person("Alina", 1998);
        Person p3 = new Person("Anna", 2001);
        Person p4 = new Person("Ihor", 2001);
        Person p5 = new Person("Oleksiy", 1997);
        Person p6 = new Person();

        System.out.printf("%s , you are %d years old.\n", p1.getName(), p1.age());
        System.out.println();

        System.out.println("Enter new data");
        p6.input();
        System.out.println();

        System.out.println("p6 has such data: ");
        p6.output();
        System.out.println();

        System.out.printf("Enter changed name:");
        p6.changeName();
        System.out.println();

        System.out.println("Your new data is");
        p6.output();
        System.out.println();

        System.out.print("Your new name is: ");
        System.out.println(p6.getName());

    }
}
