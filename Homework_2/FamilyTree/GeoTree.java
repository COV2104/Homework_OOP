import java.util.ArrayList;
import java.util.HashSet;

class GeoTree implements Reserch, Loaded<HashSet<Node>>, Saved<HashSet<Node>> {
    private final HashSet<Node> tree = new HashSet<>();


    /**
     * Отношения родитель <--> потомок
     */
    public void addParent(Person parent, Person children) {
        if (checkPerson(parent, children)) { 
            return;
        }
        tree.add(new Node(parent, Relationship.parent, children)); 
        tree.add(new Node(children, Relationship.children, parent)); 

    }

    /**
     * Отношения супруг <-> супруга 
     */
    public void addSpouse(Person partner1, Person partner2) {
        if (checkPerson(partner1, partner2)) return;
        tree.add(new Node(partner1, Relationship.partner, partner2));
        tree.add(new Node(partner2, Relationship.partner, partner1));

    }

    private boolean checkPerson(Person person1, Person person2) {
        return (person1 == null || person2 == null);
    }

    @Override
    public HashSet<Node> load() {
        // загрузка данных
        return null;
    }

    @Override
    public void Save(HashSet<Node> nodes) {
        // запись данных
    }

    @Override
    public ArrayList<String> getParents(Person person) {
        return spend(person, Relationship.children);
    }

    @Override
    public ArrayList<String> getChildren(Person person) {
        return spend(person, Relationship.parent);
    }


    @Override
    public ArrayList<String> getSpouses(Person person) {
        return spend(person, Relationship.partner);
    }

    @Override
    public ArrayList<String> spend(Person person, Relationship rel) {
        ArrayList<String> result = new ArrayList<>();
        for (Node t : tree) {
            if (t.getP1().getFullName().equals(person.getFullName()) && t.getRe() == rel) {
                result.add(t.getP2().getFullName());
            }
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Node i : this.tree) {
            result.append(i.toString()+"\n");
        }
        return result.toString();
    }

}
