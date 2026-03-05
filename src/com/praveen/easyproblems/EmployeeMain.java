package com.praveen.easyproblems;

public class EmployeeMain {

    public static void main(String[] args) {
        Employee emp = new Employee(101, "Alice", 50000);
        Manager mgr = new Manager(201, "Bob", 85000, "Engineering");

        System.out.println(emp.toString());
        System.out.println(mgr.toString());
    }
}