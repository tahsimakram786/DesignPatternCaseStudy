package com.cts.observer;

public class JohnObserver implements INotificationObserver {

	String name;
	@Override
	public void onServerDown() {
		System.out.println("Notification has been received by " + name);
	}
	@Override
	public String toString() {
		return name;
	}
	public JohnObserver(String name) {
		super();
		this.name = name;
	}

	
	
	
}
