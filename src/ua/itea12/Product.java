package ua.itea12;

public class Product {
	String name;
	int price;
	
	Product(String name, int price){
		this.name=name;
		this.price=price;
	}
	
	
	void getInfo() {
		System.out.println("Name "+name+", price "+price); 
			}
}
