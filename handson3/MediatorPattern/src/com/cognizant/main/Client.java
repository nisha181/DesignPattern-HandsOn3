package com.cognizant.main;

import com.cognizant.impl.BasicUser;
import com.cognizant.impl.ChatMediator;
import com.cognizant.impl.PremiumUser;
import com.cognizant.interfaces.IUser;

public class Client {
	public static void main(String[] args) {

		ChatMediator chatMediator = new ChatMediator();
		IUser basicUser=new BasicUser(chatMediator, "nisha");
		IUser premiumUser=new PremiumUser(chatMediator,"tanwi");
		chatMediator.AddUser(basicUser);
		chatMediator.AddUser(premiumUser);
		IUser b1=new BasicUser(chatMediator, "tanu");
		b1.SendMessage("hello");
	}

}
