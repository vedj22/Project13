
public class ArrayConcept {

	public static void main(String[] args) {
		
		int a[] = new int[4]; 
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		
		System.out.println(a[2]);

			
	double b[]=new double[3];
	b[0]=11.11;
	b[1]=22.22;
	b[2]=33.33;
	
	System.out.println(b[2]);
	
	char e[]=new char[2];
	e[0]='m';
	e[1]='f';
	
	System.out.println(e[1]);
	
	//Objet 
	
	Object ob[]=new Object[5];
	ob[0]="Vedant";
	ob[1]='M';
	ob[2]=1978;
	ob[3]=12.22;
	ob[4]="Jagani";
	System.out.println(ob[4]);
	System.out.println(ob.length);
	
}
}