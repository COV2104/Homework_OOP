package Phone;

public class Main {
    public static void main(String[] args) {
        LandlinePhone lPhone = new LandlinePhone("Panasonic", "TS2350RUW");
        MobilePhone mPhone = new MobilePhone("Nokia", "3310");
        SmartPhone sPhone = new SmartPhone("Honor","50 lite");

        System.out.println(lPhone.toString()); 
        lPhone.makeCall("8(029)561-55-99");
        lPhone.receiveCall("8(029)561-55-99");

        System.out.println(mPhone.toString());
        mPhone.makeCall("8(029)561-55-99");
        mPhone.receiveCall("8(029)561-55-99");
        mPhone.alarmClock("06:00");
        mPhone.sendMessage("8(029)561-55-99", "Hello, darling");
        mPhone.receiveMessage("8(029)561-55-99","Bye, darling");

        System.out.println(sPhone.toString());
        sPhone.makeCall("8(029)561-55-99");
        sPhone.receiveCall("8(029)561-55-99");
        sPhone.alarmClock("06:00");
        sPhone.sendMessage("8(029)561-55-99", "Hello, darling");
        sPhone.receiveMessage("8(029)561-55-99","Bye, darling");
        sPhone.internetAccess("www.google.com");
        sPhone.takePhoto();

    }
}
