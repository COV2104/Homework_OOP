public class Main2 {
    public static void main(String[] args) {
        Person irina = new Person("Ирина");
        Person vladimir = new Person("Владимир");
        Person tatiana = new Person("Татьяна");
        Person aleksandr = new Person("Александр");
        Person olga = new Person("Ольга");
        Person olesa = new Person("Олеся");
        Person valentin = new Person("Валентин");
        Person petr = new Person("Петр");
        Person galina = new Person("Галина");
        
        GeoTree family = new GeoTree();
        family.addParent(vladimir, irina);
        family.addParent(tatiana, irina);
        family.addParent(vladimir, aleksandr);
        family.addParent(tatiana, aleksandr);
        family.addParent(petr, valentin);
        family.addParent(galina, valentin);
        family.addParent(irina, olga);
        family.addParent(irina, olesa);
        family.addParent(valentin, olesa);
        family.addParent(valentin, olga);
        family.addSpouse(valentin, irina);
        family.addSpouse(petr, galina);
        family.addSpouse(tatiana, vladimir);

        new Print(family).printChildren(tatiana);
        new Print(family).printChildren(valentin);
        new Print(family).printParent(olga);
        new Print(family).printParent(aleksandr);
        new Print(family).printSpouses(galina);
        new Print(family).printSpouses(vladimir);



    }
}
