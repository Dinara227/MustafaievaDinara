package com.company;

public class Main {
    public static void main(String[] args) {
        Bird[] birds = new Bird[4];

        birds[0] = new Eagle("eagle", true, true);
        birds[1] = new Swallow("swallow", true, true);
        birds[2] = new Penguin("penguin", true, true);
        birds[3] = new Kiwi("kiwi", true, true);

        for (Bird bird : birds) {
            bird.output();
            bird.fly();
            System.out.println();
        }
    }
}
