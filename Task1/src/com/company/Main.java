package com.company;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please, enter sides of the brick");
        try {
            int a = Integer.parseInt(reader.readLine());
            int b = Integer.parseInt(reader.readLine());
            int c = Integer.parseInt(reader.readLine());
            System.out.println("Please, enter sides of the rectangle");
            int x = Integer.parseInt(reader.readLine());
            int y = Integer.parseInt(reader.readLine());
            boolean flag1 = pass(a, b, x, y);
            boolean flag2 = pass(a, c, x, y);
            boolean flag3 = pass(b, c, x, y);
            done(flag1, flag2, flag3);
        } catch (IOException e)  {
            System.out.println(e.getMessage());
        }
    }

    public static boolean pass(int v1, int v2, int v3, int v4) {
        if ((v1 <= v3 && v2 <= v4) || (v1 <= v4 && v2 <= v3)) {
            return true;
        } else {
            return false;}
    }

    public static void done(boolean f1, boolean f2, boolean f3) {
        if (f1 || f2 || f3) {
            System.out.println("It goes! ");
        } else {
            System.out.println("It doesn't  go! ");
        }
    }
}
