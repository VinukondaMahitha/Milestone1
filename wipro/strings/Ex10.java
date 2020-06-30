package com.wipro.strings;
import java.util.*;
public class Ex10 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	int n=sc.nextInt();
	int l=s.length()-n;
	String h="";
	for(int i=0;i<n;i++)
		h=h+s.substring(l);
	System.out.println(h);
}
}
