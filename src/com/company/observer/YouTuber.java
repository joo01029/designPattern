package com.company.observer;

import java.util.ArrayList;
import java.util.List;

public class YouTuber extends User{
	private List<User> subscribers;

	public YouTuber(String name) {
		super(name);
		subscribers = new ArrayList<>();
	}

	public void upload(String title){
		subscribers.stream().forEach((user)->{
			user.alram(name+"님이 "+title+"을 업로드 하셨습니다.");
		});
	}

	public void subscribe(User user){
		subscribers.add(user);
	}

	public void unsubscribe(User user){
		subscribers.remove(user);
	}
}
