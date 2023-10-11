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

        // Create a password field to input the password
        JPasswordField passwordField = new JPasswordField(20);
        passwordField.setEchoChar('*'); // Set the echo character to hide the password

        // Create a button to show/hide the password
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

        // Create a panel to hold the components
        JPanel panel = new JPanel();
        panel.add(passwordField);
        panel.add(showHideButton);

        // Add the panel to the frame
        frame.add(panel);

        frame.pack();
        frame.setVisible(true);
    }
}
