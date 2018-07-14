package D20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MyMap{

	public static void main(String[] args) {
		HashMap<String, String> map=new HashMap<String, String>();
		
		map.put("name", "Alex");
		map.put("adress", "Kiev");
		map.put("age", "13");
		map.put("name", "Mary");
		
		map.put("name", "Alex");
		//System.out.println(map.get("name"));
		
		HashMap<Cat, Dog> animal=new HashMap<Cat, Dog>();
		animal.put(new Cat("Mursik", 5), new Dog("Barsik", 10));
		animal.put(new Cat("Kisa",4), new Dog("Rex", 1));
		animal.put(new Cat("Myu",3), new Dog("Gav", 4));
		
		Cat cat=new Cat("Mursik", 5);
		//System.out.println(animal.get(cat));
		
		//Dog dog=new Dog("Barsik", 10);
		
		Set<Cat> set=animal.keySet();
		Iterator<Cat> cats=set.iterator();
		while(cats.hasNext()) {
			Cat c=cats.next();
			System.out.println("Animal["+c+"]="+animal.get(c));
		}
		
	}



}
