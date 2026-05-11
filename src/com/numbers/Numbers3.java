package com.numbers;

public class Numbers3 {

    public static int beautiful_number(int n) {
        int res = 0;
        while (n != 0) {
            int rem = n % 10;
            res = res * 10 + rem;
            n = n / 10;
        }
        return res;
    }

    public static void main(String[] args) {

        int start = 20;
        int end = 23;
        int k = 6;

        for (int i = start; i <= end; i++) {
            int diff = Math.abs(i - beautiful_number(i));

            if (diff % k == 0) {
                System.out.println(i + " is a beautiful number");
            } else {
                System.out.println(i + " is not a beautiful number");
            }
        }
    }
}