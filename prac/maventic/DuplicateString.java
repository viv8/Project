package com.prac.maventic;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateString {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String");
		while (true) {
			String a = s.nextLine();
			if (!a.isEmpty()) {
				CheckStr(a);
				System.out.println("do u want to exit \n enter your choice in yes/no");
				String choice = s.next();
				if (choice.equalsIgnoreCase("yes")) {

					s.close();

					System.exit(0);
				} else if (choice.equalsIgnoreCase("no")) {
					System.out.println("Please Enter other String ");
				} else {
					System.err.println("Invalid choice");
				}

			} else {
				System.err.println("The entered String is Empty");
			}
		}
	}

	private static void CheckStr(String a) {
		char array[] = a.toCharArray();
		HashMap<Character, Integer> h = new HashMap<>();// req of wrapper class
		for (int i = 0; i < array.length; i++) {
			int count = 0;
			for (int j = 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					count++;
				}
			}
			h.put(array[i], count);
		}
		for (Map.Entry<Character, Integer> c : h.entrySet()) {
			// System.out.println(c.getKey() + " is present " + c.getValue() + "
			// times");
			if(c.getKey()!=' '){
			System.out.print(c.getKey() + ":");
			for (int i = 0; i < c.getValue(); i++) {
				System.out.print("*");
			}
			System.out.println();
			}
			else{
				continue;
			}
		}
	}
}
