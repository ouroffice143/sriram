package com.reg.tasks;

import java.util.Scanner;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("------PRIME NUMBER CHECK PROGRAM-----");
		System.out.println("Enter the you want to check:");
            int p=sc.nextInt();
            
            if((p==2)||(p==3)||(p==5)||(p==7)||(p==11))
            {
            	System.out.println(p+"  is a prime");
            }
            else if ((p%2==0)||(p%3==0)||(p%5==0)||(p%7==0)||(p%11==0))
            {
            	System.out.println(p+" is not a prime");
            }
            else
            {
            	System.out.println(p+" is a prime number");
            }
            
           
            
		   
	}
}
