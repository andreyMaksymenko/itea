package ua.itea10;


public class Circle {
	String name="круг";
	int radiusCircle;
	String color="White";
	double perimetr;
	double area;
	
	Circle(){
		
	}
	
	Circle(int r, String color){
		this.color=color;
		getInfo();
	}

	
	/**Circle(int radiusCircle, String color){
		this.radiusCircle=radiusCircle;
		calcPerimetr(radiusCircle);
		calcArea(radiusCircle);
		getInfo();
	}*/

	void changeRadius(int radius) {
		radiusCircle=radius;
				}
	void calcPerimetr(int radius) {
		perimetr = Math.PI*radius*2;
	}
	
	void calcArea(int radius) {
		area = Math.PI*radius*radius;
	}
	void getInfo() {
		if (area<=50){
			System.out.println("Фигура "+name+", площадь "+area+", периметр "+perimetr+", цвет "+color);
		}else {
			String color="Red";
			System.out.println("Фигура "+name+", площадь "+area+", периметр "+perimetr+", цвет "+color);
		}
	}
}
