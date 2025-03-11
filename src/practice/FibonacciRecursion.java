package practice;

import java.util.Scanner;

public class FibonacciRecursion {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the number of terms: ");
	        int n = sc.nextInt();

	        System.out.println("Fibonacci Series (Recursion): ");
	        for (int i = 0; i < n; i++) {
	            System.out.print(fibonacciRecursive(i) + " ");
	        }
	    }

	    static int fibonacciRecursive(int n) {
	        if (n <= 1) {
	            return n;
	        }
	        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
	    }
	}


