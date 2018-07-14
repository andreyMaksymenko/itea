package ua.itea12;

public class Cart {
	Product[] products= new Product[10]; 
	int curIndex=0;
	
	void addProduct(Product product) {
		products[curIndex++]=product;
	}
	
	void showCart () {
		if(curIndex==0) {
			System.out.println("Cart is empty");
		} else {
			for (int i =0;i<products.length; i++) {
				
			}
		}
	}

}



