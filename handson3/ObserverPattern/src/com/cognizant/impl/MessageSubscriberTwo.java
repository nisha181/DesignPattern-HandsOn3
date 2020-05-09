package com.cognizant.impl;

import java.util.ArrayList;

import java.util.List;

import com.cognizant.interfaces.Observer;
import com.cognizant.main.Message;

public class MessageSubscriberTwo implements Observer

{

	@Override

	public void update(Message m) {

		System.out.println("MessageSubscriberTwo :: " + m.getMessageContent());

	}
}
