package ua.itea12;

public class Dog2 {
	String name;
	int age;
	Owner owner;
	
	void setOwner (	Owner owner) {
		this.owner=owner;
	}
	
	Dog2(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	
	void getInfo() {
		System.out.println("Dog name "+name+", dogAge "+age+" , owner "+((owner==null)?"homeless":owner.getName())); 
			}
}
