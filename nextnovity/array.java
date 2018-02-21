package com.nextnovity;

import java.util.Arrays;

public class array {
	public static void main(String[] args) {
		int a[]={45,65,12,19,1,78};
		//char a[]={'x','s','a','q','r'};
		//Arrays.sort(a);
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < a.length; j++) {
				if(a[i]<a[j]){
					/*temp=a[j];
					a[j]=a[i];
					a[i]=temp;*/
					/*a[i]=a[i]+a[j];
					a[j]=a[i]-a[j];
					a[i]=a[i]-a[j];*/
					a[i]=a[i]*a[j];
					a[j]=a[i]/a[j];
					a[i]=a[i]/a[j];
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.err.println(a[i]);
		}
	}
}
