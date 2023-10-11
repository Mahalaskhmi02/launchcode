import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PasswordShowHideApp {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Password Show/Hide Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPasswordField passwordField = new JPasswordField(20);
        passwordField.setEchoChar('*'); // Set the echo character to hide the password

        
        JButton showHideButton = new JButton("Show Password");
        showHideButton.addActionListener(new ActionListener() {
            boolean isPasswordVisible = false;

            @Override
            public void actionPerformed(ActionEvent e) {
                isPasswordVisible = !isPasswordVisible;
                if (isPasswordVisible) {
                    passwordField.setEchoChar((char) 0); // Show the password
                    showHideButton.setText("Hide Password");
                } else {
                    passwordField.setEchoChar('*'); // Hide the password
                    showHideButton.setText("Show Password");
                }
            }
        });

        
        JPanel panel = new JPanel();
        panel.add(passwordField);
        panel.add(showHideButton);

        
        frame.add(panel);

        frame.pack();
        frame.setVisible(true);
    }
}
