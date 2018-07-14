package ua.itea10;

public class Color {
	String[] col = {"red", "blue", "green", "black", "white"};
	
	String getColor() {
		return col [(int) (Math.random() * col.length)];
		
	}
}
