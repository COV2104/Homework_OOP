import java.util.ArrayList;

public class GeoTree {
    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    // связь родитель <-> ребенок
    public void addParent(Person parent, Person children) {
        tree.add(new Node(parent, Relationship.parent, children));
        tree.add(new Node(children, Relationship.children, parent));
    }

    // связь супруг <-> супруга
    public void addSpouse(Person spouse1, Person spouse2) {
        tree.add(new Node(spouse1, Relationship.spouse, spouse2));
        tree.add(new Node(spouse2, Relationship.spouse, spouse1));

    }
}
