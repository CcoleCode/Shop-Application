/*Author: Chelsea Cole
 * Date: March 11, 2022
 * ORIGINAL Ecommerce Project Quiz: In this quiz, you will be implementing a Product Class that’s a blueprint 
of e-commerce product’s attributes and behaviors. A Shop class that will contain the 
main function and 5 product objects. You will create a shopping menu for the user 
using an array of these 5 products.

* REVISED: 
*1) Book will have its own set of private attributes 
• String author 
• String genre 
• String isbn 
2) Create a constructor that will take name, price, quantity, author and call super 
class’s constructor. You can check your class notes and example programs.
3) Another constructor will take name, price, quantity, author, genre and isbn
4) Book will define the getDetails() method. The method will print “We sell books on 
Software Development”


* Book Class

 */


public class Book extends Product {
	
	private String author;
	private String genre;
	private String isbn;
	
	
	
	public Book(String name, double price, int quantity, String author) {
		super(name, price, quantity);
		
	}



	public Book(String name, double price, int quantity, String author, String genre, String isbn) {
		super(name, price, quantity);
		
	}
	
	public void getDetails(){
		System.out.println("We sell books on Software Development");
	}

	
	
	

}
