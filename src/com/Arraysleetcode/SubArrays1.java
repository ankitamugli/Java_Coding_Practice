package com.Arraysleetcode;

public class SubArrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,4,5,9};
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				int sum=0;
				for (int k=i;k<=j;k++) {
					System.out.print(arr[k]+" ");
					sum+=arr[k];
				}
				System.out.println("sum="+sum);
				System.out.println();
			}
		}


	}

}
