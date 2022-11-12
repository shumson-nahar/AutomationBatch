package static_nonstatic_method;

public class UsingMethod {

	
		// static is concept of the Class
		// non-static is concept of the Object
		// a static entity can be called directly or by the help of the Class

		public static void main(String[] args) {
			System.out.println("This is the main method");
			UsingMethod.method1();
			UsingMethod.method2();
			UsingMethod.method3();
			UsingMethod.method4();
			UsingMethod.method5();
			method1();
			method2();
			method3();
			method4();
			method5();

			

		}

		public static void method1() {
			System.out.println("I have coding method1");
		}

		public static void method2() {
			System.out.println("I have coding method2");
		}

		public static void method3() {
			System.out.println("I have coding method3");
		}
		public static void method4() {
			System.out.println("I have coding method4");
		}
		public static void method5() {
			System.out.println("I have coding method5");
		}

		
		}



	


