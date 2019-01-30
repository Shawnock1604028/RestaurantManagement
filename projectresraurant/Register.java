
package RestaurantManagement.projectresraurant;


import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class Register extends JFrame {
    JFrame frame;
    public Register(){
        frame = new JFrame("Register");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(760,340,400, 400);

        JLabel regL = new JLabel("Create your new account");
        regL.setBounds(55, 30, 280, 80);
        Font f = new Font("Georgia", 1, 20);
        regL.setFont(f);
        regL.setHorizontalAlignment(SwingConstants.CENTER);
        frame.add(regL);

        f = new Font("Georgia", 1, 14);
        JLabel userL = new JLabel("Username");
        userL.setFont(f);
        userL.setBounds(20, 150, 140, 30);
        frame.add(userL);

        JTextField userF = new JTextField();
        userF.setBounds(170, 150, 175, 30);
        frame.add(userF);

        JLabel passL = new JLabel("Password");
        passL.setFont(f);
        passL.setBounds(20, 200, 140, 30);
        frame.add(passL);

        JTextField passF = new JTextField();
        passF.setBounds(170, 200, 175, 30);
        frame.add(passF);

        JLabel cpassL = new JLabel("Confirm password");
        cpassL.setFont(f);
        cpassL.setBounds(20, 250, 140, 30);
        frame.add(cpassL);

        JTextField cpassF = new JTextField();
        cpassF.setBounds(170, 250, 175, 30);
        frame.add(cpassF);

        JButton registerBtn = new JButton("Sign up");
        registerBtn.setBounds(105, 300, 175, 30);
        registerBtn.addActionListener((e) -> {
            String username = userF.getText(), pass = passF.getText(), cpass = cpassF.getText();
            if(username.equals("") || pass.equals("") || cpass.equals("")){
                JOptionPane.showMessageDialog(null, "Fields cannot be empty!", "Empty fields!",
                        JOptionPane.WARNING_MESSAGE);
            }
            else {
                System.out.print(pass + " : " + cpass);
                if (pass.equals(cpass) && Signup(username, pass)) {
                    JOptionPane.showMessageDialog(null, "Account has been created successfully!", "Account Created",
                            JOptionPane.DEFAULT_OPTION);
                    frame.dispose();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Password fields do not match!", "Error",
                            JOptionPane.DEFAULT_OPTION);
                }
            }
        });
        frame.add(registerBtn);

        frame.setLayout(null);
        frame.setVisible(true);
    }

    boolean Signup(String username, String pass){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant_management","root","");
            if(!con.equals(null))
                System.out.println("Connected to database");
            PreparedStatement stmt = con.prepareStatement("SELECT * from users WHERE username = ?");
            stmt.setString(1, username);
            ResultSet rs = stmt.executeQuery();

            if(rs.next()){
                System.out.println("Duplicate found!");
                JOptionPane.showConfirmDialog(null, "Username already taken. Please choose another username",
                        "Username Taken",
                        JOptionPane.DEFAULT_OPTION);
                con.close();
                return false;
            }

            PreparedStatement stmt2 = con.prepareStatement("INSERT INTO users(username,password,customer) VALUES(?,?," +
                    "?" +
                    ")");
            stmt2.setString(1, username);
            stmt2.setString(2, pass);
            stmt2.setInt(3, 0);
            stmt2.executeUpdate();
            JOptionPane.showConfirmDialog(null, "Account created with username: " + username, "Account created",
                    JOptionPane.OK_OPTION);
            con.close();
            frame.dispose();
            new Login();
            return true;
        }
        catch(Exception e){
            //System.out.println(": " + e);
            return false;
        }
    }
}
