package com.reg.tasks;

import java.util.Scanner;

public class AdditionMatrix {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size o the first matrix:");
		int row=sc.nextInt();
		int column=sc.nextInt();
		int m1[][]=new int[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.println("enter the elements for:"+i+j);
				m1[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter the size of second matrix:");
		int k=sc.nextInt();
		int l=sc.nextInt();
		int m2[][]=new int[k][l];
		
		for (int i = 0; i <k; i++) {
			for (int j = 0; j < l; j++) {
				System.out.println("enter the elements for:"+i+j);
				m2[i][j]=sc.nextInt();
				
			}
		}
		
		System.out.println("enter the size of the matrix you given");
		int p=sc.nextInt();
		int q=sc.nextInt();
		int m[][]=new int [p][q];
		
		for (int i = 0; i < p; i++) {
			for (int j = 0; j <q; j++) {
				m[i][j]=m1[i][j]+m2[i][j];
			}
		}
			
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
}
