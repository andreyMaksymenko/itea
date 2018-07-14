package ua.itea;

public class Day5_2 {

	public static void main(String[] args) {
		System.out.println("-------FOR--------------");
		int i = 0;
		for (i = 0; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("--------WHILE----------");
		i = 0;
		while (i < 10) {
			System.out.println(i++);
		}
		System.out.println("--------DO-WHILE----------");
		i = 0;
		do {
			System.out.println(i++);
		} while (i < 10);
	}
}
