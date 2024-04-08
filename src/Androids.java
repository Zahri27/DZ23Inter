
public class Androids implements Smartphones, LinuxOS {
    @Override
    public void call() {
        System.out.println("Calling from Androids");
    }

    @Override
    public void sms() {
        System.out.println("Sending SMS from Androids");
    }

    @Override
    public void internet() {
        System.out.println("Browsing internet from Androids");
    }

    @Override
    public void runLinuxCommands() {
        System.out.println("Running Linux commands on Androids");
    }
}
