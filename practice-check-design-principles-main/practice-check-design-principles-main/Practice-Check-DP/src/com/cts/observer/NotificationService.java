package com.cts.observer;

import java.util.ArrayList;
import java.util.List;

public class NotificationService implements INotificationService {
	
	private List<INotificationObserver> observerList = new ArrayList<INotificationObserver>();
	@Override
	public void addSubscriber(INotificationObserver iNotificationObserver) {
		observerList.add(iNotificationObserver);
		System.out.println("List after adding :: ");
		System.out.println(observerList);
	}

	@Override
	public void removeSubscriber(INotificationObserver iNotificationObserver) {
		observerList.remove(iNotificationObserver);
		System.out.println("List after removing :: ");
		System.out.println(observerList);
	}

	@Override
	public void notifySubscriber() {
		for (INotificationObserver iNotificationObserver : observerList) {
			iNotificationObserver.onServerDown();
		}
	}

}
