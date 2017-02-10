/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import Config.Database;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Iterator;
import org.json.JSONObject;
import Library.QueryBuilder;

/**
 * 
 * @author Roy <johnrobertjerodiaz@gmail.com>
 */
public class DbModel {
    
    // init response boolean
    private boolean response = false;
    
    private String query = "";
    
    // init object
    private PreparedStatement preparedStmt;
    
    // instantiate classes
    Database conn = new Database();
    QueryBuilder sql = new QueryBuilder();
    

    /**
     * Insert Data function
     * @param table - (String) table name
     * @param data - (Json Object) database data
     * @return boolean
     */
    public boolean insertData(String table, JSONObject data) {       
        try {
            query = sql.getQuery("insert", table, data);
            preparedStmt = conn.connect().prepareStatement(query);   
            int i = prepareData(preparedStmt, data).executeUpdate();
            response = (i > 0) ? true : false;
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return response;
    }
    
    /**
     * Update Data function
     * @param table - (String) table name
     * @param id - (int) item id
     * @param data - (json object) database data
     * @return boolean
     */
    public boolean updateData(String table, int id, JSONObject data) {
        int number_of_data = data.length()+1;
        try {
            query = sql.getQuery("update", table, data);
            preparedStmt = conn.connect().prepareStatement(query);      
            preparedStmt.setInt (number_of_data, id);
            int i = prepareData(preparedStmt, data).executeUpdate();
            response = (i > 0) ? true : false;
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return response;
    }
    
    /**
     * Delete Data function
     * @param table - (String) table name
     * @param id - (int) item id
     * @return boolean
     */
    public boolean deleteData(String table, int id) {
        try {
            query = sql.getQuery("delete", table, null);
            preparedStmt = conn.connect().prepareStatement(query);      
            preparedStmt.setInt (1, id);
            int i = preparedStmt.executeUpdate();
            response = (i > 0) ? true : false;
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        return response;
    }
    
    /**
     * Fetch data
     * @param table - (String) table name
     * @return result set
     */
    public ResultSet fetchData(String table) {
        query = sql.getQuery("select", table, null);
        ResultSet rs = null;
        try {
            Statement stmt = conn.connect().createStatement();
            rs = stmt.executeQuery(query);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public ResultSet getWhere(String table, JSONObject data) {
        query = sql.getQuery("select", table, data);
        ResultSet rs = null;
        try {
            preparedStmt = conn.connect().prepareStatement(query); 
            rs = prepareData(preparedStmt, data).executeQuery();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    /**
     * prepareData function
     * @param preparedStmt (prepared statement)
     * @param data - (json object) database data
     * @return prepared statement
     */
    private PreparedStatement prepareData(PreparedStatement preparedStmt, JSONObject data) {
        int counter = 1;
        try {
            Iterator<String> keys = data.keys();
            while(keys.hasNext()) {
                String key = keys.next();
                String stringVal = null;
                int intVal = 0;
                boolean booVal = false;
                
                try{
                    JSONObject value = data.getJSONObject(key);
                }catch(Exception e){
                    Object obj = data.get(key);
                    if (obj instanceof String) {
                        stringVal = data.getString(key);
                        preparedStmt.setString (counter, stringVal);
                    } else if (obj instanceof Integer ){
                        intVal = data.getInt(key);
                        preparedStmt.setInt(counter, intVal); 
                    } else if (obj instanceof Boolean) {
                        booVal = data.getBoolean(key);
                        preparedStmt.setBoolean(counter, booVal);
                    }
                    counter ++;
                }
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return preparedStmt;
    }
}
