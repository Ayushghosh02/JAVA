package practice;

import java.util.Scanner;

public class SwappingaNumberwithoutVariable {

	public static void main(String[] args) {
		
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the firstnumber(a) :");
			int a = sc.nextInt();
			
			System.out.println("Enter the firstnumber(b) :");
			int b = sc.nextInt();
			
			
			System.out.println("Before Swapping :"+ a +  b );
			
			a = a + b;
			
			b = a - b;
			a = a - b;
			
			System.out.println("After Swapping :"+ a +  b );
			
			
			
			}
		// TODO Auto-generated method stub

	

}
