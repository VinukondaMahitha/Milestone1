package com.wipro.arrays;

public class Ex6 {
public static void main(String[] args) {
	int a[]= {5,8,2,10,6,9,74,5};
	int temp;
	for(int i=0;i<a.length-1;i++)
	{
		if(a[i]>a[i+1])
		{
			temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
			i=-1;
		}
	}
	for(int i:a)
		System.out.println(i);
}
}
