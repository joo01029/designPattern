package com.company.observer;

public class User {
	protected String name;

	public User(String name){
		this.name = name;
	}

	public void alram(String message){
		System.out.println(name+"님 "+message);
	}
}
