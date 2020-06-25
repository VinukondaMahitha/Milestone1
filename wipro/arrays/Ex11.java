package com.wipro.arrays;

public class Ex11 {
public static void main(String[] args) {
	int a[]=new int[args.length];
	int c=0;
	for(int i=0;i<args.length;i++)
	{
		a[i]=Integer.parseInt(args[i]);
		if(a[i]==1 || a[i]==4)
		{
			c=c+1;
		}
	}
	if(c==a.length)
		System.out.println("true");
	else
		System.out.println("false");
}
}
