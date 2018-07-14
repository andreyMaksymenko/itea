package ua.itea10;

public class Lamp {
	int brightness;
	boolean state;

	void getInfo() {
		System.out.println("Lamp is " + (state ? ("On, brightness "+brightness) : ("On, brightness "+brightness)));
	}
	
	void TurnOn() {
		state = true;
		brightness=100;
	}
	void setBrightness (int b) {
		if (b>0 && b<=100) {
			if(state)
			brightness=b;
		}// else 
		
	}
	void TurnOff() {
		state = false;
		brightness=0;
	}

}