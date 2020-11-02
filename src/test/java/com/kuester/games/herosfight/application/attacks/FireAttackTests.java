package com.kuester.games.herosfight.application.attacks;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.kuester.games.herosfight.domain.entities.HeroEntity;

@SpringBootTest
public class FireAttackTests {
	
	@Test
	void testFireAttackDamage() {
		HeroEntity superman = new HeroEntity("SuperMan", 100, new FireAttack());
		HeroEntity batman = new HeroEntity("BatMan", 100, new SwordAttack());
		
		superman.attack(batman);
		
		assertEquals(90, batman.getHp());
	}
}
