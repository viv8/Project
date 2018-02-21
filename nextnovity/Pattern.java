package com.nextnovity;

/*public class Pattern {

	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			if (i<10) {
				System.out.print(i+ " ");
			}
			else if (i<20) {
				System.out.print(20-i+" ");
			}
			
		}

	}

}*/
public class Pattern {
 static char a[]={'a','b','i','b','a'};
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i<=j) {
					System.out.print(" ");
				}
			}
			for (int j = 0; j < 5; j++) {
				if( j==0 || j==4){
					System.out.print(a[i]);
					System.out.println(" ");
				}
				else if(i==0 || i==4){
					System.out.print(a[j]);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
	}
}
