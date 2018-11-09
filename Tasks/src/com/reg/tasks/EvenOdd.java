package com.reg.tasks;

import java.util.Scanner;

public class EvenOdd {
	
  public static void main(String[] args) {
	
	  
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the size of the array:");
	  
	  int k=sc.nextInt();
	  int q[]=new int[k];
	  //entering elements to the array
	  for (int i = 0; i < k; i++) {
		
		  
		  System.out.println("enter the element"+(i+1));
		  q[i]=sc.nextInt();
	}
	
	  int temp=0;
	  
	  //sorting the given array
	  for(int i=0;i<k;i++)
		{
			for(int j=0;j<k;j++)
			 {
				
		
				if(q[i]<q[j])
				
						{
					       temp=q[i];
					       q[i]=q[j];
					       q[j]=temp;
						}
			 }		
				
		}
	  System.out.println("odd desending order and even assending order");
	//odd Desending order
	 for (int i = 0; i < k; i++) 
	 {
		if(q[i]%2!=0)
		{
			System.out.print(q[i]+" ");
		}
	}
	 //even assending order
	 System.out.print("-");
	 for (int i =k-1; i>=0; i--) {
		if(q[i]%2==0)
		{
			System.out.print(q[i]+" ");
		}
	}
		  
		
	}
	  
	  
	  
	  
}

