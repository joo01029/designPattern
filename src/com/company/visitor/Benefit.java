package com.company.visitor;

public class Benefit {
	public void point(GoldMenmber member){
		System.out.println("포인트가 매달 10000원 지급됩니다.");
	}
	public void point(VipMember member){
		System.out.println("포인트가 매달 50000원 지급됩니다.");
	}

	public void discont(GoldMenmber member){
		System.out.println("물건이 10% 할인됩니다.");
	}

	public void discont(VipMember member){
		System.out.println("물건이 20% 할인됩니다.");
	}
}
