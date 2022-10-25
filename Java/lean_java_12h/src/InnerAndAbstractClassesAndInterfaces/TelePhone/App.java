package InnerAndAbstractClassesAndInterfaces.TelePhone;

public class App {
    public static void main(String[] args) {
        ITelephone iTelephone;
        iTelephone = new DeskPhone(132456789);
        iTelephone.powerOn();
        iTelephone.callPhone(132456889);
        iTelephone.answer();
        System.out.println("=======");
        iTelephone = new MobilePhone(2456);
        iTelephone.powerOn();
        iTelephone.callPhone(2456);
        iTelephone.answer();
    }
}
