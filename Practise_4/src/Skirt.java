class Skirt extends Clothes implements WomenClothing {
    public Skirt(Main.ClothingSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Одеваем женщину в юбку");
    }
}