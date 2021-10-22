package exceptionPackage;

public class ThrowsClass {
	
	public void m1(int a, int b) throws Exception{
		System.out.println(a/b);
		System.out.println("ABC");
	}
	
	public void m2() throws Exception{
		m1(2,0);
	}
	
	public static void main(String[] args){
		ThrowsClass t = new ThrowsClass();
		try {
			t.m2();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Program End");
	}

}
