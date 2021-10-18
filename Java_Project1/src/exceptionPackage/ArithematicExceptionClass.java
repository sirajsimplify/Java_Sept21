package exceptionPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ArithematicExceptionClass {
	static ArithematicExceptionClass aE;
	public static void main(String[] args) {
		ArithematicExceptionClass a = new ArithematicExceptionClass();
		//a.arithematicException();
		//a.numberFormatException();
//		try {
//			aE.nullPointerException();
//		} catch (NullPointerException e) {
//			e.printStackTrace();
//		}		
		//a.arrayIndexOutOfBoundException();
		//a.fileNotFoundException();
		a.a11();
	}
	
	public void arithematicException() {
		int a=10;
		int b=0;
		try {
			System.out.println(a/b);			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("From Java");
		System.out.println("Name");	
	}
	
	public void numberFormatException() {
		String name = "123";
		String home = "Java Home";
		int a =10;
		int b=a;
		System.out.println(b);
		int c = 0;
		try {
			c = Integer.parseInt(home);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		System.out.println(c);
	}
	
	public void nullPointerException() {
		System.out.println("Hello");
	}
	
	public void arrayIndexOutOfBoundException() {
		int[] a1 = new int[3];
		a1[0]= 10;
		a1[1]=20;
		a1[2]=30;
		try {
			a1[4]=40;
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		System.out.println(a1[2]);
	}
	
	public void fileNotFoundException() {
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		// C:\Users\Siraj\Desktop\Projects\Sample\Project1\Java_Project1\files\abc.xlsx
		try {
			FileInputStream fis = new FileInputStream(projectPath + "/files/abc.xlsx");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Hello");
	}
	
	public void a11() {
		String a= "Java";
		try {
			System.out.println(10/1);
			try {
				System.out.println(Integer.parseInt(a));
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Finished Catch");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
}
