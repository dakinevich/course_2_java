import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessingGame extends JFrame {
    private JTextField textField;
    private JLabel label;
    private JButton button;
    private int randomNumber;

    public GuessingGame() {
        setTitle("Guessing Game");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        label = new JLabel("Enter a number between 0 and 20:");
        add(label, BorderLayout.NORTH);

        textField = new JTextField();
        add(textField, BorderLayout.CENTER);

        button = new JButton("Guess");
        add(button, BorderLayout.SOUTH);

        randomNumber = (int) (Math.random() * 21); // Generate a random number between 0 and 20

        button.addActionListener(new ActionListener() {
            int attempts = 3;

            @Override
            public void actionPerformed(ActionEvent e) {
                int guess = Integer.parseInt(textField.getText());
                if (guess == randomNumber) {
                    JOptionPane.showMessageDialog(null, "Congratulations! You guessed the number!");
                    System.exit(0);
                } else {
                    attempts--;
                    if (attempts > 0) {
                        if (guess < randomNumber) {
                            JOptionPane.showMessageDialog(null, "Try again. The number is greater than " + guess);
                        } else {
                            JOptionPane.showMessageDialog(null, "Try again. The number is less than " + guess);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Sorry, you've used all your attempts. The number was " + randomNumber);
                        System.exit(0);
                    }
                }
            }
        });
    }


}