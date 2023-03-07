
public class Cat {
    private String catName;
    private int catAge;

    public Cat(String catName, int catAge) {
        this.catName = catName;
        this.catAge = catAge;
    }

    public String getCatName() {
        return catName;
    }

    public int getCatAge() {
        return catAge;
    }

    public void getPetted(Human2 human2) {
        System.out.printf("%s получила поглаживание от %s\n", catName, human2.getFullName());
    }

    public void reply(Human2 human2) {
        System.out.printf("%s подошла к %s и ответила 'Мурррр, Мяуууу'\n", catName, human2.getFullName());
    }
}
