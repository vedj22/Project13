
public class MethodOverLoading {

	public static void main(String[] args) {
		
		MethodOverLoading a1 = new MethodOverLoading();
		
		a1.sum();
		a1.sum(10);
		a1.sum(10, 10);
	}
		
		public void sum(){
			System.out.println("1st default method");
		}
		
		public void sum(int i){
			System.out.println("*  This is Overloading Method with one Data Type with one value");
			System.out.println(i);
		}
			public void sum(int j, int k){
				System.out.println("*  Method with two Data Type with Two values");
				System.out.println(j+k);
				
			}
	}
