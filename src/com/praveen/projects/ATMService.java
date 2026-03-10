package com.praveen.projects;

import java.util.Scanner;
public class ATMService {
    Account[] accounts = new Account[10];
    int count = 0;
    Scanner sc = new Scanner(System.in);
    public void createAccount() {
        System.out.print("Enter Username: ");
        String name = sc.nextLine();
        System.out.print("Enter Location: ");
        String location = sc.nextLine();
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        System.out.print("Enter PIN: ");
        int pin = sc.nextInt();
        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();
        accounts[count] = new Account(name, location, accNo, pin, balance);
        count++;
        System.out.println("Account Created Successfully!");
    }
    public void login() {
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        System.out.print("Enter PIN: ");
        int pin = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (accounts[i].getAccountNumber() == accNo && accounts[i].getPin() == pin) {
                System.out.println("Login Successful!");
                userMenu(accounts[i]);
                return;
            }
        }
        System.out.println("Invalid Credentials");
    }
    public void userMenu(Account acc) {
        while (true) {
            System.out.println("\n--- USER MENU ---");
            System.out.println("1 Withdraw");
            System.out.println("2 Deposit");
            System.out.println("3 Check Balance");
            System.out.println("4 Logout");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    withdraw(acc);
                    break;
                case 2:
                    deposit(acc);
                    break;
                case 3:
                    System.out.println("Balance: " + acc.getBalance());
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
    public void withdraw(Account acc) {
        System.out.print("Enter Amount: ");
        int amount = sc.nextInt();
        if (amount % 100 != 0) {
            System.out.println("Amount must be multiple of 100");
            return;
        }
        if (amount > acc.getBalance()) {
            System.out.println("Insufficient Balance");
            return;
        }
        acc.withdraw(amount);
        System.out.println("Withdrawal Successful");
    }
    public void deposit(Account acc) {
        System.out.print("Enter Amount: ");
        int amount = sc.nextInt();
        if (amount % 100 != 0) {
            System.out.println("Amount must be multiple of 100");
            return;
        }
        acc.deposit(amount);
        System.out.println("Deposit Successful");
    }
}