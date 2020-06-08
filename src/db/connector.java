/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;



import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author Flo
 */
public class connector {
    

    public static Connection getConnection(String connectstring,String user, String password ) throws Exception
    {

        
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection cn=(Connection)
        DriverManager.getConnection(connectstring,user,password);
              
                
                
    return cn;
    }
    
}
