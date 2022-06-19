package sp;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

class DOMES implements ActionListener{

    JFrame f;
    JLabel id,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10,id11,id12,id15,id16,id17,lab,lab1;
    JTextField t,t1,t2,t3,t4,t6,t8,t9,t10,t12,t13;
    JButton b,b1,b2,b3;
    JComboBox<String> t5;
    JComboBox<String> t7;
    JComboBox<String> t11;

    
    DOMES(){
        f = new JFrame("INTERNATIONAL FLIGHT");
        f.setBackground(Color.white);
        f.setLayout(null);

        id15=new JLabel();
        id15.setBounds(0,0,900,700);
        id15.setLayout(null);
        //ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("icons/add_employee.jpg"));
        //id15.setIcon(img);

        id8 = new JLabel("INTERNATIONAL");
        id8.setBounds(320,30,500,50);
        id8.setFont(new Font("serif",Font.ITALIC,25));
        id8.setForeground(Color.black);
        id15.add(id8);
        f.add(id15);

 
        id1 = new JLabel("Name");
        id1.setBounds(50,150,100,30);
        id1.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id1);

        t1=new JTextField();
        t1.setBounds(200,150,600,30);
        id15.add(t1);

        /*id2 = new JLabel("Father's Name");
        id2.setBounds(400,150,200,30);
        id2.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id2);

        t2=new JTextField();
        t2.setBounds(600,150,150,30);
        id15.add(t2);*/

        id3= new JLabel("PHONE NO");
        id3.setBounds(50,200,100,30);
        id3.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id3);

        t3=new JTextField();
        t3.setBounds(200,200,600,30);
        id15.add(t3);

        /*id4= new JLabel("Date Of Birth");  
        id4.setBounds(400,200,200,30);
        id4.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id4);

        t4=new JTextField();
        t4.setBounds(600,200,150,30);
        id15.add(t4);*/

        id5= new JLabel("FROM");
        id5.setBounds(50,250,100,30);
        id5.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id5);

        //t5=new JTextField();
        String[] placenames= {"BENGALURU","MANGALURU","DELHI","MUMBAI","HYDERARBAD"};
        t5 = new JComboBox<>(placenames);
        t5.setBounds(200,250,600,30);
        id15.add(t5);

        /*id6= new JLabel("Phone");
        id6.setBounds(400,250,100,30);
        id6.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id6);

        t6=new JTextField();
        t6.setBounds(600,250,150,30);
        id15.add(t6);*/

        id7= new JLabel("TO");
        id7.setBounds(50,300,100,30);
        id7.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id7);

        //t7=new JTextField();
        t7 = new JComboBox<>(placenames);
        t7.setBounds(200,300,600,30);
        id15.add(t7);

        /*id9= new JLabel("Education");
        id9.setBounds(400,300,100,30);
        id9.setFont(new Font("serif",Font.BOLD,20));    
        id15.add(id9);

        t8=new JTextField();
        t8.setBounds(600,300,150,30);
        id15.add(t8);*/

        id10= new JLabel("DATE");
        id10.setBounds(50,350,100,30);
        id10.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id10);

        t9=new JTextField();
        t9.setBounds(200,350,600,30);
        id15.add(t9);


        /*id11= new JLabel("Aadhar No");
        id11.setBounds(400,350,100,30);
        id11.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id11);

        t10=new JTextField();
        t10.setBounds(600,350,150,30);
        id15.add(t10);*/

        id12= new JLabel("AIRLINE");
        id12.setBounds(50,400,150,30);
        id12.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id12);

        //t11=new JTextField(); 
        String[] airnames= {"SPICE","INDIGO","GOAIR"};
        t11 = new JComboBox<>(airnames);
        t11.setBounds(200,400,600,30);
        id15.add(t11);

        

        /*lab=new JLabel();
        lab.setBounds(200,450,250,200);
        id15.add(lab);

        lab1=new JLabel("");
        lab1.setBounds(600,450,250,200);
        id15.add(lab1);*/

        b = new JButton("Submit");
        b.setBackground(Color.BLACK);
        b.setForeground(Color.BLACK);
        b.setBounds(250,550,150,40);
        
        id15.add(b);

        b1=new JButton("Cancel");   
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.BLACK);
        b1.setBounds(450,550,150,40);
        
        id15.add(b1);
        
        b.addActionListener(this);
        b1.addActionListener(this);
        
        f.setVisible(true);
        f.setSize(900,700);
        f.setLocation(400,150);
    }

    public void actionPerformed(ActionEvent ae){
        
        String name = t1.getText();
        
        String pno = t3.getText();
        
        String pick = t5.getItemAt(t5.getSelectedIndex());
        
        String des = t7.getItemAt(t7.getSelectedIndex());
        
        String dat = t9.getText();
        
        String air = t11.getItemAt(t11.getSelectedIndex());
        if(ae.getSource() == b){
            try{
                con cc = new con();
                String tic=air+pno;
                int amt1=0,amt2=0,amt3 = 0;
                
                String q1="select * from ROUTEFARE where PLACE = '"+pick+"'";
                ResultSet a1=cc.s.executeQuery(q1);
                while (a1.next())
                {
                	amt1=a1.getInt("FARE");
                }
                
                
                String q2="select * from ROUTEFARE where PLACE = '"+des+"'";
                ResultSet a2=cc.s.executeQuery(q2);
                while (a2.next())
                {
                	amt2=a2.getInt("FARE");
                }
                
                
                String q3="select * from AIRLINEFARE where AIRLINE = '"+air+"'";
                ResultSet a3=cc.s.executeQuery(q3);
                while(a3.next())
                {
                	amt3=a3.getInt("FARE");
                }
                
                int finamt=amt1+amt2+amt3;
                
                String q = "insert into PASSENGER values('"+tic+"','"+pick+"','"+des+"','"+air+"','"+pno+"','"+dat+"','"+name+"','"+finamt+"')";
                cc.s.executeUpdate(q);
                //JOptionPane.showMessageDialog(null,"Details Successfully Inserted");
                System.out.println("Inserted details succesfully");
                f.setVisible(false);
                new pay(tic);
                //new details();
            }catch(Exception ee){
                System.out.println("The error is:"+ee);
            }
        }else if(ae.getSource() == b1){
            f.setVisible(false);
            //new details();
        }
    }
    public static void main(String[ ] arg){
        new DOMES();
    }
}