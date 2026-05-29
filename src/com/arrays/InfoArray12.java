package com.arrays;
// wap to implement binnary search algorithm
public class InfoArray12 {
	public static int b_search(int [] arr,int key) {
	int low=0;
	int high=arr.length-1;
	while (low<=high) {
	int mid=(low+high/2);
	if(arr[mid]==key) {
		return mid;	
	}
	else if(key>arr[mid]) {
		low=mid+1;
	}
	else {
		high=mid-1;
	}
	}
	return -1;
}

	public static int main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {2,4,6,8,10,12,14,16};
		int key=10;
		System.out.println(b_search(arr,key));
		return -1
				;
		
	}
} 
