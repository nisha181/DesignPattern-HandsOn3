package com.cognizant.main;

import com.cognizant.impl.MessagePublisher;
import com.cognizant.impl.MessageSubscriberOne;
import com.cognizant.impl.MessageSubscriberThree;
import com.cognizant.impl.MessageSubscriberTwo;

public class Main

{

	public static void main(String[] args)

	{

		MessageSubscriberOne s1 = new MessageSubscriberOne();

		MessageSubscriberTwo s2 = new MessageSubscriberTwo();

		MessageSubscriberThree s3 = new MessageSubscriberThree();

		MessagePublisher p = new MessagePublisher();

		p.attach(s1);

		p.attach(s2);

		p.notifyUpdate(new Message(" This is the First Message")); // s1 and s2 will receive the update

		p.detach(s1);

		p.attach(s3);

		p.notifyUpdate(new Message(" This is the Second Message")); // s2 and s3 will receive the update
			
		p.detach(s2);
		
		
		p.attach(s1);
		
		p.notifyUpdate(new Message(" This is the Third Message"));//s1 and s3 will receive the update

	}

}
