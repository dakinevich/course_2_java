abstract class Clothes {
    private Main.ClothingSize size;
    private double cost;
    private String color;

    public Clothes(Main.ClothingSize size, double cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }

    public Main.ClothingSize getSize() {
        return size;
    }

    public double getCost() {
        return cost;
    }

    public String getColor() {
        return color;
    }
}
