package com.basics.designPattern.factory;

public class NotificationService {
	public static void main(String[] args) {
		NotificationFactory nf=new NotificationFactory();
		Notification n = nf.createNotification("PUSH");
		n.notifyUser();
	}
}
