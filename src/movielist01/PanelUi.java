/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movielist01;

import Helper.Helper;
import Model.DbModel;
import Singleton.MovieData;
import Singleton.UserData;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import org.json.JSONObject;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class PanelUi extends javax.swing.JFrame {

    /**
     * Creates new form PanelUi
     */
    Boolean response = false;
    
    DbModel execs = new DbModel();
    Helper helper = new Helper();
    
    int user_id = 0;
    String firstname = "";
    String lastname = "";
    String address = "";
    
    // initialize singleton class
    UserData singletonUser = new UserData();
    MovieData singletonMovie = new MovieData();
    
    // for movies
    String movie_title = "";
    int movie_price = 0;
    int movie_id = 0;
    
    public PanelUi() {
        initComponents();
        userTable();
        movieTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        firstname_field = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lastname_field = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        address_field = new javax.swing.JTextField();
        clear_button = new javax.swing.JButton();
        add_user_button = new javax.swing.JButton();
        update_user_button = new javax.swing.JButton();
        delete_user_button = new javax.swing.JButton();
        user_add_movie = new javax.swing.JButton();
        fistname_error_field = new javax.swing.JLabel();
        lastname_error_field = new javax.swing.JLabel();
        address_error_field = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        user_list_table = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        movie_list_table = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        movie_title_field = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        movie_price_field = new javax.swing.JTextField();
        movie_clear_button = new javax.swing.JButton();
        movie_add_button = new javax.swing.JButton();
        movie_update_button = new javax.swing.JButton();
        movie_delete_button = new javax.swing.JButton();
        movie_title_error = new javax.swing.JLabel();
        movie_price_error = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Add User");

        jLabel2.setText("Firstname");

        jLabel3.setText("Lastname");

        lastname_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastname_fieldActionPerformed(evt);
            }
        });

        jLabel4.setText("Address");

        address_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                address_fieldActionPerformed(evt);
            }
        });

        clear_button.setText("Clear");
        clear_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_buttonActionPerformed(evt);
            }
        });

        add_user_button.setText("Add");
        add_user_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_user_buttonActionPerformed(evt);
            }
        });

        update_user_button.setText("Update");
        update_user_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_user_buttonActionPerformed(evt);
            }
        });

        delete_user_button.setText("Delete");
        delete_user_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_user_buttonActionPerformed(evt);
            }
        });

        user_add_movie.setText("Rent Movie");
        user_add_movie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                user_add_movieMouseClicked(evt);
            }
        });
        user_add_movie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_add_movieActionPerformed(evt);
            }
        });

        fistname_error_field.setForeground(new java.awt.Color(255, 0, 51));

        lastname_error_field.setForeground(new java.awt.Color(255, 0, 51));

        address_error_field.setForeground(new java.awt.Color(255, 0, 51));

        user_list_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Number", "Firstname", "Lastname", "Address"
            }
        ));
        user_list_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                user_list_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(user_list_table);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(clear_button)
                        .addGap(18, 18, 18)
                        .addComponent(add_user_button)
                        .addGap(18, 18, 18)
                        .addComponent(update_user_button)
                        .addGap(18, 18, 18)
                        .addComponent(delete_user_button)
                        .addGap(18, 18, 18)
                        .addComponent(user_add_movie))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lastname_field, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstname_field, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(address_field, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fistname_error_field)
                            .addComponent(lastname_error_field)
                            .addComponent(address_error_field))))
                .addContainerGap(371, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(fistname_error_field)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(firstname_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lastname_error_field)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lastname_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(address_error_field)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(address_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clear_button)
                    .addComponent(add_user_button)
                    .addComponent(update_user_button)
                    .addComponent(delete_user_button)
                    .addComponent(user_add_movie))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("User Management", jPanel1);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Movies List ");

        movie_list_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NUMBER", "TITLE", "PRICE", "STATUS"
            }
        ));
        movie_list_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                movie_list_tableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(movie_list_table);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jDesktopPane2.setLayer(jScrollPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel6.setText("TITLE");

        jLabel7.setText("PRICE");

        movie_price_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movie_price_fieldActionPerformed(evt);
            }
        });

        movie_clear_button.setText("CLEAR");
        movie_clear_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movie_clear_buttonActionPerformed(evt);
            }
        });

        movie_add_button.setText("ADD");
        movie_add_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movie_add_buttonActionPerformed(evt);
            }
        });

        movie_update_button.setText("UPDATE");
        movie_update_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movie_update_buttonActionPerformed(evt);
            }
        });

        movie_delete_button.setText("DELETE");
        movie_delete_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movie_delete_buttonActionPerformed(evt);
            }
        });

        movie_title_error.setForeground(new java.awt.Color(255, 0, 51));

        movie_price_error.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(354, 354, 354)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(movie_title_field, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(movie_price_field, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(movie_clear_button)
                                .addGap(18, 18, 18)
                                .addComponent(movie_add_button)
                                .addGap(18, 18, 18)
                                .addComponent(movie_update_button)
                                .addGap(18, 18, 18)
                                .addComponent(movie_delete_button))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(movie_price_error))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(movie_title_error)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(movie_title_error)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(movie_title_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(movie_price_error)
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(movie_price_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(movie_clear_button)
                    .addComponent(movie_add_button)
                    .addComponent(movie_update_button)
                    .addComponent(movie_delete_button))
                .addContainerGap(100, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Movie Management", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 852, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void address_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_address_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_address_fieldActionPerformed

    private void lastname_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastname_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastname_fieldActionPerformed

    private void add_user_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_user_buttonActionPerformed
        // TODO add your handling code here:
        firstname = firstname_field.getText();
        lastname = lastname_field.getText();
        address = address_field.getText();
        clearUserError();
        boolean error = checkEmpty();
        if (error == false) {
            JSONObject user_obj = new JSONObject();
            user_obj.put("firstname", firstname);
            user_obj.put("lastname", lastname);
            user_obj.put("address", address);
            response = execs.insertData("users", user_obj);
            if (response == true) {
                clearUserField();
                clearUserError();
                userTable();
                helper.getAlert("ALERT", "User successfully added!", 1);
            } else {
                helper.getAlert("ALERT", "Cannot process request! Please try again", 0);
            }
            
        }
    }//GEN-LAST:event_add_user_buttonActionPerformed

    private void user_list_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_list_tableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)user_list_table.getModel();
        int row = user_list_table.getSelectedRow();
        user_id = (int)model.getValueAt(row, 0);
        firstname = (String)model.getValueAt(row, 1);
        lastname = (String)model.getValueAt(row, 2);
        address = (String)model.getValueAt(row, 3);
        address_field.setText(firstname);
        lastname_field.setText(lastname);
        firstname_field.setText(address);
    }//GEN-LAST:event_user_list_tableMouseClicked

    private void update_user_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_user_buttonActionPerformed
        // TODO add your handling code here:
        if (user_id == 0) {
            helper.getAlert("WARNING", "Please select user to update!", 2);
        } else {
            firstname = firstname_field.getText();
            lastname = lastname_field.getText();
            address = address_field.getText();
            clearUserError();
            boolean error = checkEmpty();
            if (error == false) {
                clearUserError();
                JSONObject user_obj = new JSONObject();
                user_obj.put("firstname", firstname);
                user_obj.put("lastname", lastname);
                user_obj.put("address", address);

                response = execs.updateData("users", user_id, user_obj);
                if (response == true) {
                    clearUserField();
                    clearUserError();
                    userTable();
                    helper.getAlert("ALERT", "User successfully updated!", 1);
                    user_id = 0;
                } else {
                    helper.getAlert("ALERT", "Cannot process request! Please try again", 0);
                }
            }
        }
    }//GEN-LAST:event_update_user_buttonActionPerformed

    private void delete_user_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_user_buttonActionPerformed
        // TODO add your handling code here:
        if (user_id == 0) {
            helper.getAlert("WARNING", "Please select user to delete", 2);
        } else {
            response = execs.deleteData("users", user_id);
            if (response == true) {
                clearUserField();
                clearUserError();
                userTable();
                user_id = 0;
                helper.getAlert("ALERT", "User successfully deleted!", 1);
            } else {
                helper.getAlert("ALERT", "Cannot process request! Please try again", 0);
            }
        }
    }//GEN-LAST:event_delete_user_buttonActionPerformed

    private void clear_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_buttonActionPerformed
        // TODO add your handling code here:
        clearUserField();
        clearUserError();
    }//GEN-LAST:event_clear_buttonActionPerformed

    private void movie_price_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movie_price_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_movie_price_fieldActionPerformed

    private void movie_clear_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movie_clear_buttonActionPerformed
        // TODO add your handling code here:
        clearMovieField();
    }//GEN-LAST:event_movie_clear_buttonActionPerformed

    private void movie_add_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movie_add_buttonActionPerformed
        // TODO add your handling code here:
        boolean error = false;
        clearMovieError();
        movie_title = movie_title_field.getText();
        if (movie_price_field.getText() == "" || movie_price_field.getText().matches("") || movie_price_field.getText() == null){
            movie_price_error.setText("Price is required");
            System.out.println("Error");
            error = true;
        } else {
            try {
                movie_price = Integer.parseInt(movie_price_field.getText());
            } catch (NumberFormatException e){
                movie_price_error.setText("Price must a number value");
                error = true;
            }
        }
        boolean m_title_err = checkEmptyMovieField();
        if (error == false && m_title_err == false) {
            movie_price = Integer.parseInt(movie_price_field.getText());
            clearMovieError();
            if (error == false) {
                JSONObject movie_obj = new JSONObject();
                movie_obj.put("title", movie_title);
                movie_obj.put("price", movie_price);
                response = execs.insertData("movies", movie_obj);
                if (response == true) {
                    clearMovieError();
                    clearMovieField();
                    movieTable();
                    helper.getAlert("ALERT", "Movie successfully added!", 1);
                } else {
                    helper.getAlert("ALERT", "Cannot process request! Please try again", 0);
                }

            }
        }
        
    }//GEN-LAST:event_movie_add_buttonActionPerformed

    private void movie_list_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movie_list_tableMouseClicked
        // TODO add your handling code here:
        clearMovieError();
        DefaultTableModel model = (DefaultTableModel)movie_list_table.getModel();
        int row = movie_list_table.getSelectedRow();
        movie_id = (int)model.getValueAt(row, 0);
        movie_title = (String)model.getValueAt(row, 1);
        movie_title_field.setText(movie_title);
        movie_price_field.setText(String.valueOf((int)model.getValueAt(row, 2)));
    }//GEN-LAST:event_movie_list_tableMouseClicked

    private void movie_update_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movie_update_buttonActionPerformed
        // TODO add your handling code here:
        if (movie_id != 0) {
            boolean error = false;
            clearMovieError();
            movie_title = movie_title_field.getText();
            if (movie_price_field.getText() == "" || movie_price_field.getText().matches("") || movie_price_field.getText() == null){
                movie_price_error.setText("Price is required");
                error = true;
            } else {
                try {
                    movie_price = Integer.parseInt(movie_price_field.getText());
                } catch (NumberFormatException e){
                    movie_price_error.setText("Price must a number value");
                    error = true;
                }
            }

            boolean m_title_err = checkEmptyMovieField();
            if (error == false && m_title_err == false) {
                movie_price = Integer.parseInt(movie_price_field.getText());
                clearMovieError();
                if (error == false) {
                    JSONObject movie_obj = new JSONObject();
                    movie_obj.put("title", movie_title);
                    movie_obj.put("price", movie_price);
                    response = execs.updateData("movies", movie_id, movie_obj);
                    if (response == true) {
                        clearMovieError();
                        clearMovieField();
                        movieTable();
                        helper.getAlert("ALERT", "User successfully updated!", 1);
                    } else {
                        helper.getAlert("ALERT", "Cannot process request! Please try again", 0);
                    }

                }
                movie_id = 0;
            } 
        } else {
            helper.getAlert("WARNING", "Please select Item to update", 2);
        }
        
    }//GEN-LAST:event_movie_update_buttonActionPerformed

    private void movie_delete_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movie_delete_buttonActionPerformed
        // TODO add your handling code here:
        if (movie_id == 0 ) {
            helper.getAlert("WARNING", "Please select item to delete", 2);
        } else {
            response = execs.deleteData("movies", movie_id);
            if (response == true) {
                clearMovieError();
                clearMovieField();
                movieTable();
                movie_id = 0;
                helper.getAlert("ALERT", "Movie successfully deleted!", 1);
            } else {
                helper.getAlert("ALERT", "Cannot process request! Please try again", 0);
            }
        }
        
    }//GEN-LAST:event_movie_delete_buttonActionPerformed

    private void user_add_movieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_add_movieActionPerformed
        // TODO add your handling code here:
        if (user_id == 0) {
            helper.getAlert("WARNING", "Please select user!", 2);
        } else {
            
            JSONObject movie_obj = new JSONObject();
            movie_obj.put("status", 0);
            ResultSet response = execs.getWhere("movies", movie_obj);
            
            singletonMovie.AVAILABLE_MOVIE = response;
            
            singletonUser.SELECTED_USER_ID = user_id;
            singletonUser.SELECTED_USER_FIRSTNAME = firstname;
            singletonUser.SELECTED_USER_LASTNAME = lastname;
            singletonUser.SELECTED_USER_ADDRESS = address;
            
            RentAMovie frejm = new RentAMovie();
            frejm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frejm.setVisible(true);
            
        }
    }//GEN-LAST:event_user_add_movieActionPerformed

    private void user_add_movieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_add_movieMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_user_add_movieMouseClicked

    public void clearMovieField() {
        movie_title_field.setText("");
        movie_price_field.setText("");
    }
    
    private void clearMovieError() {
        movie_title_error.setText("");
        movie_price_error.setText("");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PanelUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       
    }

    private boolean checkEmpty() {
        boolean error = false;
        String base_message = "  is required!";
        if (firstname.matches("") || firstname == "" || firstname == null) {
            fistname_error_field.setText("Firstname" + base_message);
            error = true;
        }
        if (lastname.matches("") || lastname == "" || lastname == null) {
            lastname_error_field.setText("Lastname" + base_message);
            error = true;
        }
        if (address.matches("") || address == "" || address == null) {
            address_error_field.setText("Address" + base_message);
            error = true;
        }
        return error;
    }
    
    private boolean checkEmptyMovieField() {
        boolean error = false;
        String base_message = "  is required!";
        if (movie_title.matches("") || movie_title == "" || movie_title == null) {
            movie_title_error.setText("Title" + base_message);
            error = true;
        }
        return error;
    }
    
    
    public void userTable() {
        String[] columnNames = {"Number", "Firstname", "Lastname", "Address"};
        int user_number = 0;
        String user_firstname = "";
        String user_lastname = "";
        String user_address = "";
        ResultSet response = execs.fetchData("users");
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columnNames);
        user_list_table.setModel(model);
        try {
            while ( response.next() ) {
                String lastName = response.getString("firstname");
                user_number = response.getInt("id");
                user_firstname = response.getString("firstname");
                user_lastname = response.getString("lastname");
                user_address = response.getString("address");
                model.addRow(new Object[]{user_number, user_firstname, user_lastname, user_address});
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void movieTable() {
        String[] columnNames = {"NUMBER", "TITLE", "PRICE", "STATUS"};
        int movie_number = 0;
        String movie_title = "";
        int movie_price = 0;
        String movie_status = "";
        ResultSet response = execs.fetchData("movies");
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columnNames);
        movie_list_table.setModel(model);
        try {
            while ( response.next() ) {
                movie_number = response.getInt("id");
                movie_title = response.getString("title");
                movie_price = response.getInt("price");
                movie_status = (response.getInt("status")==1) ? "Unavailable" : "Available";
                model.addRow(new Object[]{movie_number, movie_title, movie_price, movie_status});
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    private void clearUserField() {
        address_field.setText("");
        lastname_field.setText("");
        firstname_field.setText("");
    }
    
    private void clearUserError() {
        fistname_error_field.setText("");
        lastname_error_field.setText("");
        address_error_field.setText("");
    }
    
    public static void design() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelUi().setVisible(true);
            }
        });
    }
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_user_button;
    private javax.swing.JLabel address_error_field;
    private javax.swing.JTextField address_field;
    private javax.swing.JButton clear_button;
    private javax.swing.JButton delete_user_button;
    private javax.swing.JTextField firstname_field;
    private javax.swing.JLabel fistname_error_field;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lastname_error_field;
    private javax.swing.JTextField lastname_field;
    private javax.swing.JButton movie_add_button;
    private javax.swing.JButton movie_clear_button;
    private javax.swing.JButton movie_delete_button;
    private javax.swing.JTable movie_list_table;
    private javax.swing.JLabel movie_price_error;
    private javax.swing.JTextField movie_price_field;
    private javax.swing.JLabel movie_title_error;
    private javax.swing.JTextField movie_title_field;
    private javax.swing.JButton movie_update_button;
    private javax.swing.JButton update_user_button;
    private javax.swing.JButton user_add_movie;
    private javax.swing.JTable user_list_table;
    // End of variables declaration//GEN-END:variables
}
