package Gym_Management;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class CountCustomer_details extends JFrame implements ActionListener
{
    String x[]={"Recipt Id","Name","Father's name","Email","Address","Contact no","Payments Plan","gender","Height","Weight","Remarks","Trainer name","catg."};
    JButton bt;
    String y[][]=new String[20][14];
    int i=0,j=0;
    JTable t;
    Font f;
    CountCustomer_details()
    {
        
    }
    CountCustomer_details(String sm)
    {
        super("Customer information");
        setSize(1500,400);
        setLocation(1,1);
        f=new Font("Arial",Font.BOLD,15);
        try
        {
            ConnectionClass obj=new ConnectionClass();
            String q="Select * from add_Customer where trainer_name='"+sm+"'";
            ResultSet rest=obj.stm.executeQuery(q);
            while(rest.next())
            {
                y[i][j++]=rest.getString("recipt_no");   
                y[i][j++]=rest.getString("name");
                y[i][j++]=rest.getString("fname");   
                y[i][j++]=rest.getString("email");
                y[i][j++]=rest.getString("address");   
                y[i][j++]=rest.getString("contactNo");   
                y[i][j++]=rest.getString("payments_plan");   
                y[i][j++]=rest.getString("gender");
                y[i][j++]=rest.getString("height");   
                y[i][j++]=rest.getString("weight");
                y[i][j++]=rest.getString("remarks");
                y[i][j++]=rest.getString("trainer_name");
                y[i][j++]=rest.getString("catogery");
                i++;
                j=0;
            }
            t=new JTable(y,x);
            t.setFont(f);
            t.setBackground(Color.BLACK);
            t.setForeground(Color.WHITE);
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        JScrollPane sp=new JScrollPane(t);
        bt=new JButton("Print");
        bt.addActionListener(this);
        bt.setBackground(Color.BLACK);
        bt.setForeground(Color.WHITE);
        bt.setFont(f);
        add(bt,"South");
        add(sp);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==bt)
        {
            try
            {
                t.print();
            }
            catch(Exception evx)
            {
                evx.printStackTrace();
            }
        }
    }
    public static void main(String args[])
    {
        new CountCustomer_details().setVisible(true);
    }
}
