package com.wipro.arrays;

public class Ex13 {
public static void main(String[] args) {
	int in=0;
	int a[][]=new int[2][2];
	if(args.length<4 || args.length>4)
	{
		System.out.println("Please enter 4 integer numbers");
	}
	else
	{
	System.out.println("The given array is :");
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
		{
			a[i][j]=Integer.parseInt(args[in]);
			System.out.print(a[i][j]+" ");
			in++;
		}
		System.out.println();
	}
	System.out.println("The reverse of the array is :");
	for(int j=1;j>=0;j--)
	{
		for(int i=1;i>=0;i--)
		{
			System.out.print(a[j][i]+" ");
		}
		System.out.println();
	}
	}
}
}
