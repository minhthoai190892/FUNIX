package InnerAndAbstractClassesAndInterfaces.TelePhone;

public class DeskPhone implements ITelephone {
    private int myNumber;
    private boolean isRingning;

    @Override
    public void powerOn() {
        // TODO Auto-generated method stub
        System.out.println("No action taken, desk phone does not have a power button");
    }

    @Override
    public void dial(int phoneNumber) {
        // TODO Auto-generated method stub
        System.out.println("Not ringing " + phoneNumber + " on deskphone");
    }

    @Override
    public void answer() {
        // TODO Auto-generated method stub
        if (isRingning) {
            System.out.println("Answering the desk phone");
            isRingning = false;
        }

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        // TODO Auto-generated method stub
        if (phoneNumber == myNumber) {
            isRingning = true;
            System.out.println("Ring ring");
        } else {
            isRingning = false;
        }
        return isRingning;
    }

    @Override
    public boolean isRing() {
        // TODO Auto-generated method stub
        return isRingning;
    }

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    
}
