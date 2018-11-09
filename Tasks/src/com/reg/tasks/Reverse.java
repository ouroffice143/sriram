package com.reg.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reverse {
	public static void main(String[] args) throws IOException 
	{
		//Dynamic programm
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
		
		System.out.println("Enter the size of arry:");
		int k=Integer.parseInt(br.readLine());
		
		int y[]=new int[k];
		
		for (int i = 0; i <k; i++) {
			System.out.println("Enter Number1 for an array: ");
			y[i]=Integer.parseInt(br.readLine());
		}
		
		
		System.out.println("Given Array:");
		for (int i = 0; i < k; i++) {
			System.out.print(y[i]+" ");
		}
		
		System.out.println();
		System.out.println("Right To Left Order: ");
      for (int i = k-1; i >=0; i--) 
      {
			System.out.print(y[i]+" ");
			System.out.print("");
		}
		
		
//		
//		//static
//		int a[]= {1,2,3,4,5,6};
//		int n= a.length;
//		//System.out.println(n);
//		
//		System.out.println("Left To Right Order: ");
//		for (int i = 0; i < n; i++) {
//			
//			
//			System.out.print(a[i]+" ");
//		}
//		System.out.println();
//		System.out.println("Right To Left Order: ");
//      for (int i = n-1; i >=0; i--) {
//			
//    	  
//    	  
//			System.out.print(a[i]+" ");
//		}
	}

}
