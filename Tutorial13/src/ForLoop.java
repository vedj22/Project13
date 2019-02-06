
public class ForLoop {

	public static void main(String[] args) {
		
		String a[][] = new String[4][4];
		System.out.println(a.length);
		System.out.println(a[0].length);
			
		a[0][0] = "A0";
		a[0][1] = "A0";
		a[0][2] = "A0";
		a[0][3] = "A0";
		
		a[1][0] = "A1";
		a[1][1] = "A1";
		a[1][2] = "A1";
		a[1][3] = "A1";
		
		a[2][0] = "A2";
		a[2][1] = "A2";
		a[2][2] = "A2";
		a[2][3] = "A2";
		
		a[3][0] = "A3";
		a[3][1] = "A3";
		a[3][2] = "A3";
		a[3][3] = "A3";
		
		System.out.println(a[1][2]);
	
	for(int row=0; row<a.length; row++)
		for(int col=0; col<a[0].length;col++)
		
		System.out.println(a[row][col]);
		
	}
	
	}
