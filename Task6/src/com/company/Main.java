package com.company;

public class Main {

    public static void main(String[] args) {
        Kettle kettle1 = new Kettle("Magio", Country.CHINA, 1.9);
        Kettle kettle2 = new Kettle("Samsung", Country.JAPAN, 1.2);
        Kettle kettle3 = new Kettle("Bosch", Country.FRANCE, 2.5);
        Kettle kettle4 = new Kettle("Bosch", Country.FRANCE, 1.9);

        kettle1.toString();
        kettle2.toString();
        kettle3.toString();
        kettle4.toString();

        System.out.println("Are the kettles 3 and 4 from the same country?");
        if (kettle3.equals(kettle4)) {
            System.out.println("Yes, they are.");
        } else System.out.println("No, they aren't.");

        System.out.println("Are the kettles 1 and 2 from the same country?");
        if (kettle1.equals(kettle2)) {
            System.out.println("Yes, they are.");
        } else System.out.println("No, they aren't.");

        System.out.println("Which size has the kettle 1?");
        kettle1.size();

        System.out.println("From which continent the kettle 2?");
        kettle1.continent();
    }
}
