public class Human1 {
    private String fullName;
    private int age;

    public Human1(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public void openDoor() {
        System.out.println("Открыли дверь.");
    }

    public void closeDoor() {
        System.out.println("Закрыли дверь.");
    }

    public void putThingToWardrobe(Furniture furniture) {
        this.openDoor();
        furniture.addThingToShelf();
        this.closeDoor();
        System.out.println("Вы положили вещи в шкаф");
    }

    public void takeThingToWardrobe(Furniture furniture) {
        this.openDoor();
        furniture.addThingToShelf();
        this.closeDoor();
        System.out.println("Вы достали вещи из шкафа");
    }

    
}