
public class IPhones implements Smartphones, IOS {
    @Override
    public void call() {
        System.out.println("Calling from IPhones");
    }

    @Override
    public void sms() {
        System.out.println("Sending SMS from IPhones");
    }

    @Override
    public void internet() {
        System.out.println("Browsing internet from IPhones");
    }

    @Override
    public void runIOSApps() {
        System.out.println("Running IOS apps on IPhones");
    }
}
