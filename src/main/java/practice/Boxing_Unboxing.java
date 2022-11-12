package practice;

public class Boxing_Unboxing {

	public static void main(String[] args) {
		//Boxing (do this manually)- conversion of primitive to Wrapper class object
		int x = 20;
		Integer y = Integer.valueOf(x);
		System.out.println(y);
		
		//Autoboxing 
		 
		
		int a = 100;
		Integer b = a;
		System.out.println(b);
		
		//Unboxing     - conversion of Wrapper class object to primitive
		
		Integer result = 50;
		int newResult = result.intValue();
		System.out.println(newResult);
		
		
		//Autoboxing 
		
		Integer marks = 90;
		int newMarks = marks;
		System.out.println(newMarks);
		

	}

}
