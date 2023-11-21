import java.util.Scanner;
import java.util.Date;


public class Main {
    public static void main(String[] args) {
        System.out.println("\nЗадание 1");
        task1();
        System.out.println("\nЗадание 5");
        task5();
        System.out.println("\nЗадание 8");
        task8();

    }

    private static void task1(){
        Shape shape1 = new Circle(5);
        Shape shape2 = new Rectangle(4, 6);
        Shape shape3 = new Square(3);

        System.out.println(shape1);
        System.out.println(shape2);
        System.out.println(shape3);
    }
    private static void task5(){
        Reader[] readers = new Reader[3];
        readers[0] = new Reader("Иванов И. И.", 12345, "Физика", new Date(1980, 1, 1), "+7(111)111-11-11");
        readers[1] = new Reader("Петров П. П.", 23456, "Математика", new Date(1985, 2, 2), "+7(222)222-22-22");
        readers[2] = new Reader("Сидоров С. С.", 34567, "Информатика", new Date(1990, 3, 3), "+7(333)333-33-33");

        readers[0].takeBook(3);
        readers[1].takeBook("Приключения", "Словарь", "Энциклопедия");
        readers[2].takeBook(new Book("Приключения Тома Сойера", "Марк Твен"),
                new Book("Война и мир", "Лев Толстой"), new Book("1984", "Джордж Оруэлл"));

        readers[0].returnBook(2);
        readers[1].returnBook("Приключения", "Словарь");
        readers[2].returnBook(new Book("Приключения Тома Сойера", "Марк Твен"),
                new Book("Война и мир", "Лев Толстой"));

    }
    private static void task8(){

    }


}

// В main методе создаем переменную и выводим всю информацию о ней
