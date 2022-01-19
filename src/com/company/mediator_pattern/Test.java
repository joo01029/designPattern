package com.company.mediator_pattern;

public class Test {
	public static void main(String[] args) {
		Mediator mediator = new Mediator();
		User a = new User(mediator,"a");
		User b = new User(mediator,"b");
		User c = new User(mediator,"c");
		User d = new User(mediator,"d");

		a.sendMessage("b","hi");
		b.sendMessage("a","hi");
		a.sendMessage("c","hi c");
		c.sendMessage("a", "hi a");
		c.sendMessage("b", "hey");

		System.out.println("---a가 받은 메세지---");
		for (Message message:a.getMessages()){
			System.out.println(message.getUserName()+": "+ message.getMessage());
		}

		System.out.println("---b가 받은 메세지---");
		for (Message message:b.getMessages()){
			System.out.println(message.getUserName()+": "+ message.getMessage());
		}
		System.out.println("---c가 받은 메세지---");
		for (Message message:c.getMessages()){
			System.out.println(message.getUserName()+": "+ message.getMessage());
		}
	}
}
