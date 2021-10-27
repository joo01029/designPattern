package com.company.adapter;

//결재수단2
public class Card implements Pay{
	private int money = 0;

	public Card(int money){
		this.money = money;
	}

	public Card() {

	}

	@Override
	public void payment(int money) {
		if(getMoney(money) == 0){
			System.out.println("결재 취소");
		}else{
			System.out.println("결재 성공");
		}
	}

	@Override
	public void changeMoney(Pay item, int money) {
		this.money += item.getMoney(money);
	}

	@Override
	public int getMoney(int money) {
		if(money > this.money){
			System.out.println("돈이 부족합니다.");
			return 0;
		}
		this.money -= money;
		return money;
	}

	@Override
	public int checkMoney() {
		return money;
	}
}
