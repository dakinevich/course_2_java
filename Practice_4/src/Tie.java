class Tie extends Clothes implements MenClothing {
    public Tie(Main.ClothingSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Одеваем мужчину в галстук");
    }
}