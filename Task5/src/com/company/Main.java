package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //Task 5.1.1
        System.out.println("Enter 3 float numbers: ");
        float number1 = 0;
        float number2 = 0;
        float number3 = 0;
        try {
            number1 = Float.parseFloat(reader.readLine());
            number2 = Float.parseFloat(reader.readLine());
            number3 = Float.parseFloat(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        belong(number1);
        belong(number2);
        belong(number3);
        System.out.println();

        //Task 5.1.2
        System.out.println("Enter 3 int numbers: ");
        int int1 = 0;
        int int2 = 0;
        int int3 = 0;
        try {
            int1 = Integer.parseInt(reader.readLine());
            int2 = Integer.parseInt(reader.readLine());
            int3 = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        int integers[] = new int[] {
            int1, int2, int3
        };
        System.out.println("Maximum value is " + max(integers));
        System.out.println("Minimum value is " + min(integers));

        //Task 5.1.3
        System.out.println("\nEnter HTTP Error number: ");
        int error = 0;
        try {
            error = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.printf("Name of the HTTP Error %d is %s \n", error, HTTPError.valueOf(error));

        //Task 5.2
        Dog dog1 = new Dog("Naida", Breed.RETRIEVER, 7);
        Dog dog2 = new Dog("Lisa", Breed.LABRADOR, 5);
        Dog dog3 = new Dog("Reks", Breed.TERRIER, 3);
        Dog dogs[] = new Dog[]{dog1, dog2, dog3};

        System.out.println("\nHave we got dogs with same names?");
        if (sameNames(dogs)) {
            System.out.println("Yes, we have.");
        } else {
            System.out.println("No, we haven't.");
        }

        System.out.println("\nThe oldest dog is ");
        dogs[theOldest(dogs)].output();
        System.out.println();
    }

    public static boolean belong(float number) {
        if (-5 <= number && number <= 5) {
            System.out.println(number + " belongs to [-5,5]");
            return true;
        } else {
            System.out.println(number + " doesn't belong to [-5,5]");
            return false;
        }
    }

    public static int max(int integers[]){
        int max = 0;
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] > max) {
                max = integers[i];
            }
        }
        return max;
    }

    public static int min(int integers[]){
        int min = 0;
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] < min) {
                min = integers[i];
            }
        }
        return min;
    }

    public static boolean sameNames(Dog dogs[]) {
        for (int i = 0; i < dogs.length; i++) {
            for (int j = i + 1; j < dogs.length; j++) {
                if (dogs[i].getName() == dogs[j].getName()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int theOldest(Dog dogs[]) {
        int max = 0;
        int index = 0;
        for (int i = 0; i < dogs.length; i++) {
            if (dogs[i].getAge() > max) {
                max = dogs[i].getAge();
                index = i;
            }
        }
        return index;
    }
}