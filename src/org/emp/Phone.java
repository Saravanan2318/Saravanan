package org.emp;

public class Phone {
	public void phoneInfo(int id,String name) {
		System.out.println("phn id is "+id+"\n"+"phn name is "+name);
	}
	public void phoneInfo(long phno,float rate) {
		System.out.println("phn num is "+phno+"\n"+"price "+rate);
	}
	public void phoneInfo(String mdl,char type) {
		System.out.println("phn mdl is "+mdl+"\n"+"phn type is "+type);
	}
	public static void main(String[] args) {
		Phone p=new Phone();
		p.phoneInfo(25, "apple");
		p.phoneInfo(95986595495l, 50000.65f);
		p.phoneInfo("iphone6", 'B');
	}

}
