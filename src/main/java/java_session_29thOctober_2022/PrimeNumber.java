package java_session_29thOctober_2022;

public class PrimeNumber {

	public static void main(String[] args) {
		int i, j, k;
		System.out.println("--Prime Numbers from 1 to  10----");
		for(i=2; i<=100; i++) {
			k=0;
			for(j=2; j<i; j++) {
				if(i%j==0) {
					k++;
					break;
				}
			}
			
		
		if(k==0)
			System.out.println(i);

	}
		
		
	}
}


