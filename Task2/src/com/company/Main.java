package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter n: ");
        int n = 0;
        try {
            n = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        int digitsN = digitsNumber(n);
        //Second Task A
        System.out.println("Does the number n contain digit 3?");
        isThree(n);
        //Second Task B
        System.out.println("Reverse of n will be " + reverseN(n));
        //Second Tack C
        System.out.println("Number n with changed first and last digits: " + swapDigits(n, digitsN));
        //Second Tack D
        System.out.println("Number n with 1 as first and last digit: " + addOnes(n, digitsN));
    }

    static void isThree(int n) {
        boolean isThree = false;
        int square;
        square = n * n;
        while (square > 0) {
            if (square % 10 == 3) {
                isThree = true;
            }
            square = square / 10;
        }
        if (isThree) {
            System.out.println("The square of number n contains the digit 3");
        } else {
            System.out.println("The square of number n does NOT contain the digit 3");
        }
    }

    static int reverseN(int n) {
        int revN = 0;
        while (n != 0) {
            int temp = n % 10;
            revN = revN * 10 + temp;
            n = n / 10;
        }
        return revN;
    }

    static int swapDigits(int n, int digitsN) {
        int power = (int) (Math.pow(10, digitsN - 1));
        int lastDigit = n % 10;
        int firstDigit = n / power;
        n = n % power + lastDigit * power;
        n = n / 10;
        n = n * 10 + firstDigit;
        return n;
    }

    static int addOnes(int n, int digits_n) {
        int power = (int) (Math.pow(10, digits_n - 1));
        n = n % power + 1 * power;
        n = n / 10;
        n = n * 10 + 1;
        return n;
    }

    static int digitsNumber(int n) {
        int digitsN = 0;
        int tempN = n;
        while (tempN > 0) {
            tempN = tempN / 10;
            digitsN++;
        }
        return digitsN;
    }
}
