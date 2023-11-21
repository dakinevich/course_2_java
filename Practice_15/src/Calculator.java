import javax.swing.*;
import java.awt.*;

class Calculator extends JFrame {
    private float memNumber = 0;
    private char memAction = ' ';
    JTextField textField = new JTextField(10);

    JButton button0 = new JButton("0");
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton buttonMul = new JButton("*");
    JButton buttonDiv = new JButton("/");
    JButton buttonDot = new JButton(".");
    JButton buttonMinus = new JButton("-");
    JButton buttonPlus = new JButton("+");
    JButton buttonEqual = new JButton("=");

    JTextField t1 = new JTextField("File");
    JTextField t2 = new JTextField("Edit");
    JTextField t3 = new JTextField("Help");

    Font fnt = new Font("Times new roman",Font.BOLD,20);
    Calculator(){
        super("Example");
        textField.setFont(fnt);
        setLayout(new GridLayout(4, 1));

        setSize(250,350);

        Panel task4Panel = new Panel(new FlowLayout());
        task4Panel.add(t1);
        task4Panel.add(t2);
        task4Panel.add(t3);
        add(task4Panel);


        String[] items = {
                "Элемент списка 1",
                "Элемент списка 2",
                "Элемент списка 3"
        };
        JComboBox comboBox = new JComboBox(items);
        add(comboBox);

        add(textField);
        Panel buttonPanel = new Panel(new GridLayout(4, 3));

        buttonPanel.add(button7);
        buttonPanel.add(button8);
        buttonPanel.add(button9);
        buttonPanel.add(buttonDiv);
        buttonPanel.add(button4);
        buttonPanel.add(button5);
        buttonPanel.add(button6);
        buttonPanel.add(buttonMul);
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);
        buttonPanel.add(buttonMinus);
        buttonPanel.add(button0);
        buttonPanel.add(buttonDot);
        buttonPanel.add(buttonPlus);
        buttonPanel.add(buttonEqual);
        add(buttonPanel);

        for (JButton btn: new JButton[]{button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonDot}){
            btn.addActionListener(actionEvent -> {
                textField.setText(textField.getText() + btn.getText());
            });
        }
        for (JButton btn: new JButton[]{buttonPlus, buttonMinus, buttonMul, buttonDiv}){
            btn.addActionListener(actionEvent -> {
                memNumber = Float.parseFloat(textField.getText());
                textField.setText("");
                memAction = btn.getText().charAt(0);
            });
        }

        buttonEqual.addActionListener(actionEvent -> {
            double result = Double.parseDouble(textField.getText());
            switch (memAction){
                case '+':
                    result+=memNumber;
                    break;
                case '-':
                    result = memNumber-result;
                    break;
                case '*':
                    result*=memNumber;
                    break;
                case '/':
                    result = memNumber/result;
                    break;
                default:
                    break;
            }
            textField.setText(String.valueOf(result));
            memAction = ' ';
        });
        setVisible(true);

    }
    public static void main(String[]args){
        new Calculator();
    }
}