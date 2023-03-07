
public class Human2 {
    private String fullName;
    private int age;

    public Human2(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public void pettingCat(Cat cat) {
        System.out.printf("%s погладил кошку\n", fullName);
    }

    public void callCat(Cat cat) {
        System.out.printf("%s позвал кошку 'кис-кис-кис'\n", fullName);
    }
}
