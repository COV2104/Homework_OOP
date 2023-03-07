import java.util.ArrayList;

public class Reserch {
    ArrayList<String> result = new ArrayList<>();
    ArrayList<Node> tree;

    public Reserch(GeoTree geoTree) {
        tree = geoTree.getTree();
    }

    public ArrayList<String> spend(Person person, Relationship rel) {
        for (Node t : tree) {
            if (t.getP1().getFullName().equals(person.getFullName()) && t.getRe() == rel) {
                result.add(t.getP2().getFullName());
            }
        }
        return result;
    }

    public ArrayList<String> getParents(Person person) {
        return spend(person, Relationship.children);
    }

    public ArrayList<String> getChildren(Person person) {
        return spend(person, Relationship.parent);
    }

    public ArrayList<String> getSpouse(Person person) {
        return spend(person, Relationship.spouse);
    }

}
