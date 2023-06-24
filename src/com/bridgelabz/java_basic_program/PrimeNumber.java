package com.bridgelabz.java_basic_program;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 23;
        int count = 0;

        for (int i=2; i<=n/2; i++){
            if (n%i==0){
                count++;

            }
        }
        if (count>1){
            System.out.println("This is not a prime number: ");
        }else {
            System.out.println("This is a prime number: " + n);
        }
    }
}
