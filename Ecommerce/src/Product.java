/*Author: Chelsea Cole
 * Date: March 11, 2022
 * 
 * ORIGINAL Ecommerce Project Quiz: In this quiz, you will be implementing a Product Class that’s a blueprint 
of e-commerce product’s attributes and behaviors. A Shop class that will contain the 
main function and 5 product objects. You will create a shopping menu for the user 
using an array of these 5 products.

* REVISED: 
* 1) Product class will become an abstract class
* 2) Product will now have only 3 attributes – name, price and quantity. These attributes 
are inherited by all of the subclasses. Select the access modifier accordingly. Create 
public getters and setters for these 3 attributes. Remove all other attributes from 
product class. They’ll go into category specific sub classes. 
* 3) Product will have only one constructor that will set all 3 attributes.
* 4) Remove toString for Product class. You will be creating a toString() for each of the 
subclass that inherits from Product.
* 5) buy() method will still be Product’s instance method. Leave it as is.
* 6) Product class will have an abstract method called getDetails() that will not take 
any parameters and not return anything.


* Product Class

 */


public abstract class Product {
	
	//make all attributes private
	 String name;
	 double price;
	 int quantity;
	
	
	//Generate constructors with attributes as parameters
	public Product(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;

	}

	
	
//call attributes with public getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public abstract void getDetails();


	
	//returns a boolean that determines whether the selected product is in stock or not based on the quantity.
	public boolean buy(){
		if(this.quantity > 0) {
			this.quantity--;
			return true;
		} else {
			return false;
		}
	}
	
	
}
