package assignment;

import java.util.Scanner;
                                       
public class Exceptionhandling {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter first number");           //taking first integer  from user 
		int i=sc.nextInt();
		
		System.out.println("Enter second number");          //taking second integer from user
		int j=sc.nextInt();
		
		System.out.println("Before Calculation");
		try{
			System.out.println(i/j);                 //dividing first number with second
			                                         //handling Exception 
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception is fired");
			
		}
		System.out.println("After Calculation");
		
	}


}
