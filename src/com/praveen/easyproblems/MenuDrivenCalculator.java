package com.praveen.easyproblems;

import java.util.Scanner;

public class MenuDrivenCalculator {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int choice;
      do {
          System.out.println("=============================");
          System.out.println("\n1. Add operation");
          System.out.println("\n2. Sub operation");
          System.out.println("\n3. Mul operation");
          System.out.println("\n4. Div operation");
          System.out.println("\n5. Exit");
          System.out.println("\n==========================");
          choice = sc.nextInt();
          switch (choice) {
              case 1: 
                  performAddition(sc);
                  break;
              case 2: 
                  performSubtraction(sc);
                  break;
              case 3: 
                  performMultiplication(sc);
                  break;
              case 4: 
                  performDivision(sc); 
                  break;
              case 5: 
                  System.out.println("Exiting..."); 
                  break;
              default: 
              System.out.println("Invalid.");
          }
      } while (choice != 5);
      sc.close();
  }
  public static void performAddition(Scanner s) {
      System.out.print("Num1 & Num2: ");
      System.out.println("Result: " + (s.nextDouble() + s.nextDouble()));
  }
  public static void performSubtraction(Scanner s) {
      System.out.print("Num1 & Num2: ");
      System.out.println("Result: " + (s.nextDouble() - s.nextDouble()));
  }
  public static void performMultiplication(Scanner s) {
      System.out.print("Num1 & Num2: ");
      System.out.println("Result: " + (s.nextDouble() * s.nextDouble()));
  }
  public static void performDivision(Scanner s) {
      System.out.print("Num1 & Num2: ");
      double n1 = s.nextDouble(), n2 = s.nextDouble();
      if (n2 == 0) System.out.println("Error: Div by zero.");
      else System.out.println("Result: " + (n1 / n2));
  }
}