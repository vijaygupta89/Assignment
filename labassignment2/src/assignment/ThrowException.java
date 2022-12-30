package assignment;

import java.util.*;     

public class ThrowException {
public static void main(String args[]) {
	
	Scanner sc=new  Scanner(System.in);
	
	System.out.println("Enter your age");     ///taking input from the user
    int age=sc.nextInt();
    
    if(age<18) {             //checking if age is less then 18 or not
    	throw new ArithmeticException("Your Age is not correct, not aligiblr for vote");
    	
    }
    else {
    	System.out.println("you are aligible for voting");
    	
    }
    
	
}
}
