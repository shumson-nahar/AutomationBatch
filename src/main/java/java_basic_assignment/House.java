package java_basic_assignment;


public class House {
	String tvBrand ="sumsung";
	
	public static void main(String[] args) {
		House house = new House();
		house.kitchen("sharp");
		house.livingroom();
		house.bedroom();
		house.bathroom();
		
	}
		public void kitchen(String microwave) {
			System.out.println(" let's cook");
			System.out.println(" my microwave is " +microwave);
			
		}
		public void livingroom() {
			System.out.println(" watch tv");
			System.out.println(" in my living room I have a " +tvBrand+" tv");
			
		}
		public void bedroom() {
			System.out.println(" sleep and watch tv");
		}
		public void bathroom() {
			System.out.println(" let's have a shower");
		}
		
		

	}


