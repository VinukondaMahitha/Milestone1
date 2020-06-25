package com.wipro.arrays;

public class Ex2 
{
	public static void main(String[] args) 
	{
		int a[]= {2,8,6,4,3,1};
		int max=a[0],min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("Maximum: "+max+"\nMinimum: "+min);
	}
}
