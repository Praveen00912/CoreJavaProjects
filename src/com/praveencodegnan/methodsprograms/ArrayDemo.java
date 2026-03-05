package com.praveencodegnan.methodsprograms;

import java.util.Scanner;
public class ArrayDemo {
	
	// Method to input student data
    public static void inputStudentData(String[] names, int[][] marks, int n, Scanner sc) {
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");

            System.out.print("Enter student name: ");
            names[i] = sc.nextLine();

            System.out.print("Enter marks for Subject 1: ");
            marks[i][0] = sc.nextInt();

            System.out.print("Enter marks for Subject 2: ");
            marks[i][1] = sc.nextInt();

            System.out.print("Enter marks for Subject 3: ");
            marks[i][2] = sc.nextInt();

            sc.nextLine(); // consume newline
        }
    }
    
 // Method to calculate grade based on percentage
    public static char calculateGrade(double percentage) {
        if (percentage >= 90)
            return 'A';
        else if (percentage >= 80)
            return 'B';
        else if (percentage >= 70)
            return 'C';
        else if (percentage >= 60)
            return 'D';
        else
            return 'F';
    }

    // Method to find topper index
    public static int findTopper(double[] percentages) {
        int topperIndex = 0;

        for (int i = 1; i < percentages.length; i++) {
            if (percentages[i] > percentages[topperIndex]) {
                topperIndex = i;
            }
        }
        return topperIndex;
    }
    

    // Method to calculate class average percentage
    public static double calculateClassAverage(double[] percentages) {
        double sum = 0;

        for (double p : percentages) {
            sum += p;
        }

        return sum / percentages.length;
    }

    // Method to display results
    public static void displayResults(String[] names, int[] totals, double[] percentages, char[] grades, int topperIndex) {

        System.out.println("\n========== CLASS PERFORMANCE REPORT ==========");

        System.out.printf("%-15s %-12s %-12s %-8s %-8s\n",
                "Name", "Total Marks", "Percentage", "Grade", "Topper");

        System.out.println("--------------------------------------------------------");

        for (int i = 0; i < names.length; i++) {

            String topperSymbol = (i == topperIndex) ? "🏆" : "";

            System.out.printf("%-15s %-12d %-12.2f %-8c %-8s\n",
                    names[i], totals[i], percentages[i], grades[i], topperSymbol);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        // Arrays to store data
        String[] names = new String[n];
        int[][] marks = new int[n][3];
        int[] totals = new int[n];
        double[] percentages = new double[n];
        char[] grades = new char[n];

        // Input data
        inputStudentData(names, marks, n, sc);

        // Calculate total, percentage, grade
        for (int i = 0; i < n; i++) {

            totals[i] = marks[i][0] + marks[i][1] + marks[i][2];

            percentages[i] = totals[i] / 3.0;

            grades[i] = calculateGrade(percentages[i]);
        }

        // Find topper
        int topperIndex = findTopper(percentages);

        // Calculate class average
        double classAverage = calculateClassAverage(percentages);

        // Display results
        displayResults(names, totals, percentages, grades, topperIndex);

        // Display class average
        System.out.printf("\nClass Average Percentage: %.2f%%\n", classAverage);

        // Close scanner
        sc.close();
    }
}