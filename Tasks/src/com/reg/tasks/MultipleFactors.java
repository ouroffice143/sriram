package com.reg.tasks;

import java.util.Scanner;

public class MultipleFactors {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of the array:");
		int l=sc.nextInt();
		
		int p[]=new int[l];
		
		for (int i = 0; i < p.length; i++) {
			
			System.out.println("enter element"+(i+1));
			p[i]=sc.nextInt();
		}
		
		System.out.println("Enter the number you want to check the multiple factor:");
		int f=sc.nextInt();
		
		System.out.println("Multiple factors of "+f+":");
		for (int i = 0; i < l; i++) {
			
			
			if((p[i]%f)==0)
			{
				
				System.out.println(p[i]);
	        }
			
		
		}
		}
}
