public class prak2 {
    public static void main(String[] args) {
        System.out.println("\nЗадание 1");
        task1();
        System.out.println("\nЗадание 2");
        task2();
        System.out.println("\nЗадание 3");
        task3();
        System.out.println("\nЗадание 4");
        task4();

        System.out.println("\nЗадание 8");
        task8();
        System.out.println("\nЗадание 9");
        task9(args);
        System.out.println("\nЗадание 10");
        task10(args);
    }

    private static void task1(){
        Author author = new Author("John Smith", "john.smith@example.com", 'M');
        System.out.println(author.getName()); // выводим имя автора
        System.out.println(author.getEmail()); // выводим email автора
        author.setEmail("john.smith@gmail.com"); // изменяем email автора
        System.out.println(author.getEmail()); // выводим новый email автора
        System.out.println(author.getGender()); // выводим пол автора
        System.out.println(author.toString()); // выводим информацию об авторе

    }
    private static void task2(){
        TestBall.test();
    }
    private static void task3(){
        Circle [] cr = new Circle[5];
        for (int i = 0; i<cr.length; i++){
            cr[i] = new Circle(0, 0, 0);
        }
        Tester t = new Tester(cr);

        t.getCircle(1).getCenter().setXY(12.5, 12.3);
        for (Circle c: t.getCircles()){
            System.out.println(c.toString());
        }
    }

    private static void task4(){
        // Create a shop
        Shop shop = new Shop();

        // Add some computers to the shop
        Computer computer1 = new Computer("Dell", "XPS", 1200.0);
        Computer computer2 = new Computer("HP", "Pavilion", 800.0);
        Computer computer3 = new Computer("Lenovo", "ThinkPad", 1500.0);

        shop.addComputer(computer1);
        shop.addComputer(computer2);
        shop.addComputer(computer3);

        // Find a computer in the shop
        String brandToFind = "Dell";
        String modelToFind = "XPS";
        double priceToFind = 1200.0;

        Computer foundComputer = shop.findComputer(brandToFind, modelToFind, priceToFind);

        if (foundComputer != null) {
            System.out.println("Found computer:");
            System.out.println("Brand: " + foundComputer.getBrand());
            System.out.println("Model: " + foundComputer.getModel());
            System.out.println("Price: $" + foundComputer.getPrice());
        } else {
            System.out.println("Computer not found.");
        }

        // Remove a computer from the shop
        shop.removeComputer(computer2);

        // Try to find the removed computer
        foundComputer = shop.findComputer("HP", "Pavilion", 800.0);

        if (foundComputer != null) {
            System.out.println("Found computer after removal:");
            System.out.println("Brand: " + foundComputer.getBrand());
            System.out.println("Model: " + foundComputer.getModel());
            System.out.println("Price: $" + foundComputer.getPrice());
        } else {
            System.out.println("Computer not found after removal.");
        }

    }
    private static void task8(){

        String[] arr = {"apple", "banana", "cherry", "date", "fig"};

        System.out.println("Исходный массив:");
        printArray(arr);

        reverseArray(arr);

        System.out.println("\nМассив после обращения:");
        printArray(arr);
    }

    public static void reverseArray(String[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Меняем местами элементы
            String temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Переходим к следующей паре элементов
            left++;
            right--;
        }
    }

    public static void printArray(String[] arr) {
        for (String element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    private static void task9(String []args){
        Poker.main(args);
    }

    public static void task10(String[] args) {
        HowMany.main(args);
    }

}
