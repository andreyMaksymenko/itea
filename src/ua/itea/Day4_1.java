package ua.itea;

public class Day4_1 {

	public static void main(String[] args) {
		int money = -38;
		if (money<=0) {
			System.exit(0);
		}
		int discount = 0;
		if (money > 500) {
			discount = 7;
		} else if (money > 400) {
			discount = 5;
		} else if (money > 300) {
			discount = 3;

		}
		System.out.println("Your discount is " + discount + "%, total: " + (money - (money * discount / 100)));
	}
}
