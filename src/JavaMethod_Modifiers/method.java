package JavaMethod_Modifiers;

public class method {
	
	static //normal method
	void addition() {
		System.out.println("this is the addition method");
	}
    
	//return method
	String returnMethod() {
		return "returnMeth";
	}
	
	// parameterised method
	
	int mutltiplication(int a, int b) {
		return a*b;
	}
	
	public static void main(String[] args) {     // main class
		// TODO Auto-generated method stub

		method object = new method();
		object.addition();
		
		System.out.println(object.returnMethod());
	    int x= object.mutltiplication(10,5 );
		System.out.println(x);
		addition();
	}

}
