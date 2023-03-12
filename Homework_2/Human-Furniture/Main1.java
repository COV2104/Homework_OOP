public class Main1 {
    public static void main(String[] args) {
        Human1 misha = new Human1("Михаил", 30);
        Wardrobe kitchenCabinet = new Wardrobe(200, "бразильский орех");

        misha.putThingToWardrobe(kitchenCabinet);
        misha.takeThingToWardrobe(kitchenCabinet);
    }
}
