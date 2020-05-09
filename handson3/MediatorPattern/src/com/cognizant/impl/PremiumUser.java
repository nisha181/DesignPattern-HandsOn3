package com.cognizant.impl;

import com.cognizant.interfaces.IUser;

public class PremiumUser implements IUser {

	
	private ChatMediator chatMediator;
	private String name;
	
	
	

	public ChatMediator getChatMediator() {
		return chatMediator;
	}

	public void setChatMediator(ChatMediator chatMediator) {
		this.chatMediator = chatMediator;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

	public PremiumUser(ChatMediator chatMediator, String name) {
		super();
		this.chatMediator = chatMediator;
		this.name = name;
	}

	@Override
	public void ReceiveMessage(String msg) {
		System.out.println("name" + name + "msg" + msg);
		
	}

	@Override
	public void SendMessage(String msg) {
		chatMediator.SendMessage(msg);
		
	}

}
