package com.bridgelabz.java_basic_program;

public class Palindrome {
    public static void main(String[] args) {
        int n = 454;
        int temp,rem;
        int sum =0;

        temp = n;
        while (n>0){
            rem = n%10;
            sum = sum*10 + rem;
            n/= 10;
        }

        if (temp == sum){
            System.out.println("It is a palindrome number: " + sum);
        }else {
            System.out.println("It is not a palindrome number: " + n);
        }
    }
}
