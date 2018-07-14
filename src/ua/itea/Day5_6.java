package ua.itea;

import java.util.Scanner;

public class Day5_6 {

	public static void main(String[] args) {
		System.out.println("Start");
		Scanner in = new Scanner(System.in);
		do {
		System.out.println("Enter number:");
		if(in.hasNextDouble())  {
			double user = in.nextDouble();
			in.close();//освобождение потока ввода,закрытие ресурсов
			System.out.println("User input:" + user);
			break;
		}else {
			System.out.println("Error");
			in.next();
		}
			}while (true);
		System.out.println("End");
		}
				
}
		
	
