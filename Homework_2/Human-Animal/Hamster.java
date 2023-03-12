public class Hamster extends HomeAnimal implements AnimalActions{

    public Hamster(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + " поел орехи и яблочко");
        
    }

    @Override
    public void reaction() {
        System.out.println(this.getName() + " бегает в колесе");
        
    }

    @Override
    public void reply() {
        System.out.println(this.getName() + " с интересом выглядывает из домика");
        
    }

    @Override
    public void speak() {
        System.out.println(this.getName() + " говорит 'Пи-пи-пи'");
        
    }
    
}
