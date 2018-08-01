package studentinformationsystem;

import java.sql.*;
import javax.swing.*;

//dbConnection from Interface

public  class dbMysqlConnection  implements dbConnection{
	//variable declaration
  
    private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/student_info";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "";
    private Connection con;
    
    public   Connection getConnection(){
    	try{
    		
            Class.forName(DB_DRIVER);
              con = DriverManager.getConnection(DB_URL, USER_NAME,PASSWORD);
            if(con != null){
          //      JOptionPane.showMessageDialog(null, "Successfully connected");
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Connection failed");
                return null;
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            
        }
    	return con; 
    	
    }
    
   
    
}
