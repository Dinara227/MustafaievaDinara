package com.company;
import java.util.Comparator;
import static java.util.Arrays.sort;

public class Main {

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new SalariedEmployee("Alina", "1", 3.5, 150, "000001");
        employees[1] = new SalariedEmployee("Anna", "2", 2.5, 130, "000002");
        employees[2] = new SalariedEmployee("Iryna", "3", 2.8, 145, "000003");
        employees[3] = new ContractEmployee("Oleksiy", "4", 3500, "000004");
        employees[4] = new ContractEmployee("Ihor", "5", 2000, "000005");

        System.out.println("-------Before Sort--------");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
        System.out.println();

        System.out.println("-------After Sort-----");
        sort(employees, Comparator.reverseOrder());
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}