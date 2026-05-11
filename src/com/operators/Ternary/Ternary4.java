package com.operators.Ternary;

public class Ternary4 {

    public static void main(String[] args) {

        int a = 10;
        int b = 40;
        int c = 45;

   
        int res1 = (a < b) ? (a < c ? a : c) : (b < c ? b : c);
        System.out.println("Minimum: " + res1);

        // Find maximum using ternary
        int res2 = (a > b && a > c) ? a : (b > a && b > c) ? b : c;
        System.out.println("Maximum: " + res2);
    }
}
