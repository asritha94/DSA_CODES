package com.dsa.basic;

class Employees {
    private int empId;
    private String empName;
    private double salary;

    Employees(int empId, String empName, int salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary");
        }
    }

    public void display() {
        System.out.println("Employee Id is " + this.empId);
        System.out.println("Employee Name is " + this.empName);
        System.out.println("Employee Salary is " + this.salary);
    }
}

class Developer extends Employees {
    int bonusAmount;

    Developer(int empId, String empName, int salary, int bonusAmount) {
        super(empId, empName, salary);
        this.bonusAmount = bonusAmount;
    }

    public void display1() {
        display();
        System.out.println("Salary with Bonus = " + (getSalary() + bonusAmount));
    }
}

class Tester extends Employees {
    int bugBonusAmount;

    Tester(int empId, String empName, int salary, int bugBonusAmount) {
        super(empId, empName, salary);
        this.bugBonusAmount = bugBonusAmount;
    }

    public void display2() {
        display();
        System.out.println("Salary with Bug Bonus = " + (getSalary() + bugBonusAmount));
    }
}

public class Task {
    public static void main(String[] args) {
        Developer d = new Developer(101, "Pavithra", 12000, 5000);
        Tester t = new Tester(102, "Avi", 20000, 4000);

        d.display1();
        System.out.println();

        t.display2();
    }
}