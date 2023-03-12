public class Dog extends HomeAnimal implements AnimalActions{

    public Dog(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + " поел мясо");
        
    }

    @Override
    public void reaction() {
        System.out.println(this.getName() + " бегает, радуется жизни");
        
    }

    @Override
    public void reply() {
        System.out.println(this.getName() + " подбегает, виляя хвостом");
        
    }

    @Override
    public void speak() {
        System.out.println(this.getName() + " говорит 'Гав! Гав! Гав!'");
        
    }    
}
