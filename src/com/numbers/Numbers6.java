package com.numbers;

import java.util.Scanner;

public class Numbers6 {
//wap to print all the odd numbers up to n
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter odd numbers");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
		

	}

}
