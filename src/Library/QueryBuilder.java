/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Library;

import java.util.Iterator;
import org.json.JSONObject;

/**
 * 
 * @author Roy <johnrobertjerodiaz@gmail.com>
 */
public class QueryBuilder {

    private String response = "";
    /**
     * getQuery - use to build query syntax
     * @param type = (string) query type
     * @param table = (String) database table
     * @param data = (Json Object) database data
     * @return boolean
     */
    public String getQuery(String type , String table, JSONObject data) {
        switch(type) {
            case "insert":
                response = sqlInsert(table, data);
                break;
            case "update":
                response = sqlUpdate(table, data);
                break;
            case "select":
                String mode = (data == null) ? "all" : "where";
                response = sqlSelect(mode, table, data);
                break;
            case "delete":
                response = sqlDelete(table);
                break;
        }
        return response;
    }
    
    /**
     * sql update
     * @param table - (String) database table name
     * @param data - (json object) database table data
     * @return String
     */
    private String sqlUpdate(String table, JSONObject data) {
        String fields = "";
        Iterator<String> keys = data.keys();
        while(keys.hasNext()) {
            String key = keys.next();
            if (fields == "") {
                fields = key + " = ?";
            } else {
                fields = fields + ", " + key + " = ?";
            }
        }
        response = " update "+table+" set " + fields + " where id = ?";
        return response;
    }
    
    /**
     * sql select
     * @param status - (String) type of query behavior
     * @param table - (String) table name
     * @return String
     */
    private String sqlSelect(String status, String table, JSONObject data) {
        if (status == "all") {
            response = " select * from " + table;
        } else if (status == "where") {
            String fields = "";
            Iterator<String> keys = data.keys();
            while(keys.hasNext()) {
                String key = keys.next();
                if (fields == "") {
                    fields = key + " = ?";
                } else {
                    fields = fields + " AND " +key+" = ?";
                }
            }
            response = "SELECT * FROM "+table+" WHERE "+fields;
        }
        return response;
    }
    
    /**
     * sql delete
     * @param table (String) table name
     * @return String
     */
    private String sqlDelete(String table) {
        String response = " delete from " + table + " where id = ?";
        return response;
    }
    
    /**
     * sql insert
     * @param table - (String) table name
     * @param data - (json object) database data
     * @return String
     */
    public String sqlInsert(String table, JSONObject data) {
        String fields = "";
        String value = "";
        Iterator<String> keys = data.keys();
        while(keys.hasNext()) {
            String key = keys.next();
            if (fields == "") {
                fields = key;
                value = "?";
            } else {
                fields = fields + ", " +key;
                value = value + ", ?"; 
            }
        }
        response = " insert into " + table + "(" + fields + ") values (" + value + ")";
        return response;
    }
    
}
