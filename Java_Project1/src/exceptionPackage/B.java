package exceptionPackage;

public class B extends A{

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		System.out.println("A object = " + a + " : B Object = " + b);
		//a = b;
		//System.out.println("A Object = " + a);
		try {
			b =(B) a;
		} catch (ClassCastException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("After Exception");
	}
}
