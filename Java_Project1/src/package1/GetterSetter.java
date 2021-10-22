package package1;

public class GetterSetter extends FinalKeyword{	
	
	public static void main(String[] args) {
		GetterSetter g = new GetterSetter();
		g.non_FinalMethod();
		g.finalMethod();
	}
	public void non_FinalMethod() {
		System.out.println("After Overriding non_FinalMethod");
	}
	
//	public void finalMethod() {
//		System.out.println("From finalMethod"); // Not possible to override
//	}
	

}
