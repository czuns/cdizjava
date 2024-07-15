// Christine Joy Dizon, Kenny Trieu
// CS A170 CRN:24347
// Sept. 12, 2019
// NumericTypes
// This program demonstrates how numeric types and operators behave in Java.

import java.util.Scanner;

public class NumericTypesKennyChristine {

	public static void main(String[] args) {
		// TASK #2 Create a Scanner object here:
		Scanner userin = new Scanner(System.in);
		
		// Identifier declarations:
		final int NUMBER = 2; // # of scores
		final double SCORE1 = 100; // 1st test score
		final double SCORE2 = 95; // 2nd test score
		final int BOILING_IN_F = 212; // Boiling temp.
		int fToC = (BOILING_IN_F-32)*5/9; // Temperature Celsius
		double average = (SCORE1 + SCORE2)/NUMBER; // Arithmetic average
		String output;	// Line of output
		 
		// TASK #2 variables:
		String fName, lName, fullName;
		// TASK #3 variables:
		String uppercaseLetters;
		int lengthofName;
		// TASK #4 variables:
		int diameter, radius;
		double volume;

		// Find an arithmetic average. average = SCORE1 + SCORE2 / NUMBER;
		output = SCORE1 + " and " + SCORE2 +
		" have an average of " + average; System.out.println(output);

		// Convert Fahrenheit temperature to Celsius. fToC = 5/9 * (BOILING_IN_F - 32);
		output = BOILING_IN_F + " in Fahrenheit is " + fToC + " in Celsius.";
		System.out.println(output);
		
		System.out.println();	// Blank line

		// LINES FOR TASK #2:
		System.out.println("Please enter your first name:"); // Prompt user for fName
			fName = userin.nextLine(); // Read user's fName
		System.out.println("Enter your last name:"); // Prompt user for lName
			lName = userin.nextLine(); // Read user's lName
			fullName = fName + " " + lName; // Concatenate fName and lName
		System.out.println("My name is " + fullName); // Print fullName
		
		System.out.println();	// Blank line
		
		// LINES FOR TASK #3:
		char fInitial = fName.charAt(0); // First character from user's fName
		System.out.println("Your first initial is " + fInitial); // Print user's fInitial
			uppercaseLetters = fullName.toUpperCase(); // Convert user's fullName to uppercase
		System.out.println("Uppercase letters are: " + uppercaseLetters); // Print user's fullName in uppercase
			lengthofName = fullName.length(); // Determine length of user's fullName
		System.out.println("The length of your name is " + lengthofName); // Print user's length of fullName

		System.out.println();	// Blank line

		// LINES FOR TASK #4: 
		System.out.println("Please enter your diameter:"); // Prompt user for diameter of a sphere
			diameter=userin.nextInt(); // Read diameter
			radius= diameter/2; // Calculate radius
			volume= 4*Math.PI*Math.pow(radius, 3)/3; // Calculate volume
		System.out.println("The volume is "+ volume); // Print out the volume
		
		userin.close();
		
		}
	}
