package Gym_Management;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Gym_Details extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
    JTextField tf1,tf2;
    JButton bt1,bt2;
    Font f1,f2;
    JPanel p1,p2,p3;
    Gym_Details()
    {
        super("Gym Details");
        setSize(1050,600);
        setLocation(50,50);
        setResizable(false);
        f1=new Font("Lucida Fax",Font.BOLD,40);
        f2=new Font("MS UI Gothic",Font.BOLD,18);
        
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("Gym_Management/icons/home2.jpg"));
        Image imag=img.getImage().getScaledInstance(700,500,Image.SCALE_DEFAULT);
        l1=new JLabel(new ImageIcon(imag));
        
        l2=new JLabel("Fitness Point");
        l3=new JLabel("Owner Name : ");
        l4=new JLabel("Address : ");
        l5=new JLabel("Kumar Tanay");
        l6=new JLabel("Ghaziabad, India");
        bt1=new JButton("See All Facelity");
        bt2=new JButton("Cancle");
        l2.setHorizontalAlignment(JLabel.CENTER);
        
        l3.setHorizontalAlignment(JLabel.CENTER);
        l4.setHorizontalAlignment(JLabel.CENTER);
        bt1.setBackground(Color.BLACK);
        bt1.setForeground(Color.CYAN);
        bt2.setBackground(Color.BLACK);
        bt2.setForeground(Color.RED);
        l2.setForeground(Color.YELLOW);
        l3.setForeground(Color.GRAY);
        l4.setForeground(Color.GRAY);
        l5.setForeground(Color.GRAY);
        l6.setForeground(Color.GRAY);
        
        bt1.addActionListener(this);
        
        l2.setFont(f1);
        l3.setFont(f2);
        l4.setFont(f2);
        l5.setFont(f2);
        l6.setFont(f2);
        bt1.setFont(f2);
        bt2.setFont(f2);
        
        p1=new JPanel();
        p2=new JPanel();
        p3=new JPanel();
        
        p1.setLayout(new GridLayout(3,2,10,10));
        p1.add(l3);
        p1.add(l5);
        p1.add(l4);
        p1.add(l6);
        p1.add(bt1);
        p1.add(bt2);
        
        p2.setLayout(new GridLayout(1,1,10,10));
        p2.add(l2);
        
        p3.setLayout(new GridLayout(1,1,10,10));
        p3.add(l1);
        
        p1.setBackground(Color.BLACK);
        p2.setBackground(Color.BLACK);
        p3.setBackground(Color.BLACK);
        
        setLayout(new BorderLayout(0,0));
        add(p2,"North");
        add(p3,"Center");
        add(p1,"South");
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==bt1)
        {
            new Gym_Gagets().setVisible(true);
            this.setVisible(false);
        }
    }
    public static void main(String args[])
    {
        new Gym_Details().setVisible(true);
    }
}
