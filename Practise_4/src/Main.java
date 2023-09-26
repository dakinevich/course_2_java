import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nЗадание 1");
        task1();
        System.out.println("\nЗадание 2");
        task2();
        System.out.println("\nЗадание 3");
        task3();
        System.out.println("\nЗадание 4");
        task4();
    }
    private static void task1(){
        Season myFavoriteSeason = Season.SUMMER;
        System.out.println("Мое любимое время года - " + myFavoriteSeason.name());
        System.out.println("Средняя температура - " + myFavoriteSeason.getAverageTemperature());
        System.out.println("Описание - " + myFavoriteSeason.getDescription());
    }
    private static void task2(){
    }
    private static void task3(){
    }
    private static void task4(){
    }

}

// В main методе создаем переменную и выводим всю информацию о ней
