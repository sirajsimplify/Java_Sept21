package exceptionPackage;

public class FinalCLass extends ThrowException{
	
	final int pinCode =10;
	
	public static void main(String[] args) {
		FinalCLass f = new FinalCLass();
		System.out.println("Your pincode is = "+f.pinCode);
		//f.pinCode=20;
		int j = f.pinCode +10;		
		System.out.println("Your pincode has changed to = "+ j);
		
		FinalCLass fin = new FinalCLass();
		ThrowException t = new ThrowException();
		fin = null;
		
	}

}
