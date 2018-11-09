




/**
*
*/





package com.reg.tasks;

import java.util.Scanner;

public class PattrenProgram {

	public static void main(String[] args) 
	{
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of rows:");
		int r=sc.nextInt();
		
		 for (int i = 1; i <= r; i++)
         {
             for (int j = r; j > i; j--)
             {
                 System.out.print(" ");
             }

             for (int k = 1; k <= i; k++)
             {
                 System.out.print(i+" ");
             }
             System.out.println("");
         }
		
	}
}
