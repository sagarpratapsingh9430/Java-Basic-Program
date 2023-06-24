package com.bridgelabz.java_basic_program;
public class CompareTwoObject {

    int x;
    double y;

   CompareTwoObject(int i) {
       this.x=i;
    }
    CompareTwoObject(double j){
        this.y= j;
    }

    public static void main(String[] args) {
       CompareTwoObject obj = new CompareTwoObject(3);
       CompareTwoObject obj2 = new CompareTwoObject(23.78);
       System.out.println("If both obj are not equal then returns " + obj.equals(obj2));
        System.out.println("If both obj are equal then it returns " + obj.equals(obj));

    }
}
