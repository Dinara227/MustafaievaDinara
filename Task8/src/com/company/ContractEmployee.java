package com.company;

public class ContractEmployee extends Employee implements PayCalculation{

    private int fixedMonthlyPayment;
    private String federalTaxIdMember;

    public ContractEmployee(String name, String employeeId, int fixedMonthlyPayment, String federalTaxIdMember) {
        super(name, employeeId);
        this.fixedMonthlyPayment = fixedMonthlyPayment;
        this.federalTaxIdMember = federalTaxIdMember;
    }

    @Override
    public double calculatePay() {
        return fixedMonthlyPayment;
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