package com.company.visitor;

public class Test {
	public static void main(String[] args) {
		Benefit shinsega = new Benefit();
		Member member1 = new GoldMenmber();
		Member member2 = new VipMember();

		shinsega.point((GoldMenmber) member1);
		shinsega.point((VipMember) member2);
	}
}
