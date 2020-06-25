package com.wipro.arrays;

public class Ex3 {
public static void main(String[] args) {
	int a[]={1,4,34,56,7} ;
	int c=0;
	int search=Integer.parseInt(args[0]);
	for(int i=0;i<a.length;i++)
	{
		if(search==a[i])
		{
			System.out.println(i);
			break;
		}
		c=c+1;
	}
	if(c==a.length)
	{
		System.out.println("-1");
	}
}
}
