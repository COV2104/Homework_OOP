import java.util.ArrayList;

public interface Reserch {
    ArrayList<String> getParents(Person person);
    ArrayList<String> getChildren(Person person);
    ArrayList<String> getSpouses(Person person);
    ArrayList<String> spend(Person person, Relationship rel);
}