package com.wipro.Patterns;

public class Ex1 {
	
public static void main(String[] args) {
	int a[][]=new int[3][];
	a[0]=new int[1];
	a[1]=new int[2];
	a[2]=new int[3];
	int s=0;
	for(int i=0;i<3;++i)
	{
		for(int j=0;j<i+1;++j)
			a[i][j]=j+1;
	}
	for(int i=0;i<3;++i)
	{
		for(int j=0;j<i+1;++j)
			s+=a[i][j];
	}
	System.out.println(s);
}
}
