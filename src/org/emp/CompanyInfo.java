package org.emp;

public class CompanyInfo {
	public void companyName(int cmnyId,String cmnyName) {
		System.out.println("company id is "+cmnyId+"\n"+"company name is "+cmnyName);
	}
	public void companyName(long phno,String add,char block) {
		System.out.println("phn num is "+phno+"\n"+"company address is "+add+"\n"+"block number is "+block);
	}
	public static void main(String[] args) {
		CompanyInfo c=new CompanyInfo();
		c.companyName(25305, "cts");
		c.companyName(8458975263l, "chennai", 'D');
	}

}
