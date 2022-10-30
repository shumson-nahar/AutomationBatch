package java_session_29thOctober_2022;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		int i,j = 0 ,rows;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows you want to print:");
		rows = sc.nextInt();
		for (i=0;i<rows-1;i++) {
			
			for(i=0;j<=i;j++) {
				
				System.out.println("*"+"");{
					
				}
			System.out.println("");{
				for(i=rows-1;i>=0;i--) {
					System.out.println("*"+"");{
						System.out.println("");
					}
				}
			}
			
			}
		}

	}

}
