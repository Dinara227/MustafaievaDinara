package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //Task3.1
        double radius = 0;
        System.out.println("Enter radius of the circle: ");
        try {
            radius = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("The perimeter is: " +  perimeter(radius));
        System.out.println("The area is: " + area(radius));

        //Task3.2
        System.out.println();
        String name = null;
        String address = null;
        System.out.print("What is your name? ");
        try {
            name = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.printf("Where are you live, %s ? ", name);
        try {
            address = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.printf("Your name is %s. You are from %s", name, address);

        //Task3.3
        System.out.println("Please, enter standard units c1, c2, c3: ");
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        try {
            c1 = Integer.parseInt(reader.readLine());
            c2 = Integer.parseInt(reader.readLine());
            c3 = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Please, enter time of the calls t1, t2, t3: ");
        int t1 = 0;
        int t2 = 0;
        int t3 = 0;
        try {
            t1 = Integer.parseInt(reader.readLine());
            t2 = Integer.parseInt(reader.readLine());
            t3 = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.printf("The price of the calls is: \n first: %d \n second: %d \n third: %d \n", price(c1,t1), price(c2,t2),price(c2,t2));
        System.out.println("All sum for talks will be: " + sum(c1, c2, c3, t1, t2, t3));
    }

    public static double perimeter(double radius){
        double perimeter;
        perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    public static double area(double radius){
        double area;
        area = Math.PI * radius * radius;
        return area;
    }

    public static double price(int c, int t){
        int price;
        price = c * t;
        return price;
    }

    public static double sum(int c1, int c2, int c3, int t1, int t2, int t3){
        int sum = 0;
        sum = c1*t1 + c2*t2 + c3*t3;
        return sum;
    }
}
