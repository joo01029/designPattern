package com.company.adapter;

public class Mart {
	public void buy(Pay money, int price){
		if(money.getClass().equals(Card.class)){
			System.out.println("카드 결제 불가능");
			return;
		}
		money.payment(price);
	}

	public static void main(String[] args) {
		Mart mart = new Mart();

		Pay card = new Card(11000);

		//카드로는 결제 불가능
		mart.buy(card, 5000);

		//카드를 현금으로 변경
		Pay paperMoney = ATM.getMoney(card, 5000);

		mart.buy(paperMoney, 5000);
	}
}
