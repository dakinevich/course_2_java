import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Zones extends JFrame implements MouseListener {
    private JLabel label;

    public Zones() {
        setTitle("Mouse Events Demo");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel("Click me!");
        label.addMouseListener(this);

        add(label);

        setVisible(true);
    }


    @Override
    public void mouseClicked(MouseEvent mouseEvent) {

    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getComponent().getBounds().contains(e.getPoint())) {
            if (e.getComponent().getBounds().contains(e.getPoint())) {
                if (e.getX() < getWidth() / 3) {
                    JOptionPane.showMessageDialog(null, "Добро пожаловать в ЗАО");
                } else if (e.getX() > 2 * getWidth() / 3) {
                    JOptionPane.showMessageDialog(null, "Добро пожаловать в ВАО");
                } else if (e.getY() < getHeight() / 3) {
                    JOptionPane.showMessageDialog(null, "Добро пожаловать в САО");
                } else {
                    JOptionPane.showMessageDialog(null, "Добро пожаловать в ЮАО");
                }
            }
        }
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {

    }
}