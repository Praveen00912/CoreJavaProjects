package com.praveen.easyproblems;

public class Manager extends Employee {
 // Additional field specific to Manager
 private String department;

 // Constructor that calls the superclass constructor using 'super'
 public Manager(int empId, String empName, double salary, String department) {
     super(empId, empName, salary); // Invoke parent class constructor
     this.department = department;
 }

 // Getter and setter for the department field
 public String getDepartment() {
     return department;
 }

 public void setDepartment(String department) {
     this.department = department;
 }

 // Method overriding: providing a specific implementation for the Manager
 @Override
 public String toString() {
     // Accessing inherited fields via getter methods
     return "Manager [ID: " + getEmpId() + ", Name: " + getEmpName() + ", Salary: $" + getSalary() + ", Department: " + department + "]";
 }
}