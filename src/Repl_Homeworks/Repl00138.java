package Repl_Homeworks;
/*Step 1: Complete the StoreProduct.java class:

Create below instance variables. (Choose proper data type and naming convention for variable ) 
* label
* price 
* category
* hasExpiration 
* stock (represent the stock quantity)


Step 2: Write three constructors:

* The main constructor( with all parameters)
* Second constructor with all parameters except category and hasExpiration
*  (category defaults to "misc", hasExpiration defaults to false inside constructor)
* Third constructor all the parameters except category, expiration, and stock 
* (stock default to 0 inside the constructor)

Step 3: Method for display out put. 
in StoreProduct Class create a method to display the output of class variables.
 (Output sequence as as order of variable shown above. all in one line)

Step 4: in Main Class Create an object of StoreProduct Class with each constructors. 
pass the values and then call the display method. 

Step 5: Execute your application :)


Hint: each variable must be object specific
Output:
 
Eggs 3.0 Produce true 10
Paper Towels 2.0 misc false 24
Paper Towels 2.0 null false 0*/



public class Repl00138 {
	
	public static void main(String[] args) {
		
	
	
	StoreProduct obj1=new StoreProduct("Eggs" ,3.0, "Produce", true ,10);
	StoreProduct obj2=new StoreProduct("Paper Towels", 2.0 ,"misc" ,false, 24);
	StoreProduct obj3=new StoreProduct("Paper Towels" ,2.0, null, false ,0);
}
}
class StoreProduct{
	
	String label;
	double price; 
	String  category;
	boolean  hasExpiration; 
	int stock; 
	
	 StoreProduct(String label, double price, String  category, boolean  hasExpiration, int stock){
		System.out.println(label+" "+ price+" "+ category+" "+ hasExpiration+" "+ stock);
	}
	 StoreProduct(String label,double price,int stock){
		this.category="misc";
		this.hasExpiration=false;
		System.out.println(label+" "+ price+" "+ category+" "+ hasExpiration+" "+ stock);
	}
	 StoreProduct(String label,double price){
		this.stock=0;
		System.out.println(label+" "+ price+" "+ category+" "+ hasExpiration+" "+ stock);
	}
	public void display() {
		
		
	}
	
}