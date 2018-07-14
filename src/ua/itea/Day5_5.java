package ua.itea;

import java.util.Scanner;

public class Day5_5 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter number:");
		if(in.hasNextInt()) {
			int user = in.nextInt();
			in.close();//освобождение потока ввода,закрытие ресурсов
			System.out.println("User input:" + user);
		}else {
				
		System.out.println("Error");
		}
	}

}
