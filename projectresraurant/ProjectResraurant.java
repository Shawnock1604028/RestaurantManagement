package projectresraurant;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Shawnock Guha Paul.
 * ID: 1604028.
 */
public class ProjectResraurant extends JFrame{
    
    private final Container c;
            JButton order;
            Font font;
            JLabel  backgroundimage, header;
            ImageIcon img;
                       
    ProjectResraurant(){
        
        c = this.getContentPane();
        c.setLayout(null);
        
        this.setBounds(0, 5, 1370, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        img = new ImageIcon(getClass().getResource("Homepage.jpg"));
        backgroundimage = new JLabel("", img, JLabel.CENTER);
        backgroundimage.setBounds(0, 0, 1370, 700);
        c.add(backgroundimage);

        font = new Font("Arial", Font.BOLD, 44);
        header = new JLabel("Restaurant Management System");
        header.setBounds(375, 150, 800, 50);
        header.setFont(font);
        header.setForeground(Color.YELLOW);
        header.setBackground(Color.RED);
        backgroundimage.add(header);

        font = new Font("Arial", Font.BOLD, 36);
        order = new JButton("Order");
        order.setBounds(600, 550, 200, 50);
        order.setForeground(Color.CYAN);
        order.setFont(font);
        c.add(order);
        
        order.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e){
                
                dispose();
                OrderMenu frame = new OrderMenu();
                frame.setVisible(true);
                
            }
        
        });
    }
              
    public static void main(String[] args){
     
            ProjectResraurant frame = new ProjectResraurant();
            frame.setTitle("restaurant Management System");
            frame.setVisible(true);
        
    }
    
}
