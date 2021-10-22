package package1;

 public class FinalCLass {
	 
	 int j;
	 final int k=20;
	 
	 public static void main(String[] args) {
		 FinalCLass f = new FinalCLass();
		 f.method(2020, 20);
		 f.method(20, 20);
	}
	
	void method(final int a, int b){
		//a=90;
		b=10;
		System.out.println(a+b);
	}

}
