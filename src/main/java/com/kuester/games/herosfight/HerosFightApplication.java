package com.kuester.games.herosfight;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kuester.games.herosfight.application.attacks.FireAttack;
import com.kuester.games.herosfight.application.attacks.SwordAttack;
import com.kuester.games.herosfight.domain.entities.HeroEntity;

@SpringBootApplication
public class HerosFightApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(HerosFightApplication.class, args);
	}
	
	@Override
	public void run(String... args) {
		System.out.println("---------- HEROS FIGHT --------------\n");
		
		HeroEntity superman = new HeroEntity("SuperMan", 100, new FireAttack());
		HeroEntity batman = new HeroEntity("BatMan", 100, new SwordAttack());
		
		FightRound fightRound = new FightRound(superman, batman);
		fightRound.fight();
	}
}
