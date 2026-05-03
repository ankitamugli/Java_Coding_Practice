package com.numbers;

public class Numbers3 {
public static int beautiful_number(int i) {
	int res=0;
	while(i!=0) {
		int rem=i%10;
		res=res*10+rem;
		i=i/10;
		
	}
	return res;
}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int i=20;
		int j=23;
		int k=6;
		for(int i=20;i<j;i++) {
			int rev=i-beautiful_number(i);
			if(rev % k ==0) {
				System.out.println("beatiful number");
			}
			else {
				System.out.println("not beatiful number");
			}
		}
			
		
		
		

	}

}
