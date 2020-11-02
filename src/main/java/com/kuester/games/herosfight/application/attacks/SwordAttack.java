package com.kuester.games.herosfight.application.attacks;

import com.kuester.games.herosfight.domain.entities.HeroEntity;
import com.kuester.games.herosfight.domain.interfaces.AttackBehaviorInterface;

public class SwordAttack implements AttackBehaviorInterface {
	private static final int DAMAGE = 30;
	
	@Override
	public void performAttack(HeroEntity attacker, HeroEntity defender) {
		defender.setDamage(DAMAGE);
	}

	@Override
	public String getAttackName() {
		return "Sword Attack";
	}
	
	@Override
	public String getAttackImage() {
		StringBuilder attackImage = new StringBuilder();
		
		attackImage.append("            /\\\n");
		attackImage.append("/vvvvvvvvvvvv \\--------------------------------------,\n");
		attackImage.append("`^^^^^^^^^^^^ /=====================================\"\n");
		attackImage.append("            \\/\n");
		
		return attackImage.toString();
	}

	@Override
	public int getDamage() {
		return DAMAGE;
	}
}
