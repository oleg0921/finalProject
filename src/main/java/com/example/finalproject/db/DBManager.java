package com.example.finalproject.db;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

public class DBManager {
    private static final Logger log = Logger.getLogger(String.valueOf(DBManager.class));

    private static  DBManager instance;

    private DBManager() {

    }


    public static synchronized DBManager GetInstance() {
        if(instance == null)
        {
            instance = new DBManager();
        }
        return instance;
    }


    public Connection getConnectionWithMysql() throws SQLException {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/variant3schema","root","password");
            System.out.println("ok");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return con;
    }


    public Connection getConnection() throws SQLException {
        Connection con = null;
        try {
            Context initContext = new InitialContext();
            Context envContext  = (Context)initContext.lookup("java:/comp/env");

            // ST4DB - the name of data source
            DataSource ds = (DataSource)envContext.lookup("jdbc/ST4DB");
            con = ds.getConnection();
        } catch (NamingException ex) {

        }
        return con;
    }



    // done
    public void commitAndClose(Connection con) {
        try {
            con.commit();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }




    // done
    public void rollbackAndClose(Connection con) {
        try {
            con.rollback();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
