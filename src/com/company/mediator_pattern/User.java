package com.company.mediator_pattern;


import java.util.ArrayList;
import java.util.List;

public class User {
	private Mediator mediator;
	private String name;
	private List<Message> messages;

	public String getName(){
		return name;
	}

	public List<Message> getMessages(){
		return messages;
	}

	public void sendMessage(String userName, String message){
		mediator.sendMessage(userName, new Message(name, message));
	}

	public void addMessage(Message message){
		messages.add(message);
	}

	public User(Mediator mediator, String name){
		this.mediator = mediator;
		this.name = name;
		this.messages = new ArrayList<>();

		this.mediator.addUser(this);
	}

}
