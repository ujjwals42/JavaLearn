package JavaMethod_Modifiers;


class B{
	private void display() {
		System.out.println("this is private ");
	}
	
	void dis() {
		System.out.println("this is not private ");
	}
}

public class AccessModifier_Private {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   B obj = new B();
   obj.dis();
  // obj.display();     /// will not be assisible as it is private 
	}

}
