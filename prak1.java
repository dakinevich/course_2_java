import java.util.Scanner;



public class prak1 {

    public static void main(String[] args) {
        System.out.println("Задание 3");
        task3();
        System.out.println("\nЗадание 4");
        task4();
        System.out.println("\nЗадание 5");
        task5(new String[]{"arg1", "arg2", "arg3"});
        System.out.println("\nЗадание 6");
        task6();
        System.out.println("\nЗадание 7");
        task7();
    }

    private static void task3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов в массиве: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Введите " + (i + 1) + "-й элемент массива: ");
            arr[i] = scanner.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        float avg;

        avg = (float) sum / n;

        System.out.println("Сумма элементов массива: " + sum);
        System.out.printf("Среднее арифметическое элементов массива: %.2f\n", avg);
    }
    private static void task4() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов в массиве: ");
        int n = scanner.nextInt(); // считываем количество элементов в массиве
        int[] arr = new int[n]; // создаем массив заданного размера

        // заполняем массив элементами, введенными с клавиатуры
        for (int i = 0; i < n; i++) {
            System.out.print("Введите " + (i+1) + "-й элемент массива: ");
            arr[i] = scanner.nextInt();
        }

        int sum = 0; // переменная для хранения суммы
        int max = arr[0]; // переменная для хранения максимального элемента
        int min = arr[0]; // переменная для хранения минимального элемента

        // вычисляем сумму элементов массива, а также максимальный и минимальный элементы
        int i = 0;
        do {
            sum += arr[i];
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
            i++;
        } while (i < n);

        // выводим результаты на экран
        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Максимальный элемент массива: " + max);
        System.out.println("Минимальный элемент массива: " + min);
    }
    private static void task5(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("Аргумент " + (i+1) + ": " + args[i]);
        }
    }
    private static void task6() {
        double sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += 1.0/i;
            System.out.printf("Х%d = %.2f\n", i, sum);
        }
    }
    private static void task7() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        int result = factorial(n); // вызываем метод для вычисления факториала
        System.out.println(n + "! = " + result);
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

}
