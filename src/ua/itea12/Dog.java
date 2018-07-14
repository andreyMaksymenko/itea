package ua.itea12;

public class Dog {
	String name;
	int age;
	String ownerName;
	
	Dog(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	void setOwnerName (String ownerName) {
		this.ownerName=ownerName;
	}
	
	
	void getInfo() {
		System.out.println("Dog name "+name+", dogAge "+age+" , owner "+((ownerName==null)?"homeless":ownerName)); 
			}
}




