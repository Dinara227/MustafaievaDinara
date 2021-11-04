package com.company;

public class SalariedEmployee extends Employee implements PayCalculation {

    private double hourlyRate;
    private int hoursWorked;
    private String socialSecurityNumber;

    public SalariedEmployee(String name, String employeeId, double hourlyRate, int hoursWorked, String socialSecurityNumber) {
        super(name, employeeId);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public int compareTo(Employee o) {
        if(this.calculatePay()<o.calculatePay())
            return -1;
        else if(o.calculatePay()<this.calculatePay())
            return 1;
        return 0;
    }

    @Override
    public String toString() {
        return "Employee {" +
                "employeeID: " + getEmployeeId() +
                ", name: " + getName()+ ", salary: " + calculatePay()+ '}';
    }
}