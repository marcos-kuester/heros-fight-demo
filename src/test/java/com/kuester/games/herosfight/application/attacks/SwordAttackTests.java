package com.kuester.games.herosfight.application.attacks;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.kuester.games.herosfight.domain.entities.HeroEntity;

@SpringBootTest
public class SwordAttackTests {

	@Test
	void testSwordAttackDamage() {
		HeroEntity superman = new HeroEntity("SuperMan", 100, new FireAttack());
		HeroEntity batman = new HeroEntity("BatMan", 100, new SwordAttack());
		
		batman.attack(superman);
		
		assertEquals(70, superman.getHp());
	}
}
