import java.awt.*;
import java.awt.event.*;
//первый шаг
public class Main{
    static TextField tf;

    public static void main(String[] args) {

        Frame f=new Frame("ActionListener Example");
        final TextField tf=new TextField();
        tf.setBounds(50,50, 150,20);
        Button b=new Button("Click Here");
        b.setBounds(50,100,60,30);
        //второй шаг
        b.addActionListener(actionEvent -> {
            tf.setText("Добро пожаловать в мир Джава.");
        });
        f.add(b);f.add(tf);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }

}