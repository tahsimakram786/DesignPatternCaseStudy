package com.cts.observer;

public class Client {

	public static void main(String[] args) {
		SteveObserver steve = new SteveObserver("Steve");
		JohnObserver john = new JohnObserver("John");
		NotificationService notificationService = new NotificationService();
		
		notificationService.addSubscriber(steve);
		notificationService.addSubscriber(john);
		notificationService.notifySubscriber();
		notificationService.removeSubscriber(steve);
		
	}

}
