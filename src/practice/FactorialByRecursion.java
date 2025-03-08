package practice;

import java.util.Scanner;

public class FactorialByRecursion {
	
	static int fact = 1;
	void  calFact(int n) {               //functiom
		
		if(n>=1) {
			fact = fact*n;
			calFact(n-1);
				
		}
		
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int n = sc.nextInt();
		FactorialByRecursion obj = new FactorialByRecursion();
		obj.calFact(n);
		System.out.println("Factorial of a numberis " + fact);
		// TODO Auto-generated method stub

	}

}
