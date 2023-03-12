/**
 * Wardrobe
 */
public class Wardrobe extends Furniture implements OperationsWithWardrobe{

    public Wardrobe(int height, String material) {
        super(height, material);
    }

    @Override
    public void addThingToShelf() {
        System.out.println("Положили вещи на полку.");
        
    }

    @Override
    public void takeThingToShelf() {
        System.out.println("Взяли вещи с полки.");
        
    }
    
}