package session_2ndOctober_2022;

public class If_Else_Statements {

	public static void main(String[] args) {
		 int a = 10;
		 int b = 20; 
		
		 int c = 30; 
		 int d = 40; 
		 
		 if (a>b && a>d) {
			 System.out.println("a is the greatest :" + a);
		 }else if(b>a && b>c && b>d) {
			 System.out.println("b is the greatest :" + b);
			 
			 
		 }else if (c>a && c>b &&c>d) {
			 System.out.println("c is the greatest :"+ c);
		 }else {
			 System.out.println("d is the greatest :" +d);
		 }
		   

	}

}
