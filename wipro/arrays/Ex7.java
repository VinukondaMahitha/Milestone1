package com.wipro.arrays;

public class Ex7 {
public static void main(String[] args) {
	int a[]= {12,34,12,45,67,89};
	int n=a.length;
	  for (int i=0; i < n; i++)
	  {  
		  for(int j=i+1;j<n;j++)
		  {
			  if(a[i]==a[j])
				  a[j]=-1;
		  }
		  if(a[i]!=-1)
			  System.out.println(a[i]);
      }  
      }
}
