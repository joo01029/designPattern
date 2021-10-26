package com.company.strategy;

//무기라는 인터페이스를 구현
public class Sword implements Weapon{
	@Override
	public void attack() {
		System.out.println("검 공격");
	}

	@Override
	public void defence() {
		System.out.println("검 방어");
	}
}
