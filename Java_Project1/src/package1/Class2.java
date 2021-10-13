package package1;

public class Class2 extends ClassD{
	ClassD d;
	Class2(ClassD d){
		this.d = d;
		System.out.println(d);
	}
	
	public void method1() {
		ClassD c1 = new ClassD();
		System.out.println(c1);
	}
	
	
	
	
}
