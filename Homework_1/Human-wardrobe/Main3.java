
public class Main3 {

    public static void main(String[] args) {

        Human misha = new Human("Миша", 20);
        Wardrobe wardrobeBedroom = new Wardrobe(150, 10, "дерево");

        misha.putThingToWardrobe(wardrobeBedroom);
        misha.takeThingToWardrobe(wardrobeBedroom);
 
    }
}