public class Main {
    public static void main(String[] args) {
        Human misha = new Human("Михаил", 30);
        Cat1 murka = new Cat1("Мурка", 4, "Рыжий, полосатый");
        Dog sharik = new Dog("Шарик", 2, "Черный с подпалом");
        Hamster pushistik = new Hamster("Пушистик", 1, "норка");

        misha.feedAnimal();
        murka.eat();
        sharik.eat();
        pushistik.eat();

        misha.callAnimal();
        murka.reply();
        sharik.reply();
        pushistik.reply();

        misha.watchAnimal();
        murka.reaction();
        sharik.reaction();
        pushistik.reaction();

        murka.speak();
        sharik.speak();
        pushistik.speak();

    }
}
