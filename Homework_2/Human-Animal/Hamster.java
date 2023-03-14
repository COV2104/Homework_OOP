/**
 * Hamster
 */
public class Hamster extends HomeAnimal{

    public Hamster(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void eat(Human human) {
        System.out.printf("%s получил еду от %s, поел орехи и яблочко", this.getName(), human.getFullName());
        
    }

    @Override
    public void reaction(Human human) {
        System.out.println(this.getName() + " бегает в колесе");
        
    }

    @Override
    public void reply(Human human) {
        System.out.println(this.getName() + " с интересом выглядывает из домика");
        
    }

    @Override
    public void speak() {
        System.out.println(this.getName() + " говорит 'Пи-пи-пи'");
        
    }
       
}
