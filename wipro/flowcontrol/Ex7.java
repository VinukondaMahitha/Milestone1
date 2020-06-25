package com.wipro.flowcontrol;

public class Ex7 {
public static void main(String[] args) {
	char s='A';
	if(s>=65 && s<=90)
	{
		System.out.println(s+"->"+Character.toLowerCase(s));
	}
	else if(s>=97 && s<=127)
	{
		System.out.println(s+"->"+Character.toUpperCase(s));
	}	
}
}
