package abstractionPackage;

public class ArraysJava {
	
	public static void main(String[] args) {
		ArraysJava a = new ArraysJava();
		a.oneDimensionalArray();
		a.twoDimensionalArray(2, 3);
	}
	
	public void oneDimensionalArray() {
		int[] a = new int[3];
		int j = a.length;
		for(int i=0; i<j; i++) {
			a[i] =i;
			System.out.println(a[i]);
		}
	}
	
	public void twoDimensionalArray(int a1, int b1) {
		int[][] a = new int[a1][b1];
		int j = a.length;
		System.out.println("size of an array = "+j);
		int h = 0;
		for(int i=0; i<j; i++) {
			for(int k=0; k<b1; k++) {
				a[i][k] = h;
				System.out.println(a[i][k]);
				h++;
			}
			
		}
	}

}
