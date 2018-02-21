package com.prac.maventic;

public class EchoArgs extends Thread{
	public static void main(String[] args) 
	{
		for (int i = 0; i < args.length; i++) {
			System.out.println("argument"+i+":"+args[i]);
		}
		try
		{
		char c='K';
		System.out.println(c);c++;System.out.println(c);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		/*catch (ArithmeticException e) {
			// TODO: handle exception
		}*/
	}
}
