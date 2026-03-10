package com.praveen.projects;

import java.util.Scanner;
public class AdminService {
    private int adminPin = 12345;
    Scanner sc = new Scanner(System.in);
    public void adminLogin(Account[] accounts, int count) {
        System.out.print("Enter Admin PIN: ");
        int pin = sc.nextInt();
        if (pin == adminPin) {
            adminMenu(accounts, count);
        } else {
            System.out.println("Invalid Admin PIN");
        }
    }
    public void adminMenu(Account[] accounts, int count) {
        while (true) {
            System.out.println("\n--- ADMIN MENU ---");
            System.out.println("1 View Accounts");
            System.out.println("2 Delete Account");
            System.out.println("3 Logout");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    viewAccounts(accounts, count);
                    break;
                case 2:
                    deleteAccount(accounts, count);
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
    public void viewAccounts(Account[] accounts, int count) {
        for (int i = 0; i < count; i++) {
            if (accounts[i] != null) {
                System.out.println("---------------");
                accounts[i].display();
            }
        }
    }
    public void deleteAccount(Account[] accounts, int count) {
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (accounts[i] != null && accounts[i].getAccountNumber() == accNo) {
                accounts[i] = null;
                System.out.println("Account Deleted");
                return;
            }
        }
        System.out.println("Account Not Found");
    }
}