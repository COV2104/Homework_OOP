/**
 * Dog
 */
public class Dog extends HomeAnimal implements CommandExecution {

    public Dog(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void eat(Human human) {
        System.out.printf("%s получил еду от %s, и поел мясо\n", this.getName(), human.getFullName());
    }

    @Override
    public void reaction(Human human) {
        System.out.println(this.getName() + " бегает, радуется жизни");

    }

    @Override
    public void reply(Human human) {
        System.out.printf("%s подбегает к %s, виляя хвостом\n", this.getName(), human.getFullName());

    }

    @Override
    public void speak() {
        System.out.println(this.getName() + " говорит 'Гав! Гав! Гав!'");

    }

    @Override
    public void commandExecution(Human human, String command) {
        if (command == "Голос"){
            speak();
        }else{
            System.out.println(this.getName() + " выполняет команду '" + command + "'" );
        }
    }

}
