// Christine Joy Dizon, Charlie Nguyen
// CS A170 CRN:24347
// Sept. 16, 2019
// Project 2: This project will allow a user to order from a pizza parlor and choose their size, toppings and crust. 
// It will then give the user the total price, etc. 

import java.text.DecimalFormat;
import java.util.Scanner;

public class PizzaOrderChristineCharlie {

	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat( "0.00" );
	    	final double taxr = .08;
	        double tax;
	        boolean discount = false;
	        double cost = 0;
	        
	// TASK #1: The if Statement, Comparing Strings, and Flags
		System.out.println("Welcome to Charlie and Christine's Pizzeria!");
		
		System.out.println(); // SPACE
		
		System.out.print("Enter your first name: ");
			 String fName = userin.nextLine();
		
	// TASK #2: Comparing Strings, Using a Flag as a Condition
			if (fName.equals("Charlie") || fName.equals("charlie") || fName.equals("Christine") || fName.equals("christine")) {
				discount = true;
			}

		System.out.println(); // SPACE
			
	// TASK #1
		System.out.println("The following prices for pizza sizes are listed here:");
		System.out.println("A 10-inch pizza for $10.99");
		System.out.println("A 12-inch pizza for $12.99");
		System.out.println("A 14-inch pizza for $14.99");
		System.out.println("A 16-inch pizza for $16.99");
	
		System.out.println(); // SPACE	
	
	// TASK #1
		System.out.print("Choose your pizza size (10, 12, 14, or 16): ");
			int size = userin.nextInt();
			
	// TASK #3: The if-else-if Statement
		if (size == 10) {
			cost = 10.99;
			System.out.println("You selected a 10-inch pizza for $10.99");
			} else if (size == 12) {
				cost = 12.99;
				System.out.println("You selected a 12-inch pizza for $12.99");
				} else if (size == 14) {
					cost = 14.99;
					System.out.println("You selected a 14-inch pizza for $14.99");
					} else if (size == 16) {
						cost = 16.99;
						System.out.println("You selected a 16-inch pizza for $16.99");
						} else { 
							cost = 12.99;
							System.out.println("Size not available, a 12-inch pizza will be chosen as default.");
							}

		System.out.println(); // SPACE
		
	// TASK #4: The switch Statement
		System.out.print("Choose your pizza crust ((H)Hand-tossed, (T)Thin-crust, or (D)Deep-dish: ");
		String crust = userin.nextLine();
		char crusttype = userin.next().charAt(0);
		
		switch (crusttype) {
		case 'h':
		case 'H': crust = "Hand-tossed";
			System.out.println("You selected Hand-tossed"); break;
		case 't':
		case 'T': crust = "Thin-crust";
		System.out.println("You selected Thin-crust"); break;
		case 'd':
		case 'D': crust = "Deep-dish";
		System.out.println("You selected Deep-dish"); break;
		default: System.out.println("Crust not available, a Hand-tossed crust will be chosen as default."); break;
		}

		System.out.println(); // SPACE
		
	// TASK #5: String Concatenation
		System.out.println("All pizzas come with cheese. ");
		System.out.println("Additional toppings are $1.25 each.");
		System.out.println("Choose from: Pepperoni, Sausage, Onion, Mushroom");
		
		int numberofToppings = 0;
		char choice;
		String toppings = "Cheese, ";
		String topping;
		
		System.out.print("Would you like Pepperonis? (Y/N) ");
			topping = userin.nextLine();
			choice = userin.next().charAt(0);
			if (choice == 'Y' || choice == 'y') {
				numberofToppings = numberofToppings + 1;
				toppings = toppings + "Pepperonis, ";
		}
		System.out.print("Would you like Sausages? (Y/N) ");
			topping = userin.nextLine();
			choice = userin.next().charAt(0);
			if (choice == 'Y' || choice == 'y') {
				numberofToppings = numberofToppings + 1;
				toppings = toppings + "Sausages, ";
		}
		System.out.print("Would you like Onions? (Y/N) ");
			topping = userin.nextLine();
			choice = userin.next().charAt(0);
			if (choice == 'Y' || choice == 'y') {
				numberofToppings = numberofToppings + 1;
				toppings = toppings + "Onions, ";
		}
		System.out.print("Would you like Mushrooms? (Y/N) ");
			topping = userin.nextLine();
			choice = userin.next().charAt(0);
			if (choice == 'Y' || choice == 'y') {
				numberofToppings = numberofToppings + 1;
				toppings = toppings + "and Mushrooms";
		}
		
		cost = cost + (numberofToppings * 1.25);
		tax = taxr * cost;
				
		System.out.println(); // SPACE

		if (discount) {
			System.out.println("You are elligible for a discount of $2!");
			cost = cost - 2;
		}
		
		System.out.println(); // SPACE

	// TASK #6: Formatting Output and end of pizza order!!
		System.out.println("Your order is as follows:");		
		System.out.println(size + "-inch pizza");
		System.out.println(crust);
		System.out.println(toppings);
		
		System.out.println("The cost of your order is: " + "$" + df.format(cost));
        System.out.println("The tax of your order is: " + "$" + df.format((cost * taxr)));
        System.out.println("Your total due is: " + "$" + df.format(cost + tax));
        
        System.out.println(); // SPACE
        
		System.out.println("Thank you for choosing Charlie and Christine's Pizzeria. ");
		System.out.println("Your pizza will be ready for pick-up in a hot 30-minutes.");
		
		userin.close();		
		
		
	}
}
