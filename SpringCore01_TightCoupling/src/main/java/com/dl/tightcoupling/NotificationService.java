package com.dl.tightcoupling;

public class NotificationService {
	
	EmailService service = new EmailService();
	
	public void sendNotification(String message){
		
		service.sendEmail(message);
	}
	
	public static void main(String[] args) {
		
		NotificationService notificationService = new NotificationService();
		notificationService.sendNotification("Hello Team");
	}
}
