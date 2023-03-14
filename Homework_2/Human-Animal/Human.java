
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

    public void feedAnimal(HomeAnimal homeAnimal) {
        System.out.printf("%s покормил %s\n", fullName, homeAnimal.getName());
    }

    public void callAnimal(HomeAnimal homeAnimal) {
        System.out.printf("%s позвал %s\n", fullName, homeAnimal.getName());
    }

    public void watchAnimal(HomeAnimal homeAnimal) {
        System.out.printf("%s наблюдает за %s\n", fullName, homeAnimal.getName());
    }

    public void giveCommand(HomeAnimal homeAnimal, String command) {
        System.out.printf("%s дал %s команду: '%s'\n", fullName ,homeAnimal.getName(), command);
    }

}