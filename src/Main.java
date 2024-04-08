// Main.java
public class Main {
    public static void main(String[] args) {
        // Создаем экземпляры Androids и iPhones
        Smartphones AndroidPhone = new Androids();
        Smartphones IPhone = new IPhones();

        // Вызываем методы для Androids
        AndroidPhone.call();
        AndroidPhone.sms();
        AndroidPhone.internet();
        ((Androids) AndroidPhone).runLinuxCommands();

        // Вызываем методы для iPhones
        IPhone.call();
        IPhone.sms();
        IPhone.internet();
        ((IPhones) IPhone).runIOSApps();
    }
}
