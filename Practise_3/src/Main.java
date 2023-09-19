import java.util.Arrays;
import java.util.Random;
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
        System.out.println("\nЗадание 5");
        task5();
        System.out.println("\nЗадание 6");
        task6();
        System.out.println("\nЗадание 7");
        task7();



    }

    private static void task1(){

        double[] arr1 = new double[10];
        double[] arr2 = new double[10];

        // генерация массива с помощью Math.random()
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = Math.random();
        }

        // генерация массива с помощью класса Random
        Random random = new Random();
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = random.nextDouble();
        }

        System.out.println("Исходный массив (Math.random()): " + Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.println("Отсортированный массив (Math.random()): " + Arrays.toString(arr1));

        System.out.println("Исходный массив (Random): " + Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.println("Отсортированный массив (Random): " + Arrays.toString(arr2));



    }
    private static void task2(){
        Circle [] cr = new Circle[5];
        for (int i = 0; i<cr.length; i++){
            cr[i] = new Circle(0, 0, 2+i);
        }
        Tester t = new Tester(cr);

        t.getCircle(1).getCenter().setXY(12.5, 12.3);
        for (Circle c: t.getCircles()){
            System.out.println(c.toString());
        }
        System.out.println("Largest: "+t.getLargestCircle());
    }
    private static void task3(){
        int[] arr = new int[4];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(90) + 10;
        }

        System.out.println("Массив: " + Arrays.toString(arr));

        boolean isIncreasing = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[i - 1]) {
                isIncreasing = false;
                break;
            }
        }

        if (isIncreasing) {
            System.out.println("Массив является строго возрастающей последовательностью");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью");
        }
    }

    private static void task4(){
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.print("Введите размер массива: ");
            n = scanner.nextInt();
        } while (n <= 0);

        int[] arr1 = new int[n];
        Random random = new Random();

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = random.nextInt(n + 1);
        }

        System.out.println("Исходный массив: " + Arrays.toString(
                arr1));

        int[] arr2 = new int[n];
        int count = 0;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 == 0) {
                arr2[count++] = arr1[i];
            }
        }

        arr2 = Arrays.copyOf(arr2, count);
        System.out.println("Массив из четных элементов исходного массива: " + Arrays.toString(arr2));

    }
    private static void task5(){
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.print("Введите размер массива: ");
            n = scanner.nextInt();
        } while (n <= 0);

        int[] arr1 = new int[n];
        Random random = new Random();

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = random.nextInt(n + 1);
        }

        System.out.println("Исходный массив: " + Arrays.toString(arr1));

        int[] arr2 = new int[n];
        int count = 0;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 == 0) {
                arr2[count++] = arr1[i];
            }
        }

        arr2 = Arrays.copyOf(arr2, count);
        System.out.println("Массив из четных элементов исходного массива: " + Arrays.toString(arr2));

    }
    private static void task6(){
        //1
        Double d1 = Double.valueOf(3.14);
        Double d2 = Double.valueOf("2.718");
        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);

        //2
        double d3 = Double.parseDouble("1.234");
        System.out.println("d3 = " + d3);

        //3
        double d4 = d1.doubleValue();
        float f1 = d1.floatValue();
        int i1 = d1.intValue();
        long l1 = d1.longValue();

        //4
        System.out.println("d4 = " + d4);
        System.out.println("f1 = " + f1);
        System.out.println("i1 = " + i1);
        System.out.println("l1 = " + l1);

        //5
        String str = Double.toString(3.14);
        System.out.println("str = " + str);
    }
    private static void task7(){
        //convertor
        double amount = 100;
        double rate = 0.85;
        double convertedAmount = CurrencyConverter.convert(amount, rate);
        System.out.printf("%.2f USD is equal to %.2f EUR", amount, convertedAmount);
        System.out.println();


        //shop
        Scanner scanner = new Scanner(System.in);
        double price = 100;
        System.out.println("Enter currency (USD or EUR):");
        String currency = scanner.nextLine();
        rate = currency.equals("USD") ? 1 : 0.85;
        double totalPrice = CurrencyConverter.convert(price, rate);
        System.out.printf("The price of the product is %.2f %s", totalPrice, currency);
        System.out.println();

        //report
        Employee[] employees = {
                new Employee("John Doe", 5000),
                new Employee("Jane Smith", 6000),
                new Employee("Bob Johnson", 4500)
        };
        Report.generateReport(employees);
    }


}
