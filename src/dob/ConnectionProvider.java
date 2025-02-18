/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dob;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author satap
 */
public class  ConnectionProvider {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/medical?useSSl=false","root","Abhi@4520");
        return con;
        
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
    
}
