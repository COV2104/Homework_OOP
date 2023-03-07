public class Main2 {
    public static void main(String[] args) {
        Human2 misha = new Human2("Миша", 20);
        Cat murka = new Cat("Мурка", 2);

        misha.pettingCat(murka);
        murka.getPetted(misha);
    
        misha.callCat(murka);
        murka.reply(misha);
    }
}
