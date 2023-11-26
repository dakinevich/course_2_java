import javax.swing.*;
import java.awt.*;

public class ApplicationView extends JFrame {
    private JTextField serviceField;

    public void showWindow(String info){
        setTitle("StudentView");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLayout(new GridLayout(3, 2));

        serviceField = new JTextField(20);
        serviceField.setText(info);
        add(serviceField);
    }
}
