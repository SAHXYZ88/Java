interface Notification {
    void send(String message);
}
class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Email Sent : " +message);
    }
}
class SMSNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("SMS Sent : " + message);
    }
}

class TelegramNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Telegram Sent : " + message);
    }
}

class NotificationService {
    public void sendNotification(Notification notification, String message) {
        notification.send(message);
    }
}

public class NotificationServiceDemo {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();
        service.sendNotification(
            new EmailNotification(), 
            "Hello via Email!"
        );
        service.sendNotification(
            new TelegramNotification(),
            "Hello via Telegram!"
        );
        service.sendNotification(
            new SMSNotification(),
                "OTP : 8276"
            );
    }
}
