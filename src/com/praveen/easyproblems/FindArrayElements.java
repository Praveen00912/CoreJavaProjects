package com.praveen.easyproblems;

import java.util.Arrays;
import java.util.Scanner;

public class FindArrayElements {
	public static void main(String[] args) {      
	     Scanner sc = new Scanner(System.in);
	     int[] number = {45, 12, 98, 33, 27, 10, 50};
	         int min = number[0];
	         int max = number[0];
	         long sum = 0;        
	         for (int num : number) {
	             if (num > max) {
	                 max = num;
	             }
	             if (num < min) {
	                 min = num;
	             }
	             sum += num;
	         }
	         double average = (double) sum / number.length;
	         System.out.println("Array elements: " + java.util.Arrays.toString(number));
	         System.out.println("Maximum element: " + max);
	         System.out.println("Minimum element: " + min);
	         System.out.println("Sum of elements: " + sum);
	         System.out.println("Average of elements: " + average);
	         sc.close();
	     }
}
