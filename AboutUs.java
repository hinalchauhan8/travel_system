package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AboutUs extends JFrame implements ActionListener{
   
    AboutUs() {
        setBounds(600, 100, 500, 550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel l1 = new JLabel("ABOUT US");
        l1.setBounds(200, 10, 100, 40);
        l1.setForeground(Color.red);
        l1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(l1);
        
        String s =  "About Us          \n  "
               + "\nAt Gujju Travel, we are passionate about helping people explore the world. Our mission is to make travel accessible and enjoyable for everyone. Our team is made up of passionate travelers who have a wealth of knowledge and experience in the travel industry. From our expert travel advisors to our friendly customer service team, we are all committed to making your travel experience unforgettable.  Thanks for Joining Our Adventure Family. We're thrilled you've chosen Gujju Travellers for your upcoming adventure!   "; 
         
                       
                
                
                

        
        TextArea area = new TextArea(s, 10, 40, Scrollbar.VERTICAL);
        area.setEditable(false);
        area.setBounds(20, 100, 450, 300);
        add(area);
        
        JButton back = new JButton("Back");
        back.setBounds(200, 420, 100, 25);
        back.addActionListener(this);
        add(back);
        
        setVisible(true);
     }
    
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
    }
    
    public static void main(String[] args) {
        new AboutUs();
    }
}
