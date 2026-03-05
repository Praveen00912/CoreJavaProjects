package com.praveen.easyproblems;

public class PrimeNo {
	public static void main(String[] args) {
        int n=17;
        boolean isPrime=true;
        for(int i=2;i*i<=n;i++){
            if(n%i==0)
        {
            isPrime=false;
            break;
        }
        }
        
        if(isPrime){
            System.out.println("Is Prime");
        }else{
            System.out.println("Not a Prime");
        }
    }
}