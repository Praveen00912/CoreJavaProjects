package com.praveen.easyproblems;

public class LeapYear {
	public static void main(String[] args) {
      int year= 2016;
      if(year%4==0 || year%400==0){
              System.out.println(year+ " Is a leap year.");
          }else{
      System.out.println("not");
      }
  }
}
