package travel.management.system;

import javax.swing.*;
import javax.swing.text.html.HTMLEditorKit;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;
import javax.swing.text.html.HTMLEditorKit;


public class Paytm extends JFrame implements ActionListener {
    
    Paytm(){
        setBounds(500, 100, 800, 600);
        
        JEditorPane pane = new JEditorPane();
        pane.setEditable(false);
        pane.setContentType("text/html");
        pane.setEditorKit(new HTMLEditorKit());

        // Enable JavaScript
        pane.getDocument().putProperty("com.sun.javafx.webkit.WebSettings.JAVASCRIPT_ENABLED", true);

        // Load URL
        try {
            URL url = new URL("https://razorpay.com/"); // Replace with your URL
            pane.setPage(url);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
      
        
        JScrollPane sp = new JScrollPane(pane);
        getContentPane().add(sp);
        
        JButton back = new JButton("Back");
        back.setBounds(610, 20, 80, 40);
        back.addActionListener(this);
        pane.add(back);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Payment();
    }
    
    public static void main(String[] args) {
        new Paytm();
    }
}