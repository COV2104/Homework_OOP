package Phone;

public class MobilePhone extends Phone 
implements AlarmClock, Message {

    public MobilePhone(String brand, String model ) {
        super(brand, model);
    }

    @Override
    public void makeCall(String phoneNumber) {
        System.out.println("Набор номера " + phoneNumber + " с мобильного телефона.");
    }

    @Override
    public void receiveCall(String phoneNumber) {
        System.out.println("Получение звонка от " + phoneNumber + " на мобильном телефоне.");
    }

    @Override
    public void alarmClock(String time) {
        System.out.println("Звонок будильника в " + time);
    }

    @Override
    public void sendMessage(String phoneNumber, String message) {
        System.out.println("Отправка сообщения на " + phoneNumber + " с мобильного телефона: " + message);
    }

    @Override
    public void receiveMessage(String phoneNumber, String message) {
        System.out.println("Получение сообщения от " + phoneNumber + " на мобильном телефоне: " + message);
    }
    
    @Override
    public String toString() {
        return "Мобильный телефон: Модель - " + this.getBrand()+" - " + this.getModel() ;
    }
}
