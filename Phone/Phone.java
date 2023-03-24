package Phone;

public abstract class Phone {
    private String model;
    private String brand;
    
    
    public Phone(String brand, String model) {
        this.model = model;
        this.brand = brand;
        
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public abstract void makeCall(String phoneNumber);

    public abstract void receiveCall(String phoneNumber);

    
}
