package com.wipro.arrays;

public class Ex9 
{
	public static void main(String[] args) {
		int a[]= {10, 2, 10};
		int n=a.length;
		int temp,j=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]!=0)
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				j++;
			}
			if(a[i]==10)
				a[i]=0;
		}
		for(int i:a)
			System.out.println(i);
	}
}
