/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dob;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;
/**
 *
 * @author satap
 */
public class Tables {
    public static void main(String args[]){
        try{
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();
            //st.executeUpdate("create table appuser(appuser_pk int AUTO_INCREMENT PRIMARY KEY, userRole varchar(200),name varchar(200),dob varchar(50),mobileNumber varchar(13),email varchar(200),username varchar(200),password varchar(50),address varchar(200))");
            //st.executeUpdate("insert into appuser(userRole,name,dob,mobileNumber,email,username,password,address) values ('Admin','Admin','31-05-2003','9777357512','admin@gmail.com','admin','admin','India')");
            //st.executeUpdate("create table medicine(medicine_pk int auto_increment primary key, id varchar(200), name varchar(200), companyName varchar(200), quantity bigint, price bigint)");
            //st.executeUpdate("create table bill (bill_pk int auto_increment primary key,billId varchar(200),billDate varchar(50),totalPaid bigint,generatedBy varchar(200))");
            JOptionPane.showMessageDialog(null,"Table Created Sucessfully!");
        }catch(Exception e){
            //e.printStackTrace();
            JOptionPane.showMessageDialog(null,e);
        }
    }
}
