/*Author: Chelsea Cole
 * Date: March 11, 2022
 * ORIGINAL Ecommerce Project Quiz: In this quiz, you will be implementing a Product Class that’s a blueprint 
of e-commerce product’s attributes and behaviors. A Shop class that will contain the 
main function and 5 product objects. You will create a shopping menu for the user 
using an array of these 5 products.
* REVISED:
* 1) No private attributes. Constructor will just take name, price and quantity and call 
the parent’s constructor.
*2) getDetails() will print “We sell organic bath products!”
* 
* 
* Bath Class

 */


public class Bath extends Product {

	public Bath(String name, double price, int quantity) {
		super(name, price, quantity);
	}
	
	public void getDetails() {
		
		System.out.println("We sell organic bath products!");
	}
	

}
