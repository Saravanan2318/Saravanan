package org.emp;

public class Employee1 {
	public void empId(String name) {
		System.out.println("Employee name is "+name);
	}
	public void empId(int id) {
		System.out.println("Employee id is "+id);
	}
	public void empId(long phno) {
		System.out.println("Employee phn num is "+phno);
	}
	public void empId(float sal) {
		System.out.println("Employee salary is "+sal);
	}
	public void empId(char blk) {
		System.out.println("Blk name is "+blk);
	}
public static void main(String[]args) {
	Employee1 e=new Employee1();
	e.empId(10);
	e.empId("elaa");
	e.empId(9445894431l);
	e.empId(12500.50f);
	e.empId('A');
	
}
}
