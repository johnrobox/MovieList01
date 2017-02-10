/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Helper;

import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 * 
 * @author Roy <johnrobertjerodiaz@gmail.com>
 */
public class Helper {
     /**
     * getAlert - show joptionpane message dialog function
     * @param title - String (title of the alert dialog)
     * @param message - String (text message of the alert dialog)
     * @param type - int (type of the alert dialog ) -1 = plane text, 0 = error, 1 = info, 2 = warning, 3 = question
     */
    public void getAlert(String title, String message, int type) {
        JOptionPane.showMessageDialog(null,
                message,
                title,
                type);
    }
    
    public Date getDate() {
            Calendar calendar = Calendar.getInstance();
            java.sql.Date startDate = new java.sql.Date(calendar.getTime().getTime());
            return startDate;
    }
}
