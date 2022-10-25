package InnerAndAbstractClassesAndInterfaces.TelePhone;

public class MobilePhone implements ITelephone {
    private int myNumber;
    private boolean isRingning;
    private boolean isOn = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        // TODO Auto-generated method stub
        isOn = true;
        System.out.println("Mobile powered up");
    }

    @Override
    public void dial(int phoneNumber) {
        // TODO Auto-generated method stub
        if (isOn) {
            System.out.println("Not ringing " + phoneNumber + " on mobile phone");
        } else {
            System.out.println("Phone is switched off");
        }
    }

    @Override
    public void answer() {
        // TODO Auto-generated method stub
        if (isRingning) {
            System.out.println("Answering the mobile phone");
            isRingning = false;
        }

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        // TODO Auto-generated method stub
        if (phoneNumber == myNumber && isOn) {
            isRingning = true;
            System.out.println("Molody ring");
        } else {
            isRingning = false;
            System.out.println("Mobile phone not on or number different");
        }
        return isRingning;
    }

    @Override
    public boolean isRing() {
        // TODO Auto-generated method stub
        return isRingning;
    }

}
