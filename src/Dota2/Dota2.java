package Dota2;

import java.util.Random;
import java.util.Scanner;

public class Dota2 {

	public static void main(String[] args) throws InterruptedException {
		Hero hero1 = new Hero();
		Hero hero2 = new Hero();

		String hero1Name, hero2Name;

		Double hero1Intelligence, hero1Agility, hero1Strength, hero2Intelligence, hero2Agility, hero2Strength;

		System.out.println("Enter hero #1 name");
		Scanner scanner = new Scanner(System.in);
		hero1Name = scanner.nextLine();
		hero1.setHeroName(hero1Name);

		System.out.println("Enter hero #1 intelligence");
		hero1Intelligence = scanner.nextDouble();
		hero1.setIntelligence(hero1Intelligence);

		System.out.println("Enter hero #1 agility");
		hero1Agility = scanner.nextDouble();
		hero1.setAgility(hero1Agility);

		System.out.println("Enter hero #1 strength ");
		hero1Strength = scanner.nextDouble();
		hero1.setStrength(hero1Strength);
				
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("Enter hero #2 name");
		hero2Name = scanner2.nextLine();
		hero2.setHeroName(hero2Name);

		System.out.println("Enter hero #2 intelligence");
		hero2Intelligence = scanner2.nextDouble();
		hero2.setIntelligence(hero2Intelligence);
		
		System.out.println("Enter hero #2 agility");
		hero2Agility = scanner2.nextDouble();
		hero2.setAgility(hero2Agility);

		System.out.println("Enter hero #2 strength ");
		hero2Strength = scanner2.nextDouble();
		hero2.setStrength(hero2Strength);
		
		scanner.close();
		scanner2.close();
		
		Item hero1Item = new Item();
		hero1Item.setNameAbility("Hat", 10);
		hero1Item.setHeroName(hero1.getName());
	
		System.out.println(hero1.getStrikePower());
		System.out.println(hero2.getStrikePower());
		hero1Item.getInfo();

		System.out.println("-----The battle!!!-----");
		while (hero1.getHealth() > 0 && hero2.getHealth()> 0) {
			double damage1, damage2, damage1Block, damage2Block;
			Random str = new Random();
			Random bl = new Random();
			damage1 = (str.nextInt(10) < 2 ? (hero1.strikePower + hero1.criticalStrike) : hero1.strikePower);
			damage2 = (bl.nextInt(10) < 2 ? (hero2.strikePower + hero2.criticalStrike) : hero2.strikePower);
			damage1Block = (bl.nextInt(10) < 2 ? (damage1 - hero2.block) : damage1);
			damage2Block = (bl.nextInt(10) < 2 ? (damage2 - hero1.block) : damage2);
			hero1.health = hero1.health - damage2Block;
			hero1.getHelth();
			Thread.sleep(1000);
			hero2.health = hero2.health - damage1Block;
			hero2.getHelth();
			Thread.sleep(1000);
			System.out.println("__________________________________");

		} 
		System.out.println(hero1.health < hero2.health ? (hero2.heroName + " Win!") : (hero1.heroName + " Win!"));
		hero1.getHelth();
		hero2.getHelth();
	}

}
