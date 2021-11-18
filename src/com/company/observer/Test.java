package com.company.observer;

public class Test {
	public static void main(String[] args) {
		YouTuber mnet = new YouTuber("Mnet");
		User user = new User("one");
		User user2 = new User("two");
		User user3 = new User("three");
		mnet.subscribe(user);
		mnet.subscribe(user2);
		mnet.subscribe(user3);

		mnet.upload("쇼미10 음원미션");
		mnet.unsubscribe(user);
		mnet.upload("쇼미10 디스전");

	}
}
