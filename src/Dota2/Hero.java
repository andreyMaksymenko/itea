package Dota2;

public class Hero {
	String heroName;
	double intelligence;
	double agility;
	double strength;
	double strikePower;
	double health = 100;
	double criticalStrike=0.2*strikePower;
	double block=0.2*strikePower;

	void setHeroName(String name) {
		heroName = name;
	}

	String getName() {
		return heroName;
	}
	void setIntelligence(double intel) {
		intelligence = intel;
	}
	
	void setAgility(double agil) {
		agility = agil;
	}
	
	void setStrength(double str) {
		strength = str;
	}
	
	Double getIntelligence() {
		return intelligence;
	}
	
	Double getAgility() {
		return agility;
	}
	
	Double getStrength() {
		return strength;
	}
	
	Double getStrikePower() {
		return strikePower;
	}
	
	Double getCriticalStrike() {
		return criticalStrike;
	}
	
	Double getBlock() {
		return block;
	}

	Double getHealth() {
		return health;
	}
	
	void getInfo() {
		strikePower = intelligence / 3 + agility / 2 + strength;
		System.out.println(heroName + " params: intelligence " + intelligence + ", agility " + agility + ", strength "
				+ strength + ", strikePower " + strikePower + ", health " + health);
	}

	void getHelth() {
		strikePower = intelligence / 3 + agility / 2 + strength;
		if (health > 0) {
			System.out.println(heroName + " params: intelligence " + intelligence + ", agility " + agility
					+ ", strength " + strength + ", strikePower " + strikePower + ", health " + health);
		} else {
			System.out.println(heroName + " params: intelligence " + intelligence + ", agility " + agility
					+ ", strength " + strength + ", strikePower " + strikePower + ", health 0");
		}

	}

}
