package Gym_Management;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class BMR_Calculator extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13;
    JButton  bt1,bt2;
    JTextField tf1,tf2,tf3,tf4,tf5;
    Font f1,f2,f3;
    JPanel p1,p2,p3,p4,p5;
    
    BMR_Calculator()
    {
        super("BMR Calculator");
        setLocation(0,0);
        setSize(1340,490);
        setResizable(false);
        f1=new Font("Lucida Fax",Font.BOLD,25);
        f2=new Font("MS UI Gothic",Font.BOLD,18);
        f3=new Font("Gadugi",Font.BOLD,12);
        
        ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource("Gym_Management/icons/cal.png"));
        Image image1=img1.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
        l1=new JLabel(new ImageIcon(image1));
        
        l2=new JLabel("BMR Calculator");
        l2.setHorizontalAlignment(JLabel.CENTER);
        l3=new JLabel("Enter Your Weight in lbs");
        l4=new JLabel("Enter height in inches");
        l5=new JLabel("Enter age in years");
        
        bt1=new JButton("Male");
        bt2=new JButton("Female");
        
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        
        l6=new JLabel("See Your Result");
        
        l7=new JLabel("Muscle Mass – Aerobic exercise such as running or cycling has no effect on BMR. The more muscle mass in the physical composition of an individual.");
        l8=new JLabel("Age – The more elderly and limber an individual, the lower their BMR, or the lower the minimum caloric intake required to sustain the functioning of their organs at a certain level.");
        l9=new JLabel("Genetics – Hereditary traits passed down from ancestors influence BMR.");
        l10=new JLabel("Weather – Cold environments raise BMR because of the energy required to create a homeostatic body temperature. BMR increases approximately 7% for every increase of 1.36 degrees Fahrenheit in the body's internal temperature.");
        l11=new JLabel("Diet – Small, routinely dispersed meals increase BMR. On the other hand, starvation can reduce BMR by as much as 30%. and brain functions in order to more efficiently utilize what little caloric energy is being used to sustain it.");
        l12=new JLabel("Pregnancy – Ensuring the livelihood of a separate fetus internally increases BMR. This is why pregnant women tend to eat more than usual. Also, menopause can increase or decrease BMR depending on hormonal changes.");
        l13=new JLabel("Supplements – Certain supplements or drugs raise BMR, mostly to fuel weight loss. Caffeine is a common one.");
        
        tf1=new JTextField();
        tf2=new JTextField();
        tf3=new JTextField();
        tf4=new JTextField();
        
        l2.setFont(f1);
        l3.setFont(f2);
        l4.setFont(f2);
        l5.setFont(f2);
        l6.setFont(f2);
        
        l7.setFont(f3);
        l8.setFont(f3);
        l9.setFont(f3);
        l10.setFont(f3);
        l11.setFont(f3);
        l12.setFont(f3);
        l13.setFont(f3);
        
        tf1.setFont(f2);
        tf2.setFont(f2);
        tf3.setFont(f2);
        tf4.setFont(f2);        
        
        bt1.setFont(f2);
        bt2.setFont(f2);
        
        p1=new JPanel();
        p1.setLayout(new GridLayout(1,2,10,10));
        
            p2=new JPanel();
            p2.setLayout(new GridLayout(1,1,10,10));
            
            p2.add(l1);

            p3=new JPanel();
            p3.setLayout(new GridLayout(5,2,10,10));
            
            p3.add(l3);
            p3.add(tf1);
            p3.add(l4);
            p3.add(tf2);
            p3.add(l5);
            p3.add(tf3);
            p3.add(bt1);
            p3.add(bt2);
            p3.add(l6);
            p3.add(tf4);
            
        p1.add(p2);
        p1.add(p3);
        
        p4=new JPanel();
        p4.setLayout(new GridLayout(1,1,10,10));
        
        p4.add(l2);
        
        p5=new JPanel();
        p5.setLayout(new GridLayout(7,1,10,10));
        
        p5.add(l7);
        p5.add(l8);
        p5.add(l9);
        p5.add(l10);
        p5.add(l11);
        p5.add(l12);
        p5.add(l13);
        
        setLayout(new BorderLayout(0,0));
        
        l2.setForeground(Color.YELLOW);
        l3.setForeground(Color.WHITE);
        l4.setForeground(Color.WHITE);
        l5.setForeground(Color.WHITE);
        l6.setForeground(Color.WHITE);
        l7.setForeground(Color.CYAN);
        l8.setForeground(Color.CYAN);
        l9.setForeground(Color.CYAN);
        l10.setForeground(Color.CYAN);
        l11.setForeground(Color.CYAN);
        l12.setForeground(Color.CYAN);
        l13.setForeground(Color.CYAN);
        tf4.setForeground(Color.RED);
        
        bt1.setBackground(Color.BLACK);
        bt2.setBackground(Color.BLACK);
        bt1.setForeground(Color.CYAN);
        bt2.setForeground(Color.CYAN);
        
        p1.setBackground(Color.BLACK);
        p2.setBackground(Color.BLACK);
        p3.setBackground(Color.BLACK);
        p4.setBackground(Color.BLACK);
        p5.setBackground(Color.BLACK);
        
        add(p4,"North");
        add(p1,"Center");
        add(p5,"South");
    }
    public void actionPerformed(ActionEvent e)
    {
        double w=Double.parseDouble(tf1.getText());
        double h=Double.parseDouble(tf2.getText());
        int a=Integer.parseInt(tf3.getText());
        if(e.getSource()==bt1)
        {
            double bmrM=655 + (4.3 * w) + (4.7 * h) - (4.7 * a);
            tf4.setText(" ");
            tf4.setText(bmrM+" "+"Calories/day");
        }
        else if(e.getSource()==bt2)
        {
            double bmrW=66 + (6.3 * w) + (12.9 * h) - (6.8 * a);
            tf4.setText(" ");
            tf4.setText(bmrW+" "+"Calories/day");
        }
    }
    public static void main(String args[])
    {
        new BMR_Calculator().setVisible(true);
    }
}
