package com.praveencodegnan.methodsprogram;
import java.util.Scanner;

class StudentGradingSystem{
	

public static void inputStudentData(Scanner sc, String[] names, int[][] marks, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");

            System.out.print("Enter student name: ");
            names[i] = sc.nextLine();

            System.out.print("Enter marks for Subject 1: ");
            marks[i][0] = sc.nextInt();

            System.out.print("Enter marks for Subject 2: ");
            marks[i][1] = sc.nextInt();

            System.out.print("Enter marks for Subject 3: ");
            marks[i][2] = sc.nextInt();

            sc.nextLine();
        }
    }

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

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of students: ");
    int n = sc.nextInt();
    sc.nextLine();

    String[] names = new String[n];
    int[][] marks = new int[n][3];
    int[] totals = new int[n];
    double[] percentages = new double[n];
    char[] grades = new char[n];

    inputStudentData(sc, names, marks, n);

    for (int i = 0; i < n; i++) {

        totals[i] = marks[i][0] + marks[i][1] + marks[i][2];

        percentages[i] = totals[i] / 3.0;

        grades[i] = calculateGrade(percentages[i]);
}}}