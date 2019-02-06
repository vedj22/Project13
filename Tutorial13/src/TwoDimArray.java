
public class TwoDimArray {

	public static void main(String[] args) {
		
		
		String a[][] = new String [2][4];
		
		System.out.println(a.length); // Total number of rows
		System.out.println (a[0].length); // Total number of columns
		
		a[0][0] = "A";
		a[0][1] = "A1";
		a[0][2] = "A2";
		a[0][3] = "A3";
		
		System.out.println(a[0][2]);
	}

}
