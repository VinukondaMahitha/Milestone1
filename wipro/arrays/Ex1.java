package com.wipro.arrays;

public class Ex1 {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6};
	int sum=0;
	float avg=0;
	for(int i:a)
	{
		sum=sum+i;
	}
	avg=(float)sum/(a.length);
	System.out.println("Sum: "+sum+"\naverage: "+avg);
}
}
