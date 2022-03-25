/*Author: Chelsea Cole
 * Date: March 11, 2022
 * ORIGINAL Ecommerce Project Quiz: In this quiz, you will be implementing a Product Class that’s a blueprint 
of e-commerce product’s attributes and behaviors. A Shop class that will contain the 
main function and 5 product objects. You will create a shopping menu for the user 
using an array of these 5 products.
* REVISED:
* 1) Private attributes 
• char size 
• String color 
2) Constructor will take name, price, quantity, size and color 
3) getDetails() will print “We sell different kinds of business clothes for both men and 
women”

* Apparel Class

 */


public class Apparel extends Product {
	
	private char size;
	private String color;
	
	
	public Apparel(String name, double price, int quantity, char size, String color) {
		super(name, price, quantity);
	}
		
	public void getDetails() {
		
		System.out.println("We sell different kinds of business clothes for both ment and women");
	}
	
	
	
	

}
