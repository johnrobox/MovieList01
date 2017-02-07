/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movielist01;

import java.sql.DriverManager;
import java.sql.Connection;

import java.util.Calendar;
import java.sql.*;
/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class MovieList01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        User u = new User();
        u.userDesign();
    }
    
}
