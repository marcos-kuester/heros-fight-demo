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
		this.attackBehavior.performAttack(this, defender);
	}
	
	public AttackBehaviorInterface getAttackBehavior() {
		return this.attackBehavior;
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
		this.hp = this.hp - damage;
	}
}
