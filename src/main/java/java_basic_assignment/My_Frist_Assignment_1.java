package java_basic_assignment;

public class My_Frist_Assignment_1 {

	public static void main(String[] args) {// 10 int, 10 boolean,10 char, 10 double and 
		int a = 1;                           // use System.out.println() statements    
		int b = 2;
		int c = 3;
		int d = 4;
		int e = 5;
		int f = -6;
		int h = -9876;
		int i = 199;
		int m = 18;
		int n= 34;
		int k = 56;
		int p = 45;
		int l = 36;
		int q = -20;
		int s = -77777;
		System.out.println(m);
		System.out.println(n);
		System.out.println(a);
		System.out.println(p);
		System.out.println(q);
		System.out.println(k);
		System.out.println(d);
		System.out.println(i);
		System.out.println(s);
		System.out.println(f);
		

	
	boolean b1 = 3<4;
	System.out.println(b1);
	boolean b2 = 209.50<200.50;
	System.out.println(b2);
	boolean b3 = true;
	boolean b4 = false;
	boolean b5 =(b3 ==b4);
	System.out.println(b5);
	
	int num1 = 10;
	int num2 = 11;
	System.out.println(num1>num2);
	System.out.println(num2>num1);
	System.out.println(num1<num2);
	System.out.println(num2<num1);
	
	boolean x = true;
	boolean y = true;
	System.out.println(x && y);
	boolean r = false;
	boolean z= false;
	System.out.println(r && z);
	
	//Create four char primitives ch1,ch2,ch3 and ch4
	char ch1 ,ch2,ch3,ch4;
	//Assign the values to ch1,ch2,ch3 and ch4.
	ch1='T';
	ch2 ='k';
	ch3 ='\n';
	ch4 ='G';
	
	//Create four boolean primitives b1,b2,b3 and b4
	// Assign the results to b1,b2,b3 and b4.
	b1 = Character.isLetter(ch1);
	b2 = Character.isLowerCase(ch2);
	b3 = Character.isSpace(ch3);
	b4 = Character.isDefined(ch4);
	
	String str1 ="The first character is a letter:"+b1;
	String str2="The second character is a lower-case:"+ b2;
	String str3 = "The third character is for space:"+ b3;
	String str4 = "The fourth character is defined in Java identifier:"+b3;
	
	//Print the values of b1,b2,b3 and b4. 
	System.out.println(str1);
	System.out.println(str2);
	System.out.println(str3);
	System.out.println(str3);
	
	//double 
	
	double d1= 8d;
	double d2 = 8.0;
	double d3 = 78.9867;
	double d4 = 45.0;
	
	double myNum = 19.99d;
	System.out.println(myNum);
	
	double first_number,second_number,answer;
	first_number = 10.5;
	second_number = 20.8;
	answer = first_number + second_number;
	System.out.println("Addition Total = " +answer);
	
	//Initialized two decimal numbers
	
	double length1 = 1.06;
	double breadth1 = 1.07;
	
	//Subtracting length and breadth
	
	double sub = breadth1-length1;
	System.out.println("Simple Subtraction = " + sub);
	
	
	
	
	
	
	
	}

}
