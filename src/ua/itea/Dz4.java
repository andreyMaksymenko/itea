package ua.itea;

public class Dz4 {

	public static void main(String[] args) {
		for (int i = 0; i <= 100; i++) {
			if (i % 7 == 0) {
				System.out.println(i);
			}
		}

		
		int n = 100;
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}

		System.out.println("Cумма четных чисел: " + sum);
	}

}
