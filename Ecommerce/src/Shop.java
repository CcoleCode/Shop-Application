/*Author: Chelsea Cole
 * Date: March 11, 2022
 * 
 * ORIGINAL Ecommerce Project Quiz: In this quiz, you will be implementing a Product Class that’s a blueprint 
of e-commerce product’s attributes and behaviors. A Shop class that will contain the 
main function and 5 product objects. You will create a shopping menu for the user 
using an array of these 5 products.

* REVISED:
*  1) The array will give you an error now that Product is abstract. Modify the objects 
inside the array to call respective subclass’s constructor. 
* 2) Everything else remains the same


* Shop Class

 */

import java.util.Scanner;

public class Shop {

	//
	static double totalAmount = 0;
   // static Product[] inventory = new Product[5];

	// static array called inventory of 5 Product objects
	//example of overloading : when two or more methods have the same name but different parameters
	static Product[] inventory = {
			new Apparel("Business Ritual Womens Long Sleeve Top", 65.39, 4, 'L', "Blue"),

			new Book("The Art of Computer Programming", 190.54, 9, "Donald E. Knuth"),

			new Apparel("Men's Business Casual Shirt", 57.10, 2, 'M', "Teal"),

			new Bath("Organic Turmeric Soap", 11.25, 1),

			new Book("Head First Design Pattern", 37.35, 3, "Eric Freeman")};

	// static method that prints the menu
	public static void displayMenu() {
	
	System.out.println("\n Enter the product index (0 to 4) you want to buy."
			+ "To exit the shopping cart, enter any number other than 0 to 4");
	
	//Use a for loop to loop through the inventory array
	for(int i = 0; i <= inventory.length -1; i++) {
		
		//Print index : inventory[index]'s getter for name
		System.out.println(i + ":" + inventory[i].getName());
	}
	}
	

	public static void main(String[] args) {
		
		//Scanner object to take user input
		Scanner input = new Scanner(System.in);
		//Declare an int variable called userInput
		int userInput;
		
		//Run a menu option inside a do while loop
		//Runs as long as userInput is between 0 and 4
		do {
			
			//Inside do while loop call the displayMenu() method
			displayMenu();
			//Take an integer as userInput
			userInput = input.nextInt(); 
			
			//Check if userInput is between 0 and 4
		 try { 
			int[] inventory = {0,1,2,3,4};
			System.out.println(inventory[5]);
			} 
		 
		 catch (ArrayIndexOutOfBoundsException a) {
			System.out.println("Index is out of bounds");
			 break;
		 }
		
		 //method that returns a boolean inside an if statement
		 if (inventory[userInput].buy() == true) {

		//Add the products price to the total Amount
		totalAmount = inventory[userInput].getPrice() + totalAmount;
		//Print Your Purchase was successful
		System.out.print("Your purchase was successful! ");
		System.out.println("Your total is: " + totalAmount);
		 }
		 
		 //Otherwise print sorry this product is out of stock
		 else {
		System.out.println("Sorry this product is out of stock");
			
		 }
		 }
		
	 while(userInput >= 0 && userInput <= 4);
	 		//	break; //Extra Credit
	 //	System.out.println(totalAmount);	
	//Once the do while has ended print that you for shopping...
	 System.out.println("Thank you for shopping with us! The total amount is: " + totalAmount);
		
	 //Make sure to close the input stream before your main method ends
	input.close();	
	
	}
}

		 	


