package com.numbers;

public class Numbers2 {

//	public static void main(String[] args) {
		// TODO Auto-generated method stub
public static int get_sq(int num) {
	int sum=0;
	while(num !=0) {
		
	int rem=num%10;
	sum=sum+(rem*rem);
	num=num/10;
		
	}
	return sum;
}
public static void main(String[] args) {
	int num=18;
//	int num=7;
	while(num !=1 && num!=4) {
		num=get_sq(num);
//		System.out.println("num");
	}
	if (num==1) {
		System.out.println("happy");
	}
	else {
		System.out.println("not happy");
		
	}
	
	}

}
