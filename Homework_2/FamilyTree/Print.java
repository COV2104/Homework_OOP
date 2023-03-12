/**
 * класс для визуализации данных в консоли
 */
class Print {
    Reserch gTree;

    public Print(Reserch geoTree) {
        this.gTree = geoTree;
    }

    public void printParent(Person person) {
        System.out.printf("%s | родители --> ", person.getFullName());
        System.out.println(this.gTree.getParents(person));
    }

    public void printChildren(Person person) {
        System.out.printf("%s | дети --> ", person.getFullName());
        System.out.println(this.gTree.getChildren(person));
    }

    public void printSpouses(Person person) {
        System.out.printf("%s | брак --> ", person.getFullName());
        System.out.println(this.gTree.getSpouses(person));
    }

    public void printAllData(){
        System.out.println(this.gTree.toString());
    }
}