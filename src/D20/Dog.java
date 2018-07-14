package D20;

public class Dog {
	String name;
	int age;
	
	public Dog() {}
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void getDog() {
		System.out.println("Dog");
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + "]";
	}
	
}
