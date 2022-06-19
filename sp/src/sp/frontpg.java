package sp;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class frontpg implements ActionListener{
    JFrame f; //declaration
    JLabel id,l1;
    JButton i,d,t;

    frontpg(){
 
        f=new JFrame("Employee Management System");
        f.setBackground(Color.red);
        f.setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/air.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(1500,1000,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        
        l1.setBounds(0,0,1360,1000);
        i = new JButton("INTERNATIONAL");
        i.setFont(new Font("calibri",Font.PLAIN,40));
        i.setBackground(Color.BLUE);
        i.setForeground(Color.RED);
        

        i.setBounds(40,350,600,200);
        i.addActionListener(this);
        
        d = new JButton("DOMESTIC");
        d.setFont(new Font("calibri",Font.PLAIN,40));
        d.setBackground(Color.BLUE);
        d.setForeground(Color.RED);
        

        d.setBounds(650,350,600,200);
        d.addActionListener(this);
        
        t = new JButton("CHECK BOOKING");
        t.setFont(new Font("calibri",Font.PLAIN,20));
        t.setBackground(Color.BLUE);
        t.setForeground(Color.RED);
        

        t.setBounds(40,600,1220,50);
        t.addActionListener(this);

        id=new JLabel();
        id.setBounds(0,0,1360,750);
        id.setLayout(null);
        
   

        JLabel lid=new JLabel("AIRLINE BOOKING SYSTEM");
        lid.setBounds(300,150,1500,100);
        lid.setFont(new Font("calibri",Font.PLAIN,70));
        lid.setForeground(Color.WHITE);
        id.add(lid);

        id.add(i);
        id.add(d);
        id.add(t);
        f.add(id);
        f.add(l1);
        
        
        f.getContentPane().setBackground(Color.WHITE);

        f.setVisible(true);
        f.setSize(1360,750);
        f.setLocation(200,100);

    }
    
    /*public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==b){
            f.setVisible(false);
            new login();    
        }
    }*/

    public static void main(String[] arg){
        new frontpg();
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==i)
		{
			new INTER();
			f.setVisible(false);
		}
		if(e.getSource()==d)
		{
			new DOMES();
			f.setVisible(false);
		}
		if(e.getSource()==t)
		{
			new search();
			f.setVisible(false);
		}
			
		// TODO Auto-generated method stub
		
	}
}
