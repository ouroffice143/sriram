package com.reg.tasks;

import java.util.Scanner;

public class TriangleCircle {

	public static void main(String[] args) {
		
		
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Select The Bellow options: ");
		System.out.println("1. Area of a Triangle");
		System.out.println("2. Perimeter of a Triangle");
		System.out.println("3. Area of a Circle");
		System.out.println("4. Circumfrence of a Circle");
		int p=sc.nextInt();
		
		switch (p) {
		
		
		case 1:    
			
			  System.out.println("Enter the width of the triangle");
			  int w=sc.nextInt();
			  System.out.println("Enter the height of the triangle");
			  int h=sc.nextInt();
			  
			     int a=(w*h)/2;
			     System.out.println("Area of the Triangle:"+a);
			      break;
			 
		case 2:
			
			  System.out.println("Enter the sides values of the triangle:");
			  int x=sc.nextInt();
			  int y=sc.nextInt();
			  int  z=sc.nextInt();
			  System.out.println("Perimeters of a Triangle:"+(x+y+z));
			  break;
			
		case 3:
			
			  System.out.println("Enter the radius of a circle:");
			  
			  int r=sc.nextInt();
			  double area_circle=3.141*(r*r);
			  System.out.println("Area of a Circle:"+area_circle);
			  break;
			  
		case 4:
			
			 System.out.println("Enter the radius of a circle:");
			 int i=sc.nextInt();
			 double circum_circle=2*3.141*i;
			 System.out.println("Circumference of a Circle:"+circum_circle);
            break;                                                                                             
		
		}
	}
}
