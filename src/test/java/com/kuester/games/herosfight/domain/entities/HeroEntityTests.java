package com.kuester.games.herosfight.domain.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.kuester.games.herosfight.application.attacks.FireAttack;
import com.kuester.games.herosfight.application.attacks.SwordAttack;

public class HeroEntityTests {
	
	@Test
	void testAttackBehavior() {
		HeroEntity superman = new HeroEntity("SuperMan", 100, new FireAttack());
		HeroEntity batman = new HeroEntity("BatMan", 100, new SwordAttack());
		
		batman.attack(superman);
		
		assertEquals(70, superman.getHp());
		
		batman.setAttackBehavior(new FireAttack());
		batman.attack(superman);
		
		assertEquals(60, superman.getHp());
	}
}
