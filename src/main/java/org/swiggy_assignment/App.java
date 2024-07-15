package org.swiggy_assignment;

import java.util.Random;

class Player {
	int health;
	int strength;
	int attack;
	Random random;     

	public Player(int health, int strength, int attack) {
		this.health = health;
		this.strength = strength;
		this.attack = attack;
		this.random = new Random();
	}

	int getHealth() {
		return health;
	}

	int attack() {
		
		
		int res=random.nextInt(6)+1;
		return res; // 6-sided die Roll    
	}

	int defend() {
		
		int res=random.nextInt(6)+1;
		return res; // 6-sided die Roll
	}

	void reduceHealth(int damage) {
		health -= damage;		
	}

	boolean isAlive() {
		return health > 0;
	}
}

class MagicalArena {
	Player playerA;
	Player playerB;

	public MagicalArena(Player playerA, Player playerB) {
		this.playerA = playerA;
		this.playerB = playerB;
	}

	void fight() {
		Player attacker = playerA.health < playerB.health ? playerA : playerB;
		Player defender = attacker == playerA ? playerB : playerA;

		while (playerA.isAlive() && playerB.isAlive()) {
			int attackRoll = attacker.attack();
			int defenseRoll = defender.defend();

			int damage = attackRoll * attacker.attack - defenseRoll * defender.strength;
			if (damage > 0) {
				defender.reduceHealth(damage);
			}

			// Swap roles for the next round
			Player temp = attacker;
			attacker = defender;
			defender = temp;
		}

		if (playerA.isAlive()) {
			System.out.println("Player A wins!");
		} else {
			System.out.println("Player B wins!");
		}
	}
}
public class App 
{
    public static void main( String[] args )
    {
    	Player playerA = new Player(50, 5, 10);
		Player playerB = new Player(100, 10, 5);

		MagicalArena arena = new MagicalArena(playerA, playerB);
		arena.fight();    }
}
