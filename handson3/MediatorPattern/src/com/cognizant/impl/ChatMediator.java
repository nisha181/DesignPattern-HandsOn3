package com.cognizant.impl;

import java.util.ArrayList;
import java.util.List;

import com.cognizant.interfaces.IChatMediator;
import com.cognizant.interfaces.IUser;

public class ChatMediator implements IChatMediator {
	
	List<IUser> users;
	public ChatMediator() {
		this.users=new ArrayList<IUser>();
	}
	@Override
	public void AddUser(IUser user) {
		
		users.add(user);

	}
	


	@Override
	public void SendMessage(String msg) {
		for(IUser user:users) {
			user.ReceiveMessage(msg);
			
		}
		
		
	}

}
