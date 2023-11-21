import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class RandomShapes extends JFrame {
    private final int WIDTH = 800;
    private final int HEIGHT = 600;

    private Shape[] shapes;

    public RandomShapes() {
        setTitle("Random Shapes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        setVisible(true);
        setResizable(false);

        Random random = new Random();
        shapes = new Shape[20];

        for (int i = 0; i < shapes.length; i++) {
            int x = random.nextInt(WIDTH);
            int y = random.nextInt(HEIGHT);
            int width = random.nextInt(100) + 50;
            int height = random.nextInt(100) + 50;
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));

            if (random.nextBoolean()) {
                shapes[i] = new Circle(color, x, y, width / 2);
            } else {
                shapes[i] = new Rectangle(color, x, y, width, height);
            }
        }
    }

    public void paint(Graphics g) {
        super.paint(g);

        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }

    public static void main(String[] args) {
        new RandomShapes();
    }
}
