package com.kuester.games.herosfight.application.attacks;

import com.kuester.games.herosfight.domain.entities.HeroEntity;
import com.kuester.games.herosfight.domain.interfaces.AttackBehaviorInterface;

public class FireAttack implements AttackBehaviorInterface {
	private static final int DAMAGE = 10;
	
	@Override
	public void performAttack(HeroEntity attacker, HeroEntity defender) {
		defender.setDamage(DAMAGE);		
	}

	@Override
	public String getAttackName() {
		return "Fire Attack";
	}
	
	@Override
	public String getAttackImage() {
		StringBuilder attackImage = new StringBuilder();
		
		attackImage.append(" ____  __  ____  ____\n");
		attackImage.append("(  __)(  )(  _ \\(  __)\n");
		attackImage.append(" ) _)  )(  )   / ) _) \n");
		attackImage.append("(__)  (__)(__\\_)(____)\n");		 
		return attackImage.toString();
	}

	@Override
	public int getDamage() {
		return DAMAGE;
	}
}
