package com.company.adapter;

//어뎁터
public class ATM {

	//Pay수단을 지폐로 변환
	public static PaperMoney getMoney(Pay payment, int Money){
		PaperMoney paperMoney = new PaperMoney(0);
		paperMoney.changeMoney(payment, Money);
		return paperMoney;
	}
}
