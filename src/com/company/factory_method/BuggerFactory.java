package com.company.factory_method;

import com.company.factory_method.bugger.Bugger;
import com.company.factory_method.bugger.CheeseBugger;
import com.company.factory_method.bugger.ChickenBugger;

//버거 공장
public class BuggerFactory {
	//실제 인스턴스 생성하는 곳
	public static Bugger getBugger(BuggerType type){
		switch (type){
			case CHEESE -> {
				return new CheeseBugger();
			}
			case CHICKEN -> {
				return new ChickenBugger();
			}
			default -> {return null;}
		}
	}
}
