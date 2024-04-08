// Main.java
public class Main {
    public static void main(String[] args) {

        Smartphones androidPhone = new Androids();
        Smartphones IPhone = new IPhones();


        androidPhone.call();
        androidPhone.sms();
        androidPhone.internet();
        ((Androids) androidPhone).runLinuxCommands();


        IPhone.call();
        IPhone.sms();
        IPhone.internet();
        ((IPhones) IPhone).runIOSApps();


        Smartphones androidSmartphone = new Androids();
        Smartphones iPhoneSmartphone = new IPhones();


        androidSmartphone.call();
        androidSmartphone.sms();
        androidSmartphone.internet();

        iPhoneSmartphone.call();
        iPhoneSmartphone.sms();
        iPhoneSmartphone.internet();
    }
}
