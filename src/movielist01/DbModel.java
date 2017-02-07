/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package movielist01;

import java.sql.PreparedStatement;
import java.util.Calendar;


/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class DbModel {

    MysqlConnect conn = new MysqlConnect();
    
    public void insertData(String firstname, String lastname, int age, int gender, String address) {
        try {
            // create a sql date object so we can use it in our INSERT statement
            Calendar calendar = Calendar.getInstance();
            java.sql.Date startDate = new java.sql.Date(calendar.getTime().getTime());
      
            String query = " insert into users (firstname, lastname, age, gender, address, created)"
                + " values (?, ?, ?, ?, ?, ?)";

            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt = conn.connect().prepareStatement(query);
            preparedStmt.setString (1, firstname);
            preparedStmt.setString (2, lastname);
            preparedStmt.setInt    (3, age);
            preparedStmt.setInt    (4, gender);
            preparedStmt.setString (5, address);
            preparedStmt.setDate   (6, startDate);
            preparedStmt.execute();
        } catch (Exception e) {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }
    }
    
}
