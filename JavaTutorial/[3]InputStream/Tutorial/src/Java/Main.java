package Java;

import java.io.*;
import java.util.Scanner;

public class Main{
	
	public static void main(String args[]) throws IOException {

		// java inputs :D
		// scanner object :D"
		Scanner scan = new Scanner(System.in);
		
		/*
 		// User Prompt :D"
		System.out.print("Enter your First name: "); 
		String firstName =  scan.nextLine();
		
		System.out.print("Enter your phone number: "); 
		int phoneNum = scan.nextInt();
		
		System.out.print("Enter your First name: "); 
		String lastName =  scan.nextLine();
		
		scan.nextLine(); // captures the newline character :D" System.out.print("Enter your Last name: "); string lastName scan.nextLine();
		System.out.println("\nFirstName:" + firstName + 
							"\nLastName:" + lastName +
							"\nPhone Number: " + phoneNum);
		 */
		
		BufferedReader bfrd = new BufferedReader(new InputStreamReader(System.in));
		
		// By default BufferedReader takes String as input :D
		System.out.print("Enter your First name: "); 
		String firstName = bfrd.readLine();
		
		System.out.print("Enter your phone number: "); 
		int phoneNum = Integer.parseInt(bfrd.readLine());
		
		System.out.print("Enter your Last name: "); 
		String lastName = bfrd.readLine();
		
		System.out.println("\nFirstName:" + firstName + "\nLastName:" + lastName +
		"\nPhone Number: " + phoneNum);
		
		return;		
	}
	
}