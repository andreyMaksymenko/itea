package ua.itea10;

public class Triangle {
	String name = "равносторонний треугольник";
	int sideTriangle;
	String color = "White";
	double perimetr;
	double area;

	
	void changeTriangle(int sidet) {
		sideTriangle = sidet;
	}

	void calcPerimetr(int side) {
		perimetr = side * 3;
	}

	void calcArea(int side) {
		area = 4 / 3.0 * side * side * Math.sqrt(side);
	}

	void getInfo() {
		if (area <= 50) {
			System.out.println("Фигура " + name + ", площадь " + area + ", периметр " + perimetr + ", цвет " + color);
		} else {
			String color = "Red";
			System.out.println("Фигура " + name + ", площадь " + area + ", периметр " + perimetr + ", цвет " + color);
		}
	}
}
