package ua.itea10;

public class Square {
	String name = "квадрат";
	int sideSquare;
	String color = "White";
	int perimetr;
	int area;

	void changeSide(int side) {
		sideSquare = side;
	}
	
	void calcPerimetr(int side) {
		perimetr = side*4;
	}
	
	void calcArea(int side) {
		area = side*side;
	}
	
	void getInfo() {
		if (area <= 50) {
			System.out.println("Фигура " + name + ", площадь " + area + ", периметр "
					+ perimetr + ", цвет " + color);
		} else {
			String color = "Red";
			System.out.println("Фигура " + name + ", площадь " + area + ", периметр "
					+ perimetr + ", цвет " + color);
		}
	}
}
