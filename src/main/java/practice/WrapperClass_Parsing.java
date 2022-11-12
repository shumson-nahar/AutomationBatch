package practice;

public class WrapperClass_Parsing {

	public static void main(String[] args) {
		String price1="12.98";
		String Price2="7.70";
		System.out.println(price1 + Price2);//this will just concatenate
		
		double p1 = Double.parseDouble(price1);
		double p2 = Double.parseDouble(Price2);
		double sum = p1 + p2;
		System.out.println(sum);
		
		String a= "25";
		String b = "35";
		
		int val1 = Integer.parseInt(a);
		int val2 = Integer.parseInt(b);
		
		int result = val1 +val2;
		System.out.println(result);
		
		
	}

}
