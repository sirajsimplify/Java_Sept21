package package1;

public class ClassD {
	
	public static void main(String[] args) {
		ClassD c = new ClassD();
		System.out.println(c);		
		Class2 c2 = new Class2(c);	
		
		c.addNumber(2, 3);  // Call by value
		c.showValue(c);  // Call by reference
	}
	
	public void addNumber(int a, int b) {
		System.out.println(a+b);
	}
	
	public void showValue(ClassD d) {
		System.out.println(d);
	}

}
