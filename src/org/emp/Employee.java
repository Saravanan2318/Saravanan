package org.emp;

public class Employee {
public void empId() {
	System.out.println("empId is 123");
}
public void empName() {
	System.out.println("empName is dev");
}
public void empDob() {
	System.out.println("empDob id 04-12-1969");
}
public void empPhn() {
	System.out.println("empPhn is 9444998412");
}
public static void main(String[] args) {
	Employee e=new Employee();
	e.empId();
	e.empName();
	e.empDob();
	e.empPhn();
}
}
