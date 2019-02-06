import javax.swing.plaf.synth.SynthSpinnerUI;

public class StaticAndNonStaticConcept {
	
	String name = "Tom"; //Non static method
	static int age = 21; // you can call directly  | This is  static method

	public static void main(String[] args) {
		
		StaticAndNonStaticConcept.sum(); // you can call sum method with class name.method name
		sum(); // you can call sum method using method name with ;
		
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		obj.sendMail();
		System.out.println(obj.name);
		
	}
	public void sendMail(){
		System.out.println("------------------");
	}
	
	public static void sum(){
		System.out.println("2nd Method sum");
	}

}
