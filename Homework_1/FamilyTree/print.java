class print {
    GeoTree gTree;

    public print(GeoTree geoTree) {
        this.gTree = geoTree;
    }

    public void printParent(Person person) {
        System.out.printf("%s  родители: ", person.getFullName());
        System.out.println(new Reserch(this.gTree).getParents(person));
    }

    public void printChildren(Person person) {
        System.out.printf("%s  дети: ", person.getFullName());
        System.out.println(new Reserch(this.gTree).getChildren(person));
    }

    public void printSpouses(Person person) {
        System.out.printf("%s в браке: ", person.getFullName());
        System.out.println(new Reserch(this.gTree).getSpouse(person));
    }

    
}
