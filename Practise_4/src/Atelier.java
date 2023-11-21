class Atelier {
    public void dressWomen(Clothes [] clothes) {
        System.out.println("Женская одежда:");
        for (Clothes c : clothes) {
            if (c instanceof WomenClothing) {
                System.out.println("Размер: " + c.getSize());
                System.out.println("Стоимость: " + c.getCost());
                System.out.println("Цвет: " + c.getColor());
                ((WomenClothing) c).dressWomen();
                System.out.println();
            }
        }
    }

    public void dressMan(Clothes [] clothes) {
        System.out.println("Мужская одежда:");
        for (Clothes c : clothes) {
            if (c instanceof MenClothing) {
                System.out.println("Размер: " + c.getSize());
                System.out.println("Стоимость: " + c.getCost());
                System.out.println("Цвет: " + c.getColor());
                ((MenClothing) c).dressMan();
                System.out.println();
            }
        }
    }
}