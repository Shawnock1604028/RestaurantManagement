package RestaurantManagement.projectresraurant;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Shawnock Guha Paul.
 * ID: 1604028.
 * @author  Sheikh Sowmen Rahman
 * ID: 1604005
 */
public class OrderMenu extends JFrame{
    private Container c;
            int X = 0;
            int  i1, i2, i3, i4, i5, i6, i7, i8, i9, i10;
            JLabel header, footer, text,text1, text2,text3,text4,text5,text6,text7,text8,text9,text10, textTotal;
            JCheckBox item1,item2,item3,item4,item5, itemD1, itemD2, itemD3, itemD4, itemD5;
            JTextField quantity1, quantity2, quantity3, quantity4, quantity5, quantity6, quantity7, quantity8,
                    quantity9, quantity10 ;
            Font font;
            String items[] = {"Burger            ----  149 Taka. ", "Chese Pizza    ----  499 Taka.",
            "Pasta              ----    99 Taka.", "Noodles          ----    49 Taka.", "Hot Dog          "
            + "----  169 Taka."}; 
            int itemsPrice[] = {149, 499, 99, 49, 169};
            String itemsd[] ={"Lemon Juice   ----   25 Taka. ", "Mango Juice   ----   70 Taka.",
            "Strawberry      ---- 149 Taka.", "Lacchi            ----   89 Taka.", "Soft Drinks     "
            +"----   20 Taka."};
            int itemsdPrice[] = {25, 70, 149, 89, 20};
            JTextArea textarea; 
            JButton submit, print1, clear, print2;
            String s1 = "", s2 = "", s3 = "", s4 = "", s5 = "", s6 = "", s7 = "", s8 = "", s9 = "", s10 = "";
            
    OrderMenu(){
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.yellow);
        
        Handler handle = new Handler();
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(10, 10, 1300, 700);
        this.setResizable(false);
        
        font = new Font("Tempus Sans ITC", Font.BOLD, 40);
        header = new JLabel("Foods Available   Quantity");
        header.setFont(font);
        header.setForeground(Color.MAGENTA);
        header.setBounds(30, 10, 500, 50 );
        c.add(header);
        
        font = new Font("Tempus Sans ITC", Font.BOLD, 18);
        item1 = new JCheckBox(items[0]);
        item1.setBounds(30, 70 + (0 * 40), 300, 35);
        item1.setFont(font);
        item1.setForeground(Color.blue);
        item1.addActionListener(handle);
        c.add(item1);

        item2 = new JCheckBox(items[1]);
        item2.setBounds(30, 70 + (1 * 40), 300, 35);
        item2.setFont(font);
        item2.setForeground(Color.blue);
        item2.addActionListener(handle);
        c.add(item2);

        item3 = new JCheckBox(items[2]);
        item3.setBounds(30, 70 + (2 * 40), 300, 35);
        item3.setFont(font);
        item3.setForeground(Color.blue);
        item3.addActionListener(handle);
        c.add(item3);

        item4 = new JCheckBox(items[3]);
        item4.setBounds(30, 70 + (3 * 40), 300, 35);
        item4.setFont(font);
        item4.setForeground(Color.blue);
        item4.addActionListener(handle);
        c.add(item4);

        item5 = new JCheckBox(items[4]);
        item5.setBounds(30, 70 + (4 * 40), 300, 35);
        item5.setFont(font);
        item5.setForeground(Color.blue);
        item5.addActionListener(handle);
        c.add(item5);
        
        
        quantity1 = new JTextField("0");
        quantity1.setBounds(360, 70 + (0 * 40), 150, 35);
        quantity1.setFont(font);
        quantity1.setHorizontalAlignment(JTextField.TRAILING);
        quantity1.setForeground(Color.BLUE);
        c.add(quantity1);

        quantity2 = new JTextField("0");
        quantity2.setBounds(360, 70 + (1 * 40), 150, 35);
        quantity2.setFont(font);
        quantity2.setHorizontalAlignment(JTextField.TRAILING);
        quantity2.setForeground(Color.BLUE);
        c.add(quantity2);
        
        quantity3 = new JTextField("0");
        quantity3.setBounds(360, 70 + (2 * 40), 150, 35);
        quantity3.setFont(font);
        quantity3.setHorizontalAlignment(JTextField.TRAILING);
        quantity3.setForeground(Color.BLUE);
        c.add(quantity3);

        quantity4 = new JTextField("0");
        quantity4.setBounds(360, 70 + (3 * 40), 150, 35);
        quantity4.setFont(font);
        quantity4.setHorizontalAlignment(JTextField.TRAILING);
        quantity4.setForeground(Color.BLUE);
        c.add(quantity4);

        quantity5 = new JTextField("0");
        quantity5.setBounds(360, 70 + (4 * 40), 150, 35);
        quantity5.setFont(font);
        quantity5.setHorizontalAlignment(JTextField.TRAILING);
        quantity5.setForeground(Color.BLUE);
        c.add(quantity5);
            
            
        font = new Font("Tempus Sans ITCl", Font.BOLD, 40);
        header = new JLabel("Drinks Available  Quantity");
        header.setFont(font);
        header.setForeground(Color.BLUE);
        header.setBounds(30, 280, 500, 50 );
        c.add(header);
        
        font = new Font("Tempus Sans ITC", Font.BOLD, 18);
        
        itemD1 = new JCheckBox(itemsd[0]);
        itemD1.setBounds(30, 340 + (0 * 40), 300, 35);
        itemD1.setFont(font);
        itemD1.setForeground(Color.MAGENTA);
        itemD1.addActionListener(handle);
        c.add(itemD1);
        
        itemD2 = new JCheckBox(itemsd[1]);
        itemD2.setBounds(30, 340 + (1 * 40), 300, 35);
        itemD2.setFont(font);
        itemD2.setForeground(Color.MAGENTA);
        itemD2.addActionListener(handle);
        c.add(itemD2);
        
        itemD3 = new JCheckBox(itemsd[2]);
        itemD3.setBounds(30, 340 + (2 * 40), 300, 35);
        itemD3.setFont(font);
        itemD3.setForeground(Color.MAGENTA);
        itemD3.addActionListener(handle);
        c.add(itemD3);
        
        itemD4 = new JCheckBox(itemsd[3]);
        itemD4.setBounds(30, 340 + (3 * 40), 300, 35);
        itemD4.setFont(font);
        itemD4.setForeground(Color.MAGENTA);
        itemD4.addActionListener(handle);
        c.add(itemD4);
        
        itemD5 = new JCheckBox(itemsd[4]);
        itemD5.setBounds(30, 340 + (4 * 40), 300, 35);
        itemD5.setFont(font);
        itemD5.setForeground(Color.MAGENTA);
        itemD5.addActionListener(handle);
        c.add(itemD5);
        
        quantity6 = new JTextField("0");
        quantity6.setBounds(360, 340 + (0 * 40), 150, 35);
        quantity6.setFont(font);
        quantity6.setHorizontalAlignment(JTextField.TRAILING);
        quantity6.setForeground(Color.MAGENTA);
        c.add(quantity6);
        
        quantity7 = new JTextField("0");
        quantity7.setBounds(360, 340 + (1 * 40), 150, 35);
        quantity7.setFont(font);
        quantity7.setHorizontalAlignment(JTextField.TRAILING);
        quantity7.setForeground(Color.MAGENTA);
        c.add(quantity7);
        
        quantity8 = new JTextField("0");
        quantity8.setBounds(360, 340 + (2 * 40), 150, 35);
        quantity8.setFont(font);
        quantity8.setHorizontalAlignment(JTextField.TRAILING);
        quantity8.setForeground(Color.MAGENTA);
        c.add(quantity8);
        
        quantity9 = new JTextField("0");
        quantity9.setBounds(360, 340 + (3 * 40), 150, 35);
        quantity9.setFont(font);
        quantity9.setHorizontalAlignment(JTextField.TRAILING);
        quantity9.setForeground(Color.MAGENTA);
        c.add(quantity9);
        
        quantity10 = new JTextField("0");
        quantity10.setBounds(360, 340 + (4 * 40), 150, 35);
        quantity10.setFont(font);
        quantity10.setHorizontalAlignment(JTextField.TRAILING);
        quantity10.setForeground(Color.MAGENTA);
        c.add(quantity10);
        
        font = new Font("Tempus Sans ITC", Font.BOLD, 40);
        header = new JLabel("Script");
        header.setFont(font);
        header.setBounds(750, 10, 200, 50);
        header.setForeground(Color.red);
        c.add(header);
        
        textarea = new JTextArea("Foods                    Price");
        textarea.setFont(font);
        textarea.setBounds(550, 70, 500, 550);
        textarea.setBackground(Color.CYAN);
        textarea.setForeground(Color.GREEN);
        textarea.setFont(font);
        textarea.setEditable(false);
        textarea.setLineWrap(true);
        textarea.setWrapStyleWord(true);
        c.add(textarea);
        
        font = new Font("Tempus Sans ITC", Font.BOLD, 20);

        text1 = new JLabel();
        text1.setText(items[0] + "               "+ itemsPrice[0] + " X ");
        text1.setBounds(0, 100 + (0 * 35), 500, 30);
        text1.setBackground(Color.BLUE);
        text1.setForeground(Color.blue);
        text1.setFont(font);
        textarea.add(text1);

        text2 = new JLabel();
        text2.setText(items[1] + "               "+ itemsPrice[1] + " X ");
        text2.setBounds(0, 100 + (1 * 35), 500, 30);
        text2.setBackground(Color.BLUE);
        text2.setForeground(Color.blue);
        text2.setFont(font);
        textarea.add(text2);

        text3 = new JLabel();
        text3.setText(items[2] + "               "+ itemsPrice[2] + " X ");
        text3.setBounds(0, 100 + (2 * 35), 500, 30);
        text3.setBackground(Color.BLUE);
        text3.setForeground(Color.blue);
        text3.setFont(font);
        textarea.add(text3);

        text4 = new JLabel();
        text4.setText(items[3] + "               "+ itemsPrice[3] + " X ");
        text4.setBounds(0, 100 + (3 * 35), 500, 30);
        text4.setBackground(Color.BLUE);
        text4.setForeground(Color.blue);
        text4.setFont(font);
        textarea.add(text4);

        text5 = new JLabel();
        text5.setText(items[4] + "               "+ itemsPrice[4] + " X ");
        text5.setBounds(0, 100 + (4 * 35), 500, 30);
        text5.setBackground(Color.BLUE);
        text5.setForeground(Color.blue);
        text5.setFont(font);
        textarea.add(text5);


        text6 = new JLabel();
        text6.setText(itemsd[0] + "                "+ itemsdPrice[0] + " X ");
        text6.setBounds(0, 275 + (0 * 35), 500, 30);
        text6.setBackground(Color.BLUE);
        text6.setForeground(Color.magenta);
        text6.setFont(font);
        textarea.add(text6);

        text7 = new JLabel();
        text7.setText(itemsd[1] + "                "+ itemsdPrice[1] + " X ");
        text7.setBounds(0, 275 + (1 * 35), 500, 30);
        text7.setBackground(Color.BLUE);
        text7.setForeground(Color.magenta);
        text7.setFont(font);
        textarea.add(text7);

        text8 = new JLabel();
        text8.setText(itemsd[2] + "                "+ itemsdPrice[2] + " X ");
        text8.setBounds(0, 275 + (2 * 35), 500, 30);
        text8.setBackground(Color.BLUE);
        text8.setForeground(Color.magenta);
        text8.setFont(font);
        textarea.add(text8);

        text9 = new JLabel();
        text9.setText(itemsd[3] + "                "+ itemsdPrice[3] + " X ");
        text9.setBounds(0, 275 + (3 * 35), 500, 30);
        text9.setBackground(Color.BLUE);
        text9.setForeground(Color.magenta);
        text9.setFont(font);
        textarea.add(text9);

        text10 = new JLabel();
        text10.setText(itemsd[4] + "                "+ itemsdPrice[4] + " X ");
        text10.setBounds(0, 275 + (4 * 35), 500, 30);
        text10.setBackground(Color.BLUE);
        text10.setForeground(Color.magenta);
        text10.setFont(font);
        textarea.add(text10);

        font = new Font("Arial", Font.BOLD, 40);
        textTotal = new JLabel();
        textTotal.setText("00.00");
        textTotal.setBounds(350, 470, 500, 30);
        textTotal.setBackground(Color.BLUE);
        textTotal.setForeground(Color.magenta);
        textTotal.setFont(font);
        textarea.add(textTotal);

        
        font = new Font("Tempus Sans ITC", Font.BOLD, 50);
        
        text = new JLabel("Total");
        text.setBounds(100, 460, 150, 40);
        text.setFont(font);
        text.setForeground(Color.RED);
        textarea.add(text);
        
        submit = new JButton("Bill");
        submit.setBounds(30, 550, 250, 100);
        submit.setFont(font);
        submit.setForeground(Color.BLUE);
        submit.setBackground(Color.DARK_GRAY);
        c.add(submit);
        
        clear = new JButton("Clear");
        clear.setBounds(290, 550, 250, 100);
        clear.setFont(font);
        clear.setForeground(Color.BLUE);
        clear.setBackground(Color.DARK_GRAY);
        c.add(clear);
        
        submit.addActionListener(new ActionListener(){ 
            public void actionPerformed(ActionEvent e){
              String s = Integer.toString(X);
//               textTotal.setText(s + ".00");
                
            dispose();
            
            JFrame jf = new JFrame("Print Option");
            jf.setVisible(true);
            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jf.setBounds(10, 10, 600, 700);
            c = jf.getContentPane();
            c.setLayout(null);
            c.setBackground(Color.BLUE);
            
            textarea = new JTextArea("----------------------------Receipt-------------------------\n\n");
            font = new Font("Arial", Font.BOLD, 36);
            textarea.setFont(font);
            c.add(textarea);
            textarea.setBounds(50, 50, 500, 500);
            textarea.setBackground(Color.GREEN);
            
            print1 = new JButton("Bill");
            print1.setBounds(50, 570, 200, 50);
            c.add(print1);
            print1.setFont(font);
            
            print2 = new JButton("Print");
            print2.setBounds(300, 570, 200, 50);
            print2.setFont(font);
            c.add(print2);
            
                print1.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        font = new Font("Arial", Font.BOLD, 16);
                        textarea.setFont(font);
                        
                        if(s1 != ""){
                        textarea.append("\n " + s1);
                        }
                        if(s2 != ""){
                        textarea.append("\n " + s2);
                        }
                        if(s3 != ""){
                        textarea.append("\n " + s3);
                        }
                        if(s4 != ""){
                        textarea.append("\n " + s4);
                        }
                        if(s5 != ""){
                        textarea.append("\n " + s5);
                        }
                        if(s6 != ""){
                        textarea.append("\n " + s6);
                        }
                        if(s7 != ""){
                        textarea.append("\n " + s7);
                        }
                        if(s8 != ""){
                        textarea.append("\n " + s8);
                        }
                        if(s9 != ""){
                        textarea.append("\n " + s9);
                        }
                        if(s10 != ""){
                        textarea.append("\n " + s10);
                        }
                        textarea.append("\n------------------------------------------------------------\n"
                                + "-------------------------------------------------------------"
                                + "\n                                -------------------- Total Bill = " + s);
                        
                    }
                });
                
            print2.addActionListener(new ActionListener(){ 
            public void actionPerformed(ActionEvent e){
                        try{
                            boolean sh = textarea.print();
                            if(sh){
                                JOptionPane.showMessageDialog(null, "Done printing", "Information", JOptionPane.INFORMATION_MESSAGE);
                            }
                            else{
                                JOptionPane.showMessageDialog(null, "Printing!", "Error", JOptionPane.ERROR_MESSAGE); 
                            }
                        }
                        catch(PrinterException q){
                            JOptionPane.showMessageDialog(null, q);
                        }
            }
            });
            }
        });
        
        

        
        clear.addActionListener(new ActionListener(){ 
            public void actionPerformed(ActionEvent e){
                
                X = 0;
                textTotal.setText("00.00");
                text1.setText(items[0] + "               "+ itemsPrice[0] + " X ");          
                text2.setText(items[1] + "               "+ itemsPrice[1] + " X ");       
                text3.setText(items[2] + "               "+ itemsPrice[2] + " X "); 
                text4.setText(items[3] + "               "+ itemsPrice[3] + " X ");
                text5.setText(items[4] + "               "+ itemsPrice[4] + " X ");
                text6.setText(itemsd[0] + "                "+ itemsdPrice[0] + " X ");
                text7.setText(itemsd[1] + "                "+ itemsdPrice[1] + " X ");
                text8.setText(itemsd[2] + "                "+ itemsdPrice[2] + " X ");
                text9.setText(itemsd[3] + "                "+ itemsdPrice[3] + " X ");
                text10.setText(itemsd[4] + "                "+ itemsdPrice[4] + " X ");
                
//                item1.setSelected(false);
//                item2.setSelected(false);
//                item3.setSelected(false);
//                item4.setSelected(false);
//                item5.setSelected(false);
//                itemD1.setSelected(false);
//                itemD2.setSelected(false);
//                itemD3.setSelected(false);
//                itemD4.setSelected(false);
//                itemD5.setSelected(false);
//                i1 = 0; i2 = 0; i3 = 0; i4 = 0; i5 = 0; i6 = 0; i7 = 0; i7 = 0; i8 = 0; i9 = 0; i10 = 0;
            }
        });
    }
    
     class Handler implements ActionListener{
    
        public void actionPerformed(ActionEvent e){
            
            if(e.getActionCommand() == items[0]){
                int x = Integer.parseInt(quantity1.getText());
                s1 = "";
                if(i1%2 == 0){
                    s1 = items[0] + "       "+ itemsPrice[0] + " X " + x + " = " + itemsPrice[0] * x;
                    X = X + itemsPrice[0] * x;
                    text1.setText(items[0] + "       "+ itemsPrice[0] + " X " + x + " = " + itemsPrice[0] * x);
                }
                else if(i1%2 == 1){
                    s1 = "";
                    X = X - itemsPrice[0] * x;
                   // x = 0;
                    text1.setText(items[0] + "       "+ itemsPrice[0] + " X 0 = " + itemsPrice[0] * 0);
                }
                i1++; 
            }
            
            else if(e.getActionCommand() == items[1]){
                int x = Integer.parseInt(quantity2.getText());
                s2 = "";
                if(i2%2 == 0){
                    s2 = items[1] + "       "+ itemsPrice[1] + " X " + x + " = " + itemsPrice[1] * x;
                    X = X + itemsPrice[1] * x;
                    text2.setText(items[1] + "       "+ itemsPrice[1] + " X " + x + " = " + itemsPrice[1] * x);
                }
                else if(i2%2 == 1){
                    s2 = "";
                    X = X - itemsPrice[1] * x;
                    x = 0;
                    text2.setText(items[1] + "       "+ itemsPrice[1] + " X 0 = " + itemsPrice[1] * 0);
                }
                i2++; 

            }
            
            else if(e.getActionCommand() == items[2]){
                int x = Integer.parseInt(quantity3.getText());
                s3 = "";
                if(i3%2 == 0){
                    s3 = items[2] + "       "+ itemsPrice[2] + " X " + x + " = " + itemsPrice[2] * x;
                    X = X + itemsPrice[2] * x;
                    text3.setText(items[2] + "       "+ itemsPrice[2] + " X " + x + " = " + itemsPrice[2] * x);
                }
                else if(i3%2 == 1){
                    s3 = "";
                    X = X - itemsPrice[2] * x;
                   // x = 0;
                    text3.setText(items[2] + "       "+ itemsPrice[2] + " X 0 = " + itemsPrice[2] * 0);
                }
                i3++; 

            }
            
            else if(e.getActionCommand() == items[3]){
                int x = Integer.parseInt(quantity4.getText());
                s4 = "";
               if(i4%2 == 0){
                   s4 = items[3] + "       "+ itemsPrice[3] + " X " + x + " = " + itemsPrice[3] * x;
                    X = X + itemsPrice[3] * x;
                    text4.setText(items[3] + "       "+ itemsPrice[3] + " X " + x + " = " + itemsPrice[3] * x);
                }
                else if(i4%2 == 1){
                    s4 = "";
                    X = X - itemsPrice[3] * x;
                   // x = 0;
                    text4.setText(items[3] + "       "+ itemsPrice[3] + " X 0 = " + itemsPrice[3] * 0);
                }
                i4++; 

            }
            
            else if(e.getActionCommand() == items[4]){
                int x = Integer.parseInt(quantity5.getText());
                s5 = "";
                if(i5%2 == 0){
                    s5 = items[4] + "       "+ itemsPrice[4] + " X " + x + " = " + itemsPrice[4] * x;
                    X = X + itemsPrice[4] * x;
                    text5.setText(items[4] + "       "+ itemsPrice[4] + " X " + x + " = " + itemsPrice[4] * x);
                }
                else if(i5%2 == 1){
                    s5 = "";
                    X = X - itemsPrice[4] * x;
                   // x = 0;
                    text5.setText(items[4] + "       "+ itemsPrice[4] + " X 0 = " + itemsPrice[4] * 0);
                }
                i5++; 

            }
            
            else if(e.getActionCommand() == itemsd[0]){
                int x = Integer.parseInt(quantity6.getText());
                s6 = "";
                if(i6%2 == 0){
                    s6 = itemsd[0] + "       "+ itemsdPrice[0] + " X " + x + " = " + itemsdPrice[0] * x;
                    X = X + itemsdPrice[0] * x;
                    text6.setText(itemsd[0] + "       "+ itemsdPrice[0] + " X " + x + " = " + itemsdPrice[0] * x);
                }
                else if(i1%2 == 1){
                    s6 = "";
                    X = X - itemsdPrice[0] * x;
                   // x = 0;
                    text6.setText(itemsd[0] + "       "+ itemsdPrice[0] + " X 0 = " + itemsdPrice[0] * 0);
                }
                i6++; 

            }
            
            else if(e.getActionCommand() == itemsd[1]){
                int x = Integer.parseInt(quantity7.getText());
                s7 = "";
                if(i7%2 == 0){
                    s7 = itemsd[1] + "       "+ itemsdPrice[1] + " X " + x + " = " + itemsdPrice[1] * x;
                    X = X + itemsdPrice[1] * x;
                    text7.setText(itemsd[1] + "       "+ itemsdPrice[1] + " X " + x + " = " + itemsdPrice[1] * x);
                }
                else if(i7%2 == 1){
                    s7 = "";
                    X = X - itemsdPrice[1] * x;
                   // x = 0;
                    text7.setText(itemsd[1] + "       "+ itemsdPrice[1] + " X 0 = " + itemsdPrice[1] * 0);
                }
                i7++; 

            }
            
            else if(e.getActionCommand() == itemsd[2]){
                int x = Integer.parseInt(quantity8.getText());
                s8 = "";
                if(i8%2 == 0){
                                        s8 = itemsd[2] + "       "+ itemsdPrice[2] + " X " + x + " = " + itemsdPrice[2] * x;
                    X = X + itemsdPrice[2] * x;
                    text8.setText(itemsd[2] + "       "+ itemsdPrice[2] + " X " + x + " = " + itemsdPrice[2] * x);
                }
                else if(i8%2 == 1){
                    s8 = "";
                    X = X - itemsdPrice[2] * x;
                   // x = 0;
                    text8.setText(itemsd[2] + "       "+ itemsdPrice[2] + " X 0 = " + itemsdPrice[2] * 0);
                }
                i8++; 

            }
            
            else if(e.getActionCommand() == itemsd[3]){
                int x = Integer.parseInt(quantity9.getText());
                s9 = "";
                if(i9%2 == 0){
                    s9 = itemsd[3] + "       "+ itemsdPrice[3] + " X " + x + " = " + itemsdPrice[3] * x;
                    X = X + itemsdPrice[3] * x;
                    text9.setText(itemsd[3] + "       "+ itemsdPrice[3] + " X " + x + " = " + itemsdPrice[3] * x);
                }
                else if(i1%2 == 1){
                    s9 = "";
                    X = X - itemsdPrice[0] * x;
                   // x = 0;
                    text9.setText(itemsd[3] + "       "+ itemsdPrice[3] + " X 0 = " + itemsdPrice[3] * 0);
                }
                i9++; 

            }
            
            else if(e.getActionCommand() == itemsd[4]){
                int x = Integer.parseInt(quantity10.getText());
                s10 = "";
                if(i10%2 == 0){
                    s10 = itemsd[4] + "       "+ itemsdPrice[4] + " X " + x + " = " + itemsdPrice[4] * x;
                    X = X + itemsdPrice[4] * x;
                    text10.setText(itemsd[4] + "       "+ itemsdPrice[4] + " X " + x + " = " + itemsdPrice[4] * x);
                }
                else if(i1%2 == 1){
                    s10 = "";
                    X = X - itemsdPrice[0] * x;
                   // x = 0;
                    text10.setText(itemsd[4] + "       "+ itemsdPrice[4] + " X 0 = " + itemsdPrice[4] * 0);
                }
                i10++; 
            }      
        }
} 
    public static void main(String args[]){
        OrderMenu frame = new OrderMenu();
        frame.setTitle("Order Menu");
        frame.setVisible(true);     
    }
}
