package com.cts.observer;

public class SteveObserver implements INotificationObserver {
	String name;
	@Override
	public void onServerDown() {
		System.out.println("Notification has been received by " +name);
	}
	@Override
	public String toString() {
		return name;
	}
	public SteveObserver(String name) {
		super();
		this.name = name;
	}

}
