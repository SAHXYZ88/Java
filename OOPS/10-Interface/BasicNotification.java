interface Notification {
    void send(String message);
}

class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Email Sent : " + message);
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

public class BasicNotification {
    public static void main(String[] args) {
        Notification n = new EmailNotification();
        n.send("Hello");

        Notification n1 = new SMSNotification();
        n1.send("Hello");

        Notification n2 = new TelegramNotification();
        n2.send("Hello");
    }
}
