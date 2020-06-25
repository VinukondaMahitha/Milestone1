package com.wipro.inheritance;

public class TestEmployee {
public static void main(String[] args) {
	Person p=new Person("mahitha");
	p.setName("mahi");
	p.getName();
	Employee e=new Employee(150000,2020,"poi123");
	System.out.println(e.getName());
	System.out.println(e.getAnnualsalary());
	System.out.println(e.getYear());
	e.getInsu_num();
	
}
}
