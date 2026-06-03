package com.Arraysleetcode;
//wap to count all the sub arrays whose sum is subarray
public class SubArrays3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {-5,0,5,2,-2};
		int max=arr[0];
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				int sum=0;
				for(int k=i;k<=j;k++) {
					sum+=arr[k];
				}
				if(sum==0) {
					count++;
				}
			}
		}
		System.out.println(count);
		

	}

}
