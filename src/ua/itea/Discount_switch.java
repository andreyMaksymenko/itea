package ua.itea;

public class Discount_switch {

	public static void main(String[] args) {
		int money = 809;
		int discount = 0;
		switch (money / 100) {
		case 0:
		case 1:
		case 2:
			break;
		case 3:
			discount = 3;
			break;
		case 4:
			discount = 5;
			break;
		default:
			discount = 7;
		}
		System.out.println("Your discount is " + discount + "%, total: " + (money - (money * discount / 100)));
	}
}
