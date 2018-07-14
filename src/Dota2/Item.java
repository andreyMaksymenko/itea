package Dota2;

public class Item {
	String name = "";
	String heroName;
	double ability;

	String getName() {
		return name;
	}

	void setNameAbility (String n, double ab) {
		name = n;
		ability=ab;
		
	}

	void setHeroName (String own){
		heroName=own;
	}
	void getAbility(double ab) {
		ability = ab;
	}
	void getInfo() {
		System.out.println("Item is called "+name+", it give a ability "+ability+", owner is "+ heroName);
	}
}
