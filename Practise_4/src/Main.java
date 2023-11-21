import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nЗадание 1");
        task1();
        System.out.println("\nЗадание 2");
        task2();

    }
    enum Season {
        SPRING(15),
        SUMMER(30),
        AUTUMN(20),
        WINTER(0);

        private int averageTemperature;

        Season(int averageTemperature) {
            this.averageTemperature = averageTemperature;
        }

        public int getAverageTemperature() {
            return averageTemperature;
        }

        public String getDescription() {
            switch (this) {
                case SPRING:
                    return "Холодное время года";
                case SUMMER:
                    return "Теплое время года";
                case AUTUMN:
                    return "Холодное время года";
                case WINTER:
                    return "Холодное время года";
                default:
                    return "";
            }
        }
    }

    private static void task1(){
        Season favoriteSeason = Season.SUMMER;
        System.out.println("Мое любимое время года: " + favoriteSeason);
        System.out.println("Средняя температура: " + favoriteSeason.getAverageTemperature());
        System.out.println("Описание времени года: " + favoriteSeason.getDescription());

        System.out.println("Все времена года:");
        for (Season season : Season.values()) {
            System.out.println("Время года: " + season);
            System.out.println("Средняя температура: " + season.getAverageTemperature());
            System.out.println("Описание времени года: " + season.getDescription());
        }
    }
    enum ClothingSize {
        XXS(32),
        XS(34),
        S(36),
        M(38),
        L(40);

        private int euroSize;

        ClothingSize(int euroSize) {
            this.euroSize = euroSize;
        }

        public int getEuroSize() {
            return euroSize;
        }

        public String getDescription() {
            switch (this) {
                case XXS:
                    return "Детский размер";
                default:
                    return "Взрослый размер";
            }
        }
    }


    private static void task2(){
        Clothes [] clothes = {
            new TShirt(ClothingSize.S, 25.99, "Red"),
            new Pants(ClothingSize.M, 39.99, "Blue"),
            new Skirt(ClothingSize.XXS, 45.99, "Black"),
            new Tie(ClothingSize.L, 18.99, "Gray")
        };

        Atelier atelier = new Atelier();
        atelier.dressWomen(clothes);
        atelier.dressMan(clothes);
    }


}

// В main методе создаем переменную и выводим всю информацию о ней
