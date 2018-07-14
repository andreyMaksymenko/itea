package ua.itea;

public class Discount {

	public static void main(String[] args) {
		int money = 353;
		int summa1 = 300;
		int summa2 = 400;
		int summa3 = 500;
		int discount;
		if (money < summa1) {
			discount = 0;
		} else if (money < summa2) {
			discount = 3;
		} else if (money < summa3) {
			discount = 5;
		} else {
			discount = 7;
		}
		System.out.println("Your discount is " + discount + "%, total: " + (money - (money * discount / 100)));
	}
}
