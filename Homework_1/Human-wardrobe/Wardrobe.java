/**
 * шкаф
 */
public class Wardrobe {

    private int height;
    private int numberOfShelves;
    private String material;

    public Wardrobe(int height, int numberOfShelves, String material) {
        this.height = height;
        this.numberOfShelves = numberOfShelves;
        this.material = material;
    }

    public int getSize() {
        return height;
    }

    public void setSize(int height) {
        this.height = height;
    }

    public int getNumberOfShelves() {
        return numberOfShelves;
    }

    public void setNumberOfShelves(int numberOfShelves) {
        this.numberOfShelves = numberOfShelves;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void openDoor() {
        System.out.println("Открыли дверь.");
    }

    public void closeDoor() {
        System.out.println("Закрыли дверь.");
    }

    public void addThingToShelf() {
        System.out.println("Положили вещи на полку.");
    }

    public void takeThingToShelf() {
        System.out.println("Взяли вещи с полки.");
    }
}