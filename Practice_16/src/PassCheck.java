import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PassCheck extends JFrame implements ActionListener {
    private JLabel loginLabel;
    private JLabel passwordLabel;
    private JLabel serviceLabel;
    private JTextField serviceField;
    private JTextField loginField;
    private JPasswordField passwordField;
    private JButton checkButton;

    public PassCheck() {
        setTitle("Password Checker");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLayout(new GridLayout(3, 2));

        serviceLabel = new JLabel("Enter your service: ");
        loginLabel = new JLabel("Enter your login: ");
        passwordLabel = new JLabel("Enter your password: ");
        serviceField = new JTextField(20);
        passwordField = new JPasswordField(20);
        loginField = new JTextField(20);

        checkButton = new JButton("Check");

        add(loginLabel);
        add(loginField);
        add(passwordLabel);
        add(passwordField);
        add(new JLabel()); // Пустая ячейка для компановки
        add(checkButton);

        checkButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == checkButton) {
            String login = loginField.getText();
            char[] inputPassword = passwordField.getPassword();
            String password = new String(inputPassword);

            if (login.equals("user123") && password.equals("password123")) {
                JOptionPane.showMessageDialog(this, "Login and password are correct!");
            } else {
                JOptionPane.showMessageDialog(this, "Incorrect login or password. Please try again.");
            }
        }
    }

}


