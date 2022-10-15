package java_basic_assignment;

public class Inc_Dec_combined {

	public static void main(String[] args) {
		int i = 1;
		
		int j = ++i - --i;
		//i = 1+1     -1-2
		//j = 2    -  -3 = -1
		// latest value of i is -3,j is -1
		
		int k = j-- - --i + i-- - --j;
		// j = 0       -1-3  -4-1  -1-0
		// k = (-1-1) - (-1-3) + (-3-1) - (-1-1)
		
		// latest value of k is 0 
		
		int l = --k - k-- + i-- - --i + j++ - --j;
		// k = -1-0   -1-1  -3-1   -1-3  -1+1  -1-0
		// l = (-1-0)  -( 0-1) + (-3-1) - (-1-3) + (-1+1) - (-1-1)
		// latest value of l is 2
		
		System.out.println(i);//-3
		System.out.println(j);//-1
		System.out.println(k);//0
		System.out.println(l);//2
		

	}

}
