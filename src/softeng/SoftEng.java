/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package softeng;

import java.sql.*;


/**
 *
 * @author Kevin
 */
public class SoftEng {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                String url = "jdbc:mysql://127.0.0.1:3306/database";
        String username= "root";
        String password= "admin";
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection connection = DriverManager.getConnection(url,username,password);
            
            Statement statement = connection.createStatement();
            
            ResultSet resultset = statement.executeQuery("select * from users");
            
            while(resultset.next()){
                System.out.println(resultset.getInt(1)+" "+resultset.getString(2));
            
            }
            connection.close();
        }
        
        catch(Exception e){
        System.out.println(e);
        }
    }
    
}
