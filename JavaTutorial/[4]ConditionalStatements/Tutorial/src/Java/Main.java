package Java;

import java.util.Scanner;

public class Main{
	
	public static void main(String args[]) {
	
		// Simple conditional statements :D*
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Option 1: you'll go unscathed :D*");
		System.out.println("Option 2: you're gonna fight back you punk!? :D*");
		System.out.println("Else: i will beat the livng hell out you :D*");
		
		System.out.println("Give me your Allowance: ");
		int option = scan.nextInt();
		
		/*
		// If statement

		if(option == 1) 
			System.out.println("Good to you sir! :D*");
		else if(option == 2)
			System.out.println("Fights back*");
		else 
			System.out.println("Punch!!");
		*/
		
		// switch case statement :D*

		switch(option) {
			case 1:
				System.out.println("Good day to you sir! :D*");
			break;
			case 2:
				System.out.println("Fights back :D*");
			break;
			default:
				System.out.println("Punch!! :D*");			
		}
		
		return;		
	}
	
}