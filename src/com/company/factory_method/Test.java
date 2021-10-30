package com.company.factory_method;

import com.company.factory_method.bugger.Bugger;


public class Test {
	//메인 로직에서는 생성을 못함
	public static void main(String[] args) {
		Bugger cheeseBugger = BuggerFactory.getBugger(BuggerType.CHEESE);
		int cheeseBugger_price = cheeseBugger.getPrice();
		System.out.println(cheeseBugger_price);

		Bugger chickenBugger = BuggerFactory.getBugger(BuggerType.CHICKEN);
		int chickenBugger_price = chickenBugger.getPrice();
		System.out.println(chickenBugger_price);
	}
}
