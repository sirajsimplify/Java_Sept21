package exceptionPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ThrowClass {
	
	public static void main(String[] args) {
		ThrowClass t = new ThrowClass();
//		try {
//			t.bankZero();
//		} catch (Throwable e) {
//			e.printStackTrace();
//		}
		try {
			t.finallyMethod();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("End");
//		System.out.println("End");
//		System.out.println("End");
	}
	
	public void bankZero() {
		String pwd = "Mango";
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your name");
		String expected = s.next();
		if(expected.equalsIgnoreCase(pwd)) {
			System.out.println("Welcome");
		}
		else {
			throw new ArithmeticException("Who is " + expected);
		}	
	}	
	
	public void finallyMethod() throws Exception{
		try {
			FileInputStream fis = new FileInputStream("/files/abc.xlsx");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			System.out.println(1/0);
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}

}
