package com.company.mediator_pattern;

public class Message {
	private String userName;
	private String message;

	public String getUserName(){
		return userName;
	}
	public String getMessage(){
		return message;
	}

	public Message(String userName, String message){
		this.userName = userName;
		this.message = message;
	}
}
