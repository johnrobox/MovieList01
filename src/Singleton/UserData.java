/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Singleton;

import org.json.JSONObject;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class UserData {
    
    public static JSONObject SELECTED_USER = null;
    
    public static int SELECTED_USER_ID = 0;
    public static String SELECTED_USER_FIRSTNAME = "";
    public static String SELECTED_USER_LASTNAME = "";
    public static String SELECTED_USER_ADDRESS = "";
    
    private static UserData userInstance  = null;
    
    public static UserData getInstance() {
        if (userInstance == null) {
            userInstance = new UserData();
        }
        return userInstance;
    }
    
    
}
