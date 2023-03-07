public class Human {
    private String fullName;
    private int age;

    public Human(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public void putThingToWardrobe(Wardrobe wardrobe) {
        wardrobe.openDoor();
        wardrobe.addThingToShelf();
        wardrobe.closeDoor();
        System.out.println("Вы положили вещи в шкаф");
    }

    public void takeThingToWardrobe(Wardrobe wardrobe) {
        wardrobe.openDoor();
        wardrobe.takeThingToShelf();
        wardrobe.closeDoor();
        System.out.println("Вы достали вещи из шкафа");
    }
}