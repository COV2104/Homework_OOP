package Phone;

public class LandlinePhone extends Phone{

    public LandlinePhone(String brand,String model) {
        super(brand, model);
    }

    @Override
    public void makeCall(String phoneNumber) {
        System.out.println("Набор номера " + phoneNumber + " со стационарного телефона.");
    }

    @Override
    public void receiveCall(String phoneNumber) {
        System.out.println("Получение звонка от " + phoneNumber + " на стационарном телефоне.");
    }
    
    @Override
    public String toString() {
        return "Стационарный телефон: Модель - " + this.getBrand()+" - " + this.getModel() ;
    }
}
