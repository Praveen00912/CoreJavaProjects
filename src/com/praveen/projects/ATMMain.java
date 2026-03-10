package com.praveen.projects;

import java.util.Scanner;
public class ATMMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATMService atm = new ATMService();
        AdminService admin = new AdminService();
        while (true) {
            System.out.println("\n===== ATM SYSTEM =====");
            System.out.println("1 Create Account");
            System.out.println("2 Login");
            System.out.println("3 Admin Login");
            System.out.println("4 Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    atm.createAccount();
                    break;
                case 2:
                    atm.login();
                    break;
                case 3:
                    admin.adminLogin(atm.accounts, atm.count);
                    break;
                case 4:
                    System.out.println("Thank you! Exiting");
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
            }
        } 
    }
}