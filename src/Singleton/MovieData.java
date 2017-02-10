/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Singleton;

import java.sql.ResultSet;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class MovieData {
    
    public static ResultSet AVAILABLE_MOVIE = null;
    
    private static MovieData movieInstance  = null;
    
    public static MovieData getInstance() {
        if (movieInstance == null) {
            movieInstance = new MovieData();
        }
        return movieInstance;
    }
}
