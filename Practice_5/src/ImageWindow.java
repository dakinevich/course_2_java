import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageWindow extends JFrame {
    private BufferedImage image;

    public ImageWindow(String imagePath) {
        setTitle("Image Window");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);

        try {
            image = ImageIO.read(new File(imagePath));
        } catch (IOException e) {
            e.printStackTrace();
        }

        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);

        g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
    }

    public static void main(String[] args) {
        if (args.length > 0) {
            new ImageWindow(args[0]);
        } else {
            System.out.println("Please provide the path to an image file as a command line argument.");
        }
    }
}