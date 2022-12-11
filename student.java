package com.HarryProject;


import java.util.Scanner;

public class student {
	public static void main(String[] args)
	{
	byte n1 , n2 , n3;	
		Scanner sc = new Scanner(System.in);
		System.out.println("marks");
		n1 = sc.nextByte();
		
		
		System.out.println("marks2");
		n2 = sc.nextByte();
		
		System.out.println("marks3");
		n3 = sc.nextByte();
		
		
		
		float sum = n1 + n2 + n3;
		
		float avg = sum/3.0f;
		
		if (n1>=33 && n2>=33 && n3 >=33 && avg >=40 ) {
			System.out.println("pass");
		}
		else {
			
			System.out.println("fail");}
		
		
		
		
		
				}
	
}
