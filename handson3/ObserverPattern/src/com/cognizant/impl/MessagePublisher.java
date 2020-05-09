package com.cognizant.impl;

import java.util.ArrayList;
import java.util.List;

import com.cognizant.interfaces.Observer;
import com.cognizant.interfaces.Subject;
import com.cognizant.main.Message;

public class MessagePublisher implements Subject {

	private List<Observer> observers = new ArrayList<>();

	@Override

	public void attach(Observer o) {

		observers.add(o);

	}

	@Override

	public void detach(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyUpdate(Message m) {
		for (Observer o : observers) {
			o.update(m);
		}
	}
}
