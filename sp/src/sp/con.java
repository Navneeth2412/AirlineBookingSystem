package sp;

import java.sql.*;

public class con{
    
    public Connection c;
    public Statement s;
 
    public con(){
        try{
        	System.out.println("runnnig");
            Class.forName("com.mysql.jdbc.Driver");  
            c =DriverManager.getConnection("jdbc:mysql://localhost/airline","root","");    
            s =c.createStatement();
            System.out.println("ran succsefully");
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args)
    {
    	new con();
    }
}
 
