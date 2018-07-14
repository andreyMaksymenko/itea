package ua.itea10;

public class Door {
	String color = "white";
	String material = "wood";
	boolean state;

	void getInfo() {
		System.out.println("colour: " + color);
		System.out.println("material: " + material);
		System.out.println("state: " + (state ? "Opened" : "Closed"));
	}

	void openDoor() {
		state = true;
	}

	void setColour(String c) {
		color = c;//для вызова метода с параметром
	}
}
