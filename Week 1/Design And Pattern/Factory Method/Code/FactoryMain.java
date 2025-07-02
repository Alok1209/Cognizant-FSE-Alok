import java.util.Scanner;

public class FactoryMain {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the type of Notification");
        String s =sc.nextLine();
        Notification notification=NotificationFactory.createNotification(s.trim());
        if(notification == null){
            System.out.println("No Notification Created");
            
        }
        else{

            notification.notifyUser();
        }
        
        sc.close();

    }
}

interface Notification{
    void notifyUser();
}

class SMSNotification implements Notification{
    public void notifyUser(){
        System.out.println("Sending SMS Notification");
    }
}
class EmailNotification implements Notification{
    public void notifyUser(){
        System.out.println("Sending Email");
    }

}

class PushNotification implements Notification{
    public void notifyUser(){
        System.out.println("Sending Push Notification");
    }
}

class NotificationFactory{
    public static Notification createNotification(String type){
        if(type.equalsIgnoreCase("Email")){
            return new EmailNotification();

        }
        else if(type.equalsIgnoreCase("SMS")){
            return new SMSNotification();
        }
        else if(type.equalsIgnoreCase("PUSH")){
            return new PushNotification();
        }
        System.out.println("Invalid Notification Type");
        return null;
    }
}