package exceptionPackage;

public class ThrowException {
	int i =9;
	
	public void method1(){
		if(i!=10) {
			System.out.println("if block");
			throw new NullPointerException("Number is not equal to 10");
		}
	}
	
	
	public static void main(String[] args) {
		ThrowException t = new ThrowException();
		try {
			t.method1();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Last line");
	}

}
