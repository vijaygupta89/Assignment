package assignment;

import java.util.Scanner;

public class MyThread extends Thread {
	
	
    public void run() {
    	Scanner sc  = new Scanner(System.in);    // use to take input
    	System.out.println("Enter a number ");
    	int UserInput = sc.nextInt();         // taking  input data from user
    	sc.close();    
    	
    	if((UserInput % 2) != 0) {     // to check number is even or odd
    		System.out.println("The given number is odd");
    	} 
    	else
    	{
    		System.out.println("Enetred number is Even");
    	}
    }
    
	public static void main(String args[]) {
		MyThread mt= new MyThread();
		mt.start();  
		System.out.println("This is main Thread");
	}

	
}



