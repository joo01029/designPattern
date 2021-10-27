package com.company.adapter;

public interface Pay {
	void payment(int money);
	void changeMoney(Pay item, int money);
	int getMoney(int money);
	int checkMoney();
}
