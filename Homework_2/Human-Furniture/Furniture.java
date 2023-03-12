public abstract class Furniture {
    private int height;
    private String material;

    public Furniture(int height, String material) {
        this.height = height;
        this.material = material;
    }

    public int getSize() {
        return height;
    }

    public void setSize(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void addThingToShelf() {
    }
}
