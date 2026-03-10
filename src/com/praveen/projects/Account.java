package com.praveen.projects;

public class Account {
    private String username;
    private String location;
    private int accountNumber;
    private int pin;
    private double balance;

    public Account(String username, String location, int accountNumber, int pin, double balance) {
        this.username = username;
        this.location = location;
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public int getPin() {
        return pin;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        balance -= amount;
    }
    public void display() {
        System.out.println("Name: " + username);
        System.out.println("Location: " + location);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}