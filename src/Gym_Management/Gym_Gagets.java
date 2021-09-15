package Gym_Management;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Gym_Gagets extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,l25,l26,l27,l28,l29,l30,l31,l32,l33,l34,l35,l36,l37,l38,l39,l40;
    JPanel p1,p2,p3,p4;
    Font f1,f2;
    JButton bt1,bt2;
    
    Gym_Gagets()
    {
        super("Gym Gagets");
        setSize(730,730);
        setLocation(50,0);
        
        f1=new Font("Lucida Fax",Font.BOLD,35);
        f2=new Font("MS UI Gothic",Font.BOLD,16);
        
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("Gym_Management/icons/6.png"));
        Image imag=img.getImage().getScaledInstance(150,200,Image.SCALE_DEFAULT);
        l1=new JLabel(new ImageIcon(imag));
        
        ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource("Gym_Management/icons/m3.png"));
        Image imag1=img1.getImage().getScaledInstance(150,200,Image.SCALE_DEFAULT);
        l2=new JLabel(new ImageIcon(imag1));
        
        ImageIcon img2=new ImageIcon(ClassLoader.getSystemResource("Gym_Management/icons/8.png"));
        Image imag2=img2.getImage().getScaledInstance(150,200,Image.SCALE_DEFAULT);
        l37=new JLabel(new ImageIcon(imag2));
        
        ImageIcon img3=new ImageIcon(ClassLoader.getSystemResource("Gym_Management/icons/7.png"));
        Image imag3=img3.getImage().getScaledInstance(150,200,Image.SCALE_DEFAULT);
        l38=new JLabel(new ImageIcon(imag3));
        
        ImageIcon img4=new ImageIcon(ClassLoader.getSystemResource("Gym_Management/icons/13.png"));
        Image imag4=img4.getImage().getScaledInstance(150,200,Image.SCALE_DEFAULT);
        l39=new JLabel(new ImageIcon(imag4));
        
        ImageIcon img5=new ImageIcon(ClassLoader.getSystemResource("Gym_Management/icons/m4.png"));
        Image imag5=img5.getImage().getScaledInstance(150,200,Image.SCALE_DEFAULT);
        l40=new JLabel(new ImageIcon(imag5));
        
        l3=new JLabel("GYM GAGETS DETAILS");
        l3.setHorizontalAlignment(JLabel.CENTER);
        
        l4=new JLabel("Dumbells : ");
        l5=new JLabel("Rope : ");
        l6=new JLabel("Balls : ");
        l7=new JLabel("Chest press : ");
        l8=new JLabel("Incline chest press : ");
        l9=new JLabel("Decline Chest Press : ");
        l10=new JLabel("Big Barbel rod : ");
        l11=new JLabel("Zik-Zak rod : ");
        l12=new JLabel("Small Barbel rod : ");
        l13=new JLabel("Solder Press Meshine : ");
        l14=new JLabel("Leg Press Mashine : ");
        l15=new JLabel("Bentch : ");
        l16=new JLabel("T.V. : ");
        l17=new JLabel("Speeker : ");
        l18=new JLabel("Weight : ");
        l19=new JLabel("All Small Gagets : ");
        
        l20=new JLabel("1 kg to 35 kg (2X3)");
        l21=new JLabel("3 Rop (2 small,1 Big)");
        l22=new JLabel("2 Balls");
        l23=new JLabel("2 Mashine");
        l24=new JLabel("2 Mashine");
        l25=new JLabel("2 Mashine");
        l26=new JLabel("2 Rod");
        l27=new JLabel("5 Rod");
        l28=new JLabel("8 Rod ");
        l29=new JLabel("2 Mashine");
        l30=new JLabel("2 Mashine");
        l31=new JLabel("10 Bentchs");
        l32=new JLabel("1 T.V.");
        l33=new JLabel("10 Speeker");
        l34=new JLabel("1000kg total Plates");
        l35=new JLabel("Presented");
        
        bt1=new JButton("Check Trainer Client");
        bt2=new JButton("Cancel");
        
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        
        bt1.setBackground(Color.BLACK);
        bt1.setForeground(Color.CYAN);
        bt2.setBackground(Color.BLACK);
        bt2.setForeground(Color.RED);

        bt1.setFont(f2);
        bt2.setFont(f2);
        
        l3.setFont(f1);
        l3.setFont(f2);
        l4.setFont(f2);
        l5.setFont(f2);
        l6.setFont(f2);
        l7.setFont(f2);
        l8.setFont(f2);
        l9.setFont(f2);
        l10.setFont(f2);
        l11.setFont(f2);
        l12.setFont(f2);
        l13.setFont(f2);
        l14.setFont(f2);
        l15.setFont(f2);
        l16.setFont(f2);
        l17.setFont(f2);
        l18.setFont(f2);
        l19.setFont(f2);
        
        l20.setFont(f2);
        l21.setFont(f2);
        l22.setFont(f2);
        l23.setFont(f2);
        l24.setFont(f2);
        l25.setFont(f2);
        l26.setFont(f2);
        l27.setFont(f2);
        l28.setFont(f2);
        l29.setFont(f2);
        l30.setFont(f2);
        l31.setFont(f2);
        l32.setFont(f2);
        l33.setFont(f2);
        l34.setFont(f2);
        l35.setFont(f2);
        
        l3.setForeground(Color.YELLOW);
        
        l4.setForeground(Color.GRAY);
        l5.setForeground(Color.GRAY);
        l6.setForeground(Color.GRAY);
        l7.setForeground(Color.GRAY);
        l8.setForeground(Color.GRAY);
        l9.setForeground(Color.GRAY);
        l10.setForeground(Color.GRAY);
        l11.setForeground(Color.GRAY);
        l12.setForeground(Color.GRAY);
        l13.setForeground(Color.GRAY);
        l14.setForeground(Color.GRAY);
        l15.setForeground(Color.GRAY);
        l16.setForeground(Color.GRAY);
        l17.setForeground(Color.GRAY);
        l18.setForeground(Color.GRAY);
        l19.setForeground(Color.GRAY);
        
        l20.setForeground(Color.WHITE);
        l21.setForeground(Color.WHITE);
        l22.setForeground(Color.WHITE);
        l23.setForeground(Color.WHITE);
        l24.setForeground(Color.WHITE);
        l25.setForeground(Color.WHITE);
        l26.setForeground(Color.WHITE);
        l27.setForeground(Color.WHITE);
        l28.setForeground(Color.WHITE);
        l29.setForeground(Color.WHITE);
        l30.setForeground(Color.WHITE);
        l31.setForeground(Color.WHITE);
        l32.setForeground(Color.WHITE);
        l33.setForeground(Color.WHITE);
        l34.setForeground(Color.WHITE);
        l35.setForeground(Color.WHITE);
        
        p1=new JPanel();
        p2=new JPanel();
        p3=new JPanel();
        p4=new JPanel();
        
        p1.setBackground(Color.BLACK);
        p2.setBackground(Color.BLACK);
        p3.setBackground(Color.BLACK);
        p4.setBackground(Color.BLACK);
        
        p1.setLayout(new BorderLayout(1,1));
        p2.setLayout(new BorderLayout(1,1));
        p3.setLayout(new GridLayout(1,1,10,10));
        p4.setLayout(new GridLayout(17,2,10,10));
        
        p1.add(l1,"North");
        p1.add(l37,"Center");
        p1.add(l38,"South");
        p2.add(l2,"North");
        p2.add(l39,"Center");
        p2.add(l40,"South");
        p3.add(l3);
        p4.add(l4);
        p4.add(l20);
        p4.add(l5);
        p4.add(l21);
        p4.add(l6);
        p4.add(l22);
        p4.add(l7);
        p4.add(l23);
        p4.add(l8);
        p4.add(l24);
        p4.add(l9);
        p4.add(l25);
        p4.add(l10);
        p4.add(l26);
        p4.add(l11);
        p4.add(l27);
        p4.add(l12);
        p4.add(l28);
        p4.add(l13);
        p4.add(l29);
        p4.add(l14);
        p4.add(l30);
        p4.add(l15);
        p4.add(l31);
        p4.add(l16);
        p4.add(l32);
        p4.add(l17);
        p4.add(l33);
        p4.add(l18);
        p4.add(l34);
        p4.add(l19);
        p4.add(l35);
        p4.add(bt1);
        p4.add(bt2);
        
        setLayout(new BorderLayout(0,0));
        
        add(p1,"East");
        add(p2,"West");
        add(p3,"North");
        add(p4,"Center");
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==bt1)
        {
            new Count_Customer().setVisible(true);
        }
        if(e.getSource()==bt2)
        {
            setVisible(false);
        }
    }
    public static void main(String args[])
    {
        new Gym_Gagets().setVisible(true);
    }
}
