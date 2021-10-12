package package1;

public class SuperKeyword extends ParentSuper{
	SuperKeyword(){
		//super();  // First statement
		super("Java Class");
		System.out.println("3 - From SuperKeyword Class");
	}
	
	public static void main(String[] args) {
		new SuperKeyword();
		System.out.println("4 - From main method");
		
	}
}
