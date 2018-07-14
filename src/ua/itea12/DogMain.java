package ua.itea12;


public class DogMain {

	public static void main(String[] args) {
		Dog2 dog=new Dog2("Tuzik", 5);
		dog.getInfo();
		Owner owner=new Owner("Alex");
		//dog.setOwnerName(owner.getName());
		dog.setOwner(owner);
		dog.getInfo();


	}

}
