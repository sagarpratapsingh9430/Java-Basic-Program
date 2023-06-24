package com.bridgelabz.java_basic_program;

public class ArmStrong {
    public static void main(String[] args) {
        int number = 371, rem, temp, result = 0;
        temp = number;
        while (number>0){
            rem = number%10;
            result+=Math.pow(rem,3);
            number/=10;
        }

        if (temp==result){
            System.out.println("This is a armstrong number: " + result);
        }else {
            System.out.println("It is not a armstrong number: " + number);
        }
    }
}
