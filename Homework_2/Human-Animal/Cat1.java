/**
 * Cat
 */
public class Cat1 extends HomeAnimal {

    public Cat1(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void eat(Human human) {
        System.out.printf("%s получила еду от %s, и поела рыбку\n", this.getName(), human.getFullName());
    }

    @Override
    public void reaction(Human human) {
        System.out.println(this.getName() + " гуляет, сама по себе");

    }

    @Override
    public void reply(Human human) {
        System.out.println(this.getName() + " ответила на зов " + human.getFullName());

    }

    @Override
    public void speak() {
        System.out.println(this.getName() + " говорит 'Муррр! Мяууу!'");

    }
}