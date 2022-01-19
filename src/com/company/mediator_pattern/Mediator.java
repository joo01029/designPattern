package com.company.mediator_pattern;

import java.util.ArrayList;
import java.util.List;

public class Mediator {
	private List<User> users;

	public void addUser(User user){
		users.add(user);
	}

	public void sendMessage(String target, Message message){
		for(User user:users){
			if(user.getName().equals(target)){
				user.addMessage(message);
				break;
			}
		}
		System.out.println(message.getUserName()+"님이 "+target+"님에게 메세지를 전송하였습니다.");
	}

	public Mediator(){
		this.users = new ArrayList<>();
	}
}
