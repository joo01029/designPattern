package com.company.strategy;

/**
 * 무기라는 인터페이스를 데이터로 가져서
 * 무기를 상속받는 객체들로 상황에 맞게 바꾸어서
 * 사용
 */
public class Player {
	private Weapon weapon;

	public Player(Weapon weapon){
		this.weapon = weapon;
	}

	public void attack(){
		weapon.attack();
	}

	public void defence(){
		weapon.defence();
	}

	public static void main(String[] args){
		Player player1 = new Player(new Sword());
		Player player2 = new Player(new Ax());

		player1.attack();
		player1.defence();

		player2.attack();
		player2.defence();
	}
}
