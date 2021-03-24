package com.cts.observer;

public class Main {
	private static INotificationService notificationService;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Observer tahsim=new Admin("Tahsim");
		Observer akram=new Admin("Akram");
		Observer rahul=new Admin("Rahul");
		
		Events wrestleMania = new Events("Wrestlemania", 150);
		Events worldCup = new Events("WorldCup", 99);
		Events ipl = new Events("IPL",115);
		Events wimbledon = new Events("Wimbledon", 101);
		notificationService=new NotificationService();
		notificationService.addSubscriber(tahsim);
		notificationService.addSubscriber(akram);
		notificationService.addSubscriber(rahul);
		notificationService.addEvent(wrestleMania);
		notificationService.addEvent(worldCup);
		notificationService.addEvent(ipl);
		notificationService.addEvent(wimbledon);
		notificationService.notifySubscriber();
		notificationService.removeSubscriber(rahul);
		notificationService.notifySubscriber();
		notificationService.removeEvent(wimbledon);
		notificationService.notifySubscriber();
		
	}

}