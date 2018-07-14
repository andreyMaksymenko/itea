package ua.itea12;

public class Car {
	String mark;
	String model;
	{
		System.out.println("Init block");//сюда можно запихнуть общее для конструкторов
	}
	
	
	Car(){
		System.out.println("Hello from constructor");
	}
	
	Car(String mark){
		this.mark=mark;
	}
	
	Car(String mark, String model){
		this.mark=mark;
		this.model=model;
		getInfo();
	}
	
	
	void setMark (String mark) {
		this.mark=mark;
	}
		void setModel (String model) {
		this.model=model;
	}
	
	
	void getInfo() {
		System.out.println("Mark is " +mark + ", models is  " + model);
	}


}
