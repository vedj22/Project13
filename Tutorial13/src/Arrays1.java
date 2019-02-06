
public class Arrays1 {

	public static void main(String[] args) {
		
		String a[][] = new String[3][4];
		
		System.out.println(a.length);
		System.out.println(a[0].length);
		
		a[0][0]= "A10";
		a[0][1]= "A10";
		a[0][2]= "A10";
		
		a[1][0]= "A20";
		a[1][1]= "A20";
		a[1][2]= "A20";
		
		a[2][0]= "A30";
		a[2][1]= "A30";
		a[2][2]= "A30";
		System.out.println(a[0][2]);
	
	for(int k=0; k<a.length; k++)
		for (int col=0; col<a[0].length; col++)
	
	System.out.println(a[k][col]);
	}
}

