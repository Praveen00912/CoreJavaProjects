package com.praveen.easyproblems;

public class SumofDigits {
	public static void main(String[] args) {
      int n=12354;
      int sum=0;
      while(n>0){
          int d=n%10;
          sum=sum+d;
          n=n/10;
      }
      System.out.println(sum);
  }
}