package com.operators.Ternary;

public class Ternary4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int resc=(a<b) ? (a<c) ? a:c :(b>c) ? b:c;
	        System.out.println(resc);
	        int a1=10;
			int b1=40;
			int c1=45;
	        int resc=(a>b)&&(a>c)?a:(b>a)&&(b>c)?b:c;
	    System.out.println(resc);

	}

}
