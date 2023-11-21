public class Main {
    public static void main(String[] args) {
        System.out.println("\ntask4");//999
        task4(3, 0, "");

        System.out.println("\ntask5");
        task5(123, 0);

        System.out.println("\ntask6");
        task6(71, 2);

        System.out.println("\ntask7");
        task7(17*4*5);
    }

    public static void task4(int symbsLeft, int currentSum, String number) {
        int d = 27;
        for (int i = 0; i<10; i++){
            if (currentSum+i<=d & symbsLeft*9+currentSum>=d){
                if (symbsLeft == 1 & currentSum+i == d){
                    System.out.println(number+i);
                }
                else{
                    task4(symbsLeft-1, currentSum+i, number+i);
                }
            }
        }
    }
    public static void task5(int numb, int currentSum) {
        if (numb == 0){
            System.out.println(currentSum);
        }
        else{
            task5(numb/10, currentSum+numb%10);
        }
    }
    public static void task6(int numb, int divider) {
        if (is_simp(numb, divider)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    public static void task7(int number) {
        for (int i =2; i<=(int)Math.sqrt(number)+1; i++){
            if (number%i == 0){
                if (is_simp(i, 2)){
                    System.out.println(i);
                }
            }
        }

    }
    public static boolean is_simp(int numb, int divider) {
        if (divider >= (int)Math.sqrt(numb)+1) {
            return true;
        }
        else if (numb%divider == 0){
            return false;
        } else{
            return is_simp(numb, divider+1);
        }
    }
}