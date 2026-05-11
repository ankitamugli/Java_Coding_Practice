package com.arrays;

public class InfoArray5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {12,23,34,45,56,78};
		int sum=0;
		for(int ele :arr) {
			sum+=ele;
		}
		System.out.println(sum/arr.length);

	}

}//41
