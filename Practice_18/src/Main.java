import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MyExeption {
        //1
        try{
            System.out.println( 2/0 );
        } catch ( ArithmeticException e){
            System.out.println("Attempted division by zero");
        }

        //2, 3, 4
        try{
            Scanner myScanner = new Scanner( System.in);
            System.out.print( "Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println( 2/i );

        } catch (Exception e){
            System.out.println(e.toString());
        } finally {
            System.out.println("Finally");
        }

        //4
        throw new MyExeption();
    }
}