package com.company;

public abstract class Employee implements Comparable<Employee> {
    private String name;
    private String employeeId;

    public Employee(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return "Employee {" +
                "employeeID: " + employeeId +
                ", name: " + name + '}';
    }

    public double calculatePay() {
        return 0;
    }
}