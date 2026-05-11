package com.arrays;

public class InfoArray4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {12,23,34,45,56,78};
		int count=0;
		double sum=0;
		for(int ele:arr) {
			if(ele%2==0) {
				sum +=ele;
				count++;
				
			}
		}
		System.out.println(sum/count);

	}

}//45.0
