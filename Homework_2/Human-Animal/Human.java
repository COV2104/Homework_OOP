
public class Human {
    private String fullName;
    private int age;

    public Human(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public void feedAnimal() {
        System.out.printf("%s покормил домашнего питомца\n", fullName);
    }

    public void callAnimal() {
        System.out.printf("%s позвал домашнего питомца\n", fullName);
    }

    public void watchAnimal() {
        System.out.printf("%s наблюдает за домашним питомцем\n", fullName);
    }
}