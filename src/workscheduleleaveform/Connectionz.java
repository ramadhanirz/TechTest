/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workscheduleleaveform;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author DELL
 */
public class Connectionz {
    static Connection con;
    static Connection getConnection;
    
    public static Connection getConnection() {
    try{
            Class.forName("com.mysql.jdbc.Driver");
            con =  DriverManager.getConnection("jdbc:mysql://localhost/workleaveapp","root","");
        }catch (Exception ex){
            System.out.println(""+ex);
        }
    return con;
    
    }
    
}
