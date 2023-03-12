/**
 * Cat
 */
public class Cat1 extends HomeAnimal implements AnimalActions{

    public Cat1(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + " поела рыбку");
        
    }

    @Override
    public void reaction() {
        System.out.println(this.getName() + " гуляет, сама по себе");
        
    }

    @Override
    public void reply() {
        System.out.println(this.getName() + " ответила на зов");
        
    }

    @Override
    public void speak() {
        System.out.println(this.getName() + " говорит 'Муррр! Мяууу!'");
        
    }

}