package com.kuester.games.herosfight;

import com.kuester.games.herosfight.application.attacks.FireAttack;
import com.kuester.games.herosfight.application.attacks.SwordAttack;
import com.kuester.games.herosfight.domain.entities.HeroEntity;

public class FightRound {
	private HeroEntity player1;
	private HeroEntity player2;

	public FightRound(HeroEntity player1, HeroEntity player2) {
		this.player1 = player1;
		this.player2 = player2;
	}
	
	public void fight() {
		takeAttackTurn(player1, player2);
		
		takeAttackTurn(player2, player1);		
		player2.setAttackBehavior(new FireAttack());
		takeAttackTurn(player2, player1);
		
		takeAttackTurn(player1, player2);
		
		player2.setAttackBehavior(new SwordAttack());
		takeAttackTurn(player2, player1);
		takeAttackTurn(player2, player1);
	}
	
	private void takeAttackTurn(HeroEntity attacker, HeroEntity defender) {
		System.out.println("================================================");
		System.out.println(player1.getName() + " [HP: " + player1.getHp() + "]  VS  " + player2.getName() + " [HP: " + player2.getHp() + "]");
		System.out.println("================================================\n");
		System.out.println(attacker.getName() + " hits " + defender.getName() + " with " + attacker.getAttackBehavior().getAttackName());		
		System.out.println(attacker.getAttackBehavior().getAttackImage());
		System.out.println("Damage: " + attacker.getAttackBehavior().getDamage() + "\n");
		
		attacker.attack(defender);
		
		if (defender.getHp() <= 0) {
			System.out.println("************************************************");
			System.out.println(defender.getName() + " Destroyed");
			System.out.println(attacker.getName() + " WIN!");
			System.out.println("************************************************");
		}
	}
}
