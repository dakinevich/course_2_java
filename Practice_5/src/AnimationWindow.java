import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class AnimationWindow extends JFrame {
    private BufferedImage[] frames;
    private int currentFrame = 0;

    public AnimationWindow() {
        setTitle("Animation Window");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);

        frames = new BufferedImage[10];

        try {
            for (int i = 0; i < frames.length; i++) {
                frames[i] = ImageIO.read(new File( "Practice_5/src/"+(i+1) + ".jpg"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        setVisible(true);

        Timer timer = new Timer(100, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                currentFrame = (currentFrame + 1) % frames.length;
                repaint();
            }
        });
        timer.start();
    }

    public void paint(Graphics g) {
        super.paint(g);

        g.drawImage(frames[currentFrame], 0, 0, getWidth(), getHeight(), null);
    }

    public static void main(String[] args) {
        new AnimationWindow();
    }
}