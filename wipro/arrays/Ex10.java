package com.wipro.arrays;

public class Ex10
{
	public static void main(String[] args) {
		int a[]= {3, 3, 2,2,6,9,102};
		int j=0,temp;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				j++;
			}
		}
		for(int i:a)
			System.out.println(i);
	}
}