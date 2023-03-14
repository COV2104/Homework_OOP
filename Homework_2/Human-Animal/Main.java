import java.util.ArrayList;
import java.util.Collections;

public class Main {
    
    public static void main(String[] args) {
        Human misha = new Human("Михаил", 30);
        Cat1 murka = new Cat1("Мурка", 8, "Рыжий, полосатый");
        Cat1 markiz = new Cat1("Маркиз", 12, "Белый");
        Dog sharik = new Dog("Шарик", 10, "Черный с подпалом");
        Hamster pushistik = new Hamster("Пушистик", 1, "Норка");

        misha.feedAnimal(murka);
        murka.eat(misha);
        misha.feedAnimal(sharik);
        sharik.eat(misha);

        misha.callAnimal(sharik);
        sharik.reply(misha);
        misha.callAnimal(pushistik);
        pushistik.reply(misha);

        misha.watchAnimal(murka);
        murka.reaction(misha);
        sharik.reaction(misha);
        pushistik.reaction(misha);

        misha.giveCommand(sharik,"Голос" );
        sharik.commandExecution(misha, "Голос");

        ArrayList<HomeAnimal> myPets = new ArrayList<>();
        myPets.add(murka);
        myPets.add(sharik);
        myPets.add(pushistik);
        myPets.add(markiz);
        Collections.sort(myPets, new PetAgeComparator());
        System.out.printf("Животные которых содержит %s :\n", misha.getFullName());
        for (HomeAnimal homeAnimal : myPets) {
            System.out.printf("%s %s лет\n", homeAnimal.getName(),homeAnimal.getAge());
        }
         
    }
}
