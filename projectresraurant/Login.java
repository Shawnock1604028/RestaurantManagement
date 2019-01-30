
package RestaurantManagement.projectresraurant;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class Login extends JFrame {
    JFrame frame;
    public Login(){
        frame = new JFrame("Login Menu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(760,340,400, 400);

        JLabel loginL = new JLabel("Login to your account");
        loginL.setBounds(65, 30, 250, 80);
        Font f = new Font("Georgia", 1, 20);
        loginL.setFont(f);
        loginL.setHorizontalAlignment(SwingConstants.CENTER);
        frame.add(loginL);

        f = new Font("Georgia", 1, 18);

        JLabel userL = new JLabel("Username");
        userL.setFont(f);
        userL.setBounds(35, 150, 100, 30);
        frame.add(userL);

        JTextField userF = new JTextField();
        userF.setBounds(140, 150, 175, 30);
        frame.add(userF);

        JLabel passL = new JLabel("Password");
        passL.setFont(f);
        passL.setBounds(35, 200, 100, 30);
        frame.add(passL);

        JTextField passF = new JTextField();
        passF.setBounds(140, 200, 175, 30);
        frame.add(passF);

        JButton loginBtn = new JButton("Login");
        loginBtn.setBounds(105, 260, 175, 30);
        loginBtn.addActionListener((e) -> {
            String usr = userF.getText(), pass = passF.getText();
            if(!usr.equals("") && !pass.equals("")){
                VerifyLogin(usr, pass);
            }
            else{
                JOptionPane.showMessageDialog(null, "Username and password fields cannot be empty!", "Empty fields!", JOptionPane.DEFAULT_OPTION);
            }
        });
        frame.add(loginBtn);


        JButton registerBtn = new JButton("Sign up");
        registerBtn.setBounds(105, 300, 175, 30);
        registerBtn.addActionListener((e) -> {
            frame.dispose();
            new Register();
        });
        frame.add(registerBtn);

        frame.setLayout(null);
        frame.setVisible(true);

    }

    boolean VerifyLogin(String username, String password){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant_management","root","");
            if(!con.equals(null))
                System.out.println("Connected to database");
            PreparedStatement stmt = con.prepareStatement("SELECT * from users WHERE username = ? AND password = ?");
            stmt.setString(1, username);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                System.out.println("Logged in!");
                Main.loggedIn = true;
                Main.username = username;
                frame.dispose();
                JOptionPane.showConfirmDialog(null, "Login successful", "Logged in", JOptionPane.DEFAULT_OPTION);
                con.close();
                new ProjectRestaurant().setVisible(true);
                return true;
            }
            JOptionPane.showMessageDialog(null, "Invalid credentials, please try again.", "Login failed",
            JOptionPane.OK_OPTION);
            con.close();
            return false;
        }
        catch(Exception e){
            System.out.println("Baaler error: " + e);
            return false;
        }
    }
}
