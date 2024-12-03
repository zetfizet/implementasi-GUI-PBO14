import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginAction implements ActionListener {
    private LoginWindow loginWindow;

    public LoginAction(LoginWindow loginWindow) {
        this.loginWindow = loginWindow;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = loginWindow.getUsername();
        String password = loginWindow.getPassword();

        // Contoh validasi sederhana
        if (username.equals("admin") && password.equals("1234")) {
            JOptionPane.showMessageDialog(null, "Login Successful!");
            // Tindakan setelah login berhasil
        } else {
            JOptionPane.showMessageDialog(null, "Invalid Username or Password", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
