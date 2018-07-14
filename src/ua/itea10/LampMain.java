package ua.itea10;

import java.util.Scanner;

public class LampMain {

	public static void main(String[] args) {
		Lamp lamp=new Lamp();
		lamp.getInfo();
		Scanner b = new Scanner(System.in);
		System.out.println("Enter brightness:");
		lamp.setBrightness(b.nextInt());
		lamp.getInfo();
		b.close();
		//lamp.TurnOff();
		//lamp.getInfo();
	}

}
