package java_basic_assignment;

public class Increment_Operations_Combins_Combine {

	public static void main(String[] args) {
		int i = 1;
		int j = i++  + ++i;
		int k = ++j + j++;
		int l = k++ + ++k + k++ + i++;
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
	}

}
