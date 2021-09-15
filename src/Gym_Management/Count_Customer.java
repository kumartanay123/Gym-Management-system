package Gym_Management;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Count_Customer extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4;
    JButton bt1,bt2;
    JTextField tf1,tf2;
    Choice ch1,ch2;
    JPanel p1,p2,p3;
    Font f1,f2;
    
    Count_Customer()
    {
        super("count customer");
        setSize(500,240);
        setLocation(50,50);
        
        f1=new Font("Lucida Fax",Font.BOLD,26);
        f2=new Font("MS UI Gothic",Font.BOLD,18);
        
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("Gym_Management/icons/2.png"));
        Image imag=img.getImage().getScaledInstance(90,165,Image.SCALE_DEFAULT);
        l4=new JLabel(new ImageIcon(imag));
        
        l1=new JLabel("Total No Customer Count");
        l1.setHorizontalAlignment(JLabel.CENTER);
        l2=new JLabel("Trainer Id");
        l3=new JLabel("Trainer Name");
        
        tf1=new JTextField();
        
        ch1=new Choice();
        
        try
        {
            ConnectionClass obj1=new ConnectionClass();
            String q1="select tid from add_trainer";
            ResultSet rest1=obj1.stm.executeQuery(q1);
            while(rest1.next())
            {
                ch1.add(rest1.getString("tid"));
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        ch1.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent arg0)
            {
                int id=Integer.parseInt(ch1.getSelectedItem());
                try
                {
                    ConnectionClass obj2=new ConnectionClass();
                    String q2="select name from add_trainer where tid='"+id+"'";
                    ResultSet rest2=obj2.stm.executeQuery(q2);
                    while(rest2.next())
                    {
                        tf1.setText(rest2.getString("name"));
                    }
                }
                catch(Exception exx)
                {
                    exx.printStackTrace();
                }
            }
        });
        
        bt1=new JButton("Check");
        bt2=new JButton("Cancel");
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        
        bt1.setBackground(Color.BLACK);
        bt1.setForeground(Color.CYAN);
        bt2.setBackground(Color.BLACK);
        bt2.setForeground(Color.RED);
        
        l1.setFont(f1);
        l2.setFont(f2);
        l3.setFont(f2);
        tf1.setFont(f2);
        ch1.setFont(f2);
        bt1.setFont(f2);
        bt2.setFont(f2);
        
        p1=new JPanel();
        p2=new JPanel();
        p3=new JPanel();
        
        p1.setLayout(new GridLayout(1,1,10,10));
        p1.add(l1);
        
        p2.setLayout(new GridLayout(3,2,10,10));
        p2.add(l2);
        p2.add(ch1);
        p2.add(l3);
        p2.add(tf1);
        p2.add(bt1);
        p2.add(bt2);
        
        p3.setLayout(new GridLayout(1,1,10,10));
        p3.add(l4);
        
        l1.setForeground(Color.YELLOW);
        l2.setForeground(Color.WHITE);
        l3.setForeground(Color.WHITE);
        p1.setBackground(Color.BLACK);
        p2.setBackground(Color.BLACK);
        p3.setBackground(Color.BLACK);
        setLayout(new BorderLayout(0,0));
        
        add(p1,"North");
        add(p2,"Center"); 
        add(p3,"West");
    }
    public void actionPerformed(ActionEvent e)
    {
        String name=tf1.getText();
        if(e.getSource()==bt1)
        {
            new CountCustomer_details(name).setVisible(true);
        }
    }
    public static void main(String args[])
    {
        new Count_Customer().setVisible(true);
    }
}
