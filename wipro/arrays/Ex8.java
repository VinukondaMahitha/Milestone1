package com.wipro.arrays;

public class Ex8 {
public static void main(String[] args) {
	int a[]= {7,1,2,3,6};
	int sum=0,s=0,se=0;
	for(int i=0;i<a.length;i++)
	{
		sum=sum+a[i];
		if(a[i]==6)
			s=i;
		if(a[i]==7)
			se=i;
	}
	if(s<se)
	{
	for(int i=s;i<=se;i++)
	{
		sum=sum-a[i];
	}
	}
	System.out.println(sum);
	
}
}
