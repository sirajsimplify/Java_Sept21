package package1;

import java.sql.SQLException;

public class Class2 {
	
	public void m1() throws Exception{
		System.out.println("Hello");
	}
	
	public void m2() throws Exception {
		m1();
	}
	
	public void m3() throws Exception {
		m2();
	}
	
	public static void main(String[] args) {
		Class2 c = new Class2();
		try {
			c.m3();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("End");
	}
	
}
