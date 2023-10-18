package Java;

import java.text.DecimalFormat;

public class Main{
	
	public static void main(String args[]) {
		
		// For Displaying specific decimal places :D*
		DecimalFormat deci = new DecimalFormat(".000000"); 
		
		// java Variables :D*
		int integer = 69420;
		float flt = 3.141592f;
		double lFlt = 3.141592123124193783932f;  
		long longNum = 31415921231234353L;
		short shrt = 32134;
		char ltr = 'D';
		boolean state = true;
		
		String name = "DeezNutz";
		
		System.out.println("Int: " + integer);
		System.out.println("Float: " + flt);
		System.out.println("Double: " + lFlt);
		System.out.println("Long: " + longNum);
		System.out.println("Short: " + shrt);
		System.out.println("Char: " + ltr);
		System.out.println("Boolean: " + state);
		System.out.println("String: " + name);
		
		return;		
	}
	
}