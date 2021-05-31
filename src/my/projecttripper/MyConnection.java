/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.projecttripper;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author rozan
 */
public class MyConnection {
    public static Connection getConnection()
    {
       Connection con = null;
       try
       {
           Class.forName("org.sqlite.JDBC");
            String url="jdbc:sqlite:Tripper.db";
            con=DriverManager.getConnection(url);
           
       }
       catch(Exception ex)
        {
             System.out.println(ex.getMessage());
              System.out.println("Error");
                     
        }
       return con;
    }
    
}
