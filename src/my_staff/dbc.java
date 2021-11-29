/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_staff;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 23058
 */
class dbc {
    
     public static Connection connectdb() {
         
     try {
         Connection con=null;
         con=DriverManager.getConnection("jdbc:derby://localhost:1527/staff_dbs","bouba","bouba");
         System.out.println("Dbs connected");
         return con;
     } catch (SQLException e) {
    Logger.getLogger(dbc.class.getName()).log(Level.SEVERE,null,e);
    
 
}
    
    return null;
     }}
    
    
    

