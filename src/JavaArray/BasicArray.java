package JavaArray;

public class BasicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// declaration of array 
		int[] arr;                  // Declaration
		 arr = new int[5];			 // Memory allocation    // creates array of size 5
		int[] array = {10,20,30,40,50};  // Declaration + Initialization together
		
		//assigning values 
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 40;
		
		for(int arrayy: array) {
			System.out.println(arrayy);
		}
	}

}
