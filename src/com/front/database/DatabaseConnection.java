package com.front.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection
{
    //variables needed to connect to database
    private String URL = "jdbc:mysql://localhost:3306/Fanaberia?useUnicode="
        + "true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";;
    private String password = "";
    private String login = "root";

    //singleton variable which will be use to initialize connection
    private Connection databaseConnection;

    //constructor which makes connection with database
    public DatabaseConnection()
    {
        try
        {
            //getting instance of the SQLConnector
            Class.forName("com.mysql.cj.jdbc.Driver");
            setConnection(DriverManager.getConnection(URL,login,password));
            System.out.println("Connection to database successful");
        }
        catch(Exception exception)
        {
            System.out.println("An exception founded: " + exception);
            System.out.println("Class: DatabaseConnection");
        }
    }
    //public method which returns the object needed to connect with database, for other classes use
    public Connection getDatabaseConnection(){ return databaseConnection; }
    //public method which is used to set connection with database
    public void setConnection(Connection databaseConnection) { this.databaseConnection = databaseConnection; }
}
