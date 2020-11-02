package com.kuester.games.herosfight.domain.interfaces;

import com.kuester.games.herosfight.domain.entities.HeroEntity;

public interface AttackBehaviorInterface {	
	void performAttack(HeroEntity attacker, HeroEntity defender);
	String getAttackName();
	String getAttackImage();
}
