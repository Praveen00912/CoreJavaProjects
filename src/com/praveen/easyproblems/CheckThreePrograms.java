package com.praveen.easyproblems;

import java.util.Scanner;

public class CheckThreePrograms { // This should be the only top-level class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        
        if (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid integer.");
            return;
        }
        
        int number = scanner.nextInt();
        scanner.close();

        System.out.println("Results for number " + number + ":");
        System.out.println("Prime: " + isPrime(number));
        System.out.println("Perfect: " + isPerfect(number));
        System.out.println("Armstrong: " + isArmstrong(number));
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static boolean isPerfect(int n) {
        if (n <= 1) return false;
        int sum = 1;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                sum += i;
                if (i != n / i) sum += n / i;
            }
        }
        return sum == n;
    }

    public static boolean isArmstrong(int n) {
        if (n < 0) return false;
        int originalNumber = n, sum = 0;
        int digits = String.valueOf(n).length();
        int temp = n;
        while (temp != 0) {
            sum += Math.pow(temp % 10, digits);
            temp /= 10;
        }
        return sum == originalNumber;
    }
}