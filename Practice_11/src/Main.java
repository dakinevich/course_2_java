import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task0();
        task1();
        task2();
        task3();
        task4();
    }
    public static void task0(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMMM dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR,2002);
        cal.set(Calendar.MONTH,Calendar.AUGUST);

        cal.set(Calendar.DAY_OF_MONTH,31);
        System.out.println(" Initialy set date:"+ sdf.format(cal.getTime()));

        cal.set(Calendar.MONTH,Calendar.SEPTEMBER);
        System.out.println(" Date with month changed :"+ sdf.format(cal.getTime()));

        cal.set(Calendar.DAY_OF_MONTH,30);
        System.out.println(" Date with day changed:"+ sdf.format(cal.getTime()));

        sdf = new SimpleDateFormat("E, y-M-d 'at' h:m:s a z");
        System.out.println("Format 3: " + sdf.format(cal.getTime()));

        System.out.println();



    }
    public static void task1(){

    }
    public static void task2(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMMM dd HH:mm:ss");

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR,2002);
        cal.set(Calendar.MONTH,Calendar.AUGUST);
        cal.set(Calendar.DAY_OF_MONTH,31);
        cal.set(Calendar.MONTH,Calendar.SEPTEMBER);
        cal.set(Calendar.DAY_OF_MONTH,30);
        Calendar newcal = Calendar.getInstance();
        System.out.println("Date one: "+ sdf.format(cal.getTime())+
                "\nDate two: "+ sdf.format(newcal.getTime()));
        if (cal.compareTo(Calendar.getInstance()) == 0){
            System.out.println("Are same");
        } else if (cal.compareTo(Calendar.getInstance()) < 0) {
            System.out.println("Second is newer");
        }
        else{
            System.out.println("First is newer");
        }

    }
    public static void task3(){
        Student s = new Student("Peter", "Petrov","Math", "Second","12-23",19, 12, Calendar.getInstance());
        System.out.println(s.toString());
    }
    public static void task4(){
        System.out.println();

        Calendar cal = Calendar.getInstance();
        Scanner input = new Scanner(System.in);

        System.out.print("Введите год: ");
        cal.set(Calendar.YEAR,  input.nextInt());
        System.out.print("Введите месяц: ");
        cal.set(Calendar.MONTH,  input.nextInt());
        System.out.print("Введите число: ");
        cal.set(Calendar.DAY_OF_MONTH,  input.nextInt());
        System.out.print("Введите часы: ");
        cal.set(Calendar.HOUR,  input.nextInt());
        System.out.print("Введите минуты: ");
        cal.set(Calendar.MINUTE,  input.nextInt());

        System.out.println(cal.getTime());
    }
}