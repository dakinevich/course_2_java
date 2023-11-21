class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(Main.ClothingSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Одеваем мужчину в футболку");
    }

    @Override
    public void dressWomen() {
        System.out.println("Одеваем женщину в футболку");
    }
}