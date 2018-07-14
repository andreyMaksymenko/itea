package ua.itea;

import java.util.Scanner;

public class Day5_7 {

	public static void main(String[] args) {
		int counter = 0;
		Scanner in = new Scanner(System.in);
		//System.out.println("Start");
		while (counter != 10) {
			int user = 0;
			do {
				System.out.println("Enter number:");
				if (in.hasNextInt()) {
					user = in.nextInt();
					//in.close();// освобождение потока ввода,закрытие ресурсов
					System.out.println("User input:" + user);
					break;
				} else {
					System.out.println("Error");
					in.next();
				}
			} while (true);
			// System.out.println("End");

			if (user % 2 == 0) {
				counter++;
				System.out.println(user);
			}

		}
		in.close();
	}
}
