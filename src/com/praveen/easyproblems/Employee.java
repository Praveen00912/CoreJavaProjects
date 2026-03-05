package com.praveen.easyproblems;

public class Employee {
 // Private fields for data hiding (Encapsulation)
 private int empId;
 private String empName;
 private double salary;

 // Constructor to initialize the fields
 public Employee(int empId, String empName, double salary) {
     this.empId = empId;
     this.empName = empName;
     this.salary = salary;
 }

 // Public getter and setter methods (Encapsulation)
 public int getEmpId() {
     return empId;
 }

 public void setEmpId(int empId) {
     this.empId = empId;
 }

 public String getEmpName() {
     return empName;
 }

 public void setEmpName(String empName) {
     this.empName = empName;
 }

 public double getSalary() {
     return salary;
 }

 // A setter with validation to control data integrity
 public void setSalary(double salary) {
     if (salary > 0) { // Example of controlled access/validation
         this.salary = salary;
     } else {
         System.out.println("Invalid salary value. Salary must be positive.");
     }
 }

 @Override
 public String toString() {
     return "Employee [ID: " + empId + ", Name: " + empName + ", Salary: $" + salary + "]";
 }
}