package com.nextnovity;

public class Pyramid {
	static char a[]={'a','b','i','b','a'};
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i<=j) {
					System.out.print(" ");
				}
			}
			for (int j = 0; j < 5; j++) {
				if( j==0 || j==i){
					System.out.print(a[i]);
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i<=j) {
					System.out.print(" ");
				}
			}
			for (int j = 0; j < 5; j++) {
				if( j==0 || j+i==5){
					System.out.print(a[i]);
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
