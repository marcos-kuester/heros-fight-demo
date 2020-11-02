package com.kuester.games.herosfight.domain.entities;

import com.kuester.games.herosfight.domain.interfaces.AttackBehaviorInterface;

public class HeroEntity {
	private String name;
	private int hp;	
	private AttackBehaviorInterface attackBehavior;
	
	public HeroEntity(String name, int hp, AttackBehaviorInterface attackBehavior) {
		this.name = name;
		this.setHp(hp);		
		this.setAttackBehavior(attackBehavior);
	}
	
	public void attack(HeroEntity defender) {
		System.out.println("========================================");
		System.out.println(this.getName() + " [HP: " + this.getHp() + "] X " + defender.getName() + " [HP: " + defender.getHp() + "]");
		System.out.println("========================================\n");		
		System.out.println(this.getName() + " hits " + defender.getName() + " with " + this.attackBehavior.getAttackName());
		System.out.println(this.attackBehavior.getAttackImage());
		
		this.attackBehavior.performAttack(this, defender);
	}
	
	public void setAttackBehavior(AttackBehaviorInterface attackBehavior) {
		this.attackBehavior = attackBehavior;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setDamage(int damage) {
		System.out.println("Damage: " + damage + "\n");
		this.hp = this.hp - damage;
		
		if (this.getHp() <= 0) {
			System.out.println("***********************");
			System.out.println(this.getName() + " destroyed!");
			System.out.println("***********************");
		}
	}
}
