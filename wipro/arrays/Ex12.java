package com.wipro.arrays;

public class Ex12 {
public static void main(String[] args) {
	int a[]=new int[3];
	int b[]=new int[3];
	int c1[]=new int[2];
	int c=0;
	for(int i=0;i<3;i++)
	{
		a[i]=Integer.parseInt(args[i]);
	}
	for(int j=3;j<6;j++)
	{
		b[c]=Integer.parseInt(args[j]);
		c++;
	}
	c1[0]=a[1];
	c1[1]=b[1];
	for(int i:c1)
		System.out.print(i+" ");
	
	
}
}
