package org.emp;

public class GreensTech {
	public void greensOmr(String name) {
		System.out.println("name is "+name);
	}
	public void greensOmr(String branch,int num) {
		System.out.println("name is "+branch+"\n"+"door num is "+num);
	}
	public void greensOmr(char floor) {
		System.out.println("floor"+floor);
	}
	public void greensOmr(String add,long phno,char blk) {
		System.out.println("address is "+add+"\n"+"phn num is "+phno+"\n"+"block num is "+blk);
	}
	public static void main(String[] args) {
		GreensTech g=new GreensTech();
		g.greensOmr("GreensTechnology");
		g.greensOmr("omr", 25);
		g.greensOmr('1');
		g.greensOmr("thoraipakkam", 8794561230l, 'A');
	}

}
