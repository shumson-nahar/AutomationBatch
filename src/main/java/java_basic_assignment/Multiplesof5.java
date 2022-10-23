package java_basic_assignment;

public class Multiplesof5 {
	//WAP to print first 100 multiple of 5 and add those multiples 

	public static void main(String[] args) {
		
		int k=5;
		int sum = 0;
		while (k<=5*100) {
			
			System.out.println(k + " ");
			
			sum=sum+k;
			k=k+5;
			System.out.println();
			System.out.println("Final sum is : " +sum);
			
		}

	}

}
