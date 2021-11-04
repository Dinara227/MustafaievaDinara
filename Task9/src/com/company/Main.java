package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        //Task 9.1
        System.out.println("Enter 2 double numbers: ");
        double number1;
        double number2;

        try {
            number1 = Double.parseDouble(reader.readLine());
            number2 = Double.parseDouble(reader.readLine());
            System.out.println("The result of division: ");
            System.out.println(div(number1, number2));
        } catch (NumberFormatException e) {
            System.out.println("Wrong format! Please, enter numbers.");
        } catch (ArithmeticException ae) {
            System.out.println("Division by zero!");
        } catch (Exception e) {
            System.out.println("There went something wrong!");
        }

        System.out.println();

        //Task 9.2
        System.out.println("Enter start and end: ");
        int start, end;
        try {
            start = Integer.parseInt(reader.readLine());
            end = Integer.parseInt(reader.readLine());
            System.out.println("readNumber: " + readNumber(start, end));
        } catch (IOException e) {
            e.printStackTrace();
        }
        catch (NumberFormatException e) {
            System.out.println("Wrong format! Please, enter numbers.");
        }


    }

    public static double div(double n1, double n2) {
        if (n2 == 0) {
            throw new ArithmeticException();
        }
        return n1 / n2;
    }

    public static Object readNumber(int start, int end) {
        int number;
        try {
            System.out.println("Enter number: ");
            number = Integer.parseInt(reader.readLine());
            if (number >= start && number <= end) {
                return number;
            } else
                throw new MyException("The range doesn't consist that number.");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Wrong format! Please, enter numbers.");
        }
        return null;
    }
}