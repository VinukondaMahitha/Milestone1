package com.wipro.arrays;

public class Ex14 {
public static void main(String[] args) {
	int a[][]=new int[3][3];
	int in=0,max=a[0][0];
	if(args.length==9)
	{
		System.out.println("The given array is: ");
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			a[i][j]=Integer.parseInt(args[in]);
			in++;
			System.out.print(a[i][j]+" ");
			if(a[i][j]>max)
			{
				max=a[i][j];
			}
		}
		System.out.println();
	}
	System.out.println("The biggest number in the given array is "+max);
	}
	else
	{
		System.out.println("Please enter 9 integer numbers");
	}
}
}
