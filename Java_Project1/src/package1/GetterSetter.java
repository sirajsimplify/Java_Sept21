package package1;

public class GetterSetter {
	
	private int a =10;
	
	public int geta() {
		return a;
	}
	
	public void setA(int a1) {
		a =a1;
	}
	
	public static void main(String[] args) {
		GetterSetter g = new GetterSetter();
		System.out.println(g.geta());
		g.setA(20);
		System.out.println(g.geta());
		final int[] aa = new int[3];
		 aa[0] = 22;
		System.out.println(aa[0]);
	}

}
