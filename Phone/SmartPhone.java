package Phone;

public class SmartPhone extends Phone
implements AlarmClock, Message, InternetAccess, TakePhoto{

    public SmartPhone(String brand, String model ) {
        super(brand, model);
    }

    @Override
    public void makeCall(String phoneNumber) {
        System.out.println("Набор номера " + phoneNumber + " со смартфона.");
    }

    @Override
    public void receiveCall(String phoneNumber) {
        System.out.println("Получение звонка от " + phoneNumber + " на смартфон.");
    }

    @Override
    public void alarmClock(String time) {
        System.out.println("Звонок будильника в " + time);
    }
    
    @Override
    public void sendMessage(String phoneNumber, String message) {
        System.out.println("Отправка сообщения на " + phoneNumber + " со смартфона: " + message);
    }

    @Override
    public void receiveMessage(String phoneNumber, String message) {
        System.out.println("Получение сообщения от " + phoneNumber + " на смартфон: " + message);
    }

    @Override
    public void internetAccess(String url) {
        System.out.println("Доступ к интернету со смартфона: " + url);
    }

    @Override
    public void takePhoto() {
        System.out.println("Есть возможность делать фото");
    }

    @Override
    public String toString() {
        return "Смартфон: Модель - " + this.getBrand()+" - " + this.getModel() ;
    }
}
