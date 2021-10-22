package package1;

import exceptionPackage.A;

public class FinalKeyword {
	// public class FinalKeyword extends FinalCLass
	final static String serverName ="Java_JDK_1.8";
	final int serverPortNumber = 1002;
	FinalKeyword(){
		System.out.println("From constructor");
	}
	
	
	public static void main(String[] args) {
		 FinalKeyword f = new FinalKeyword();
		//System.out.println(f);
		 f=null;
		final int[] a = new int[3];
		System.out.println(a);
		a[0]=10;
		a[1]=10;
		a[2]=10;
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		a[0]=78;  // Size becomes final, their index values never become final
//		a=null;  // Not allowed
//		a = new int[4];  // Not allowed
//		System.out.println(a);
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//		}
		
//		final A a = new A();
//		a.m1();		
//		final int a =10;
//		System.out.println(a);
//		System.out.println(serverName);
//		System.out.println(f.serverPortNumber);
		//f.serverPortNumber = 1122;  // Not possible
	}
	
	public void non_FinalMethod() {
		System.out.println("From non_FinalMethod");
	}
	
	final public void finalMethod() {
		System.out.println("From finalMethod");
	}

}
