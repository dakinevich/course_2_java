import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MathCalculate mc1 = new MathFunc();
        float radius = 11.5f;
        float circle_l = mc1.Pi * mc1.Pi * radius;

        System.out.println("Circle radius: " + radius + " circle lenght: "+ circle_l);
        System.out.println("Real: 12, imagine: -3 in power of 3: " + Arrays.toString(mc1.pow(12, -3, 3)));
    }
}