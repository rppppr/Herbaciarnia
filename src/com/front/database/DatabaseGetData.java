package com.front.database;

import com.front.items.Categories;
import com.front.items.Products;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DatabaseGetData
{
    //Connection object needed to make database connection
    private Connection connection;
    //Statement which will do operations on database
    private Statement statement;
    //ResultSet use to watch results
    private ResultSet resultSet;

    //variable use to execute queries in methods of this class
    private String query = "";

    //ArrayList use to send results to front-end
    private ArrayList <String> queryResponse = new ArrayList<>();

    public DatabaseGetData()
    {
        try
        {
            //creating connection with database
            connection = new DatabaseConnection().getDatabaseConnection();
            //making statement possible to do operations on database
            statement = connection.createStatement();
        }
        catch(Exception exception)
        {
            System.out.println("Exception found: " + exception);
            System.out.println("Class: DatabaseGetData");
        }
    }
    //getter and setter of "query" object
    public void setQuery(String query){ this.query = query; }
    public String getQuery(){ return query; }

    //simple SELECT a column FROM any table
    public ArrayList getAllDataFromColumn(String columnName ,String tableName)
    {
        query = "SELECT " + columnName + " FROM " + tableName;
        try
        {
            resultSet = statement.executeQuery(query);
            while(resultSet.next())
            {
                queryResponse.add(resultSet.getString(columnName));
            }
        }
        catch (Exception exception)
        {
            System.out.println("Exception found: " + exception);
            System.out.println("Class: DatabaseGetData");
        }
        return queryResponse;
    }
    //method which returns all categories from database
    public ArrayList getAllCategories()
    {
        ArrayList <Categories> allCategories = new ArrayList<>();
        query = "SELECT * FROM CATEGORIES";
        try
        {
            resultSet = statement.executeQuery(query);
            while(resultSet.next())
            {
                allCategories.add(new Categories(resultSet.getInt(1),resultSet.getString(2),
                        resultSet.getString(3), resultSet.getString(4),resultSet.getString(5), resultSet.getString(6)));
            }
        }
        catch (Exception exception)
        {
            System.out.println("Exception found: " + exception);
            System.out.println("Class: DatabaseGetData");

        }
        return allCategories;
    }
    //method which returns all products from send category
    public ArrayList getAllProductsFromCategory(String categoryName)
    {
        ArrayList <Products> allProductsFromCategory = new ArrayList<>();
        query = "SELECT * FROM Products JOIN Categories ON Products.CategoryID = Categories.CategoryID " +
                "WHERE Categories.ProductGet = '" + categoryName +"'";
        try
        {
            resultSet = statement.executeQuery(query);
            while(resultSet.next())
            {
                allProductsFromCategory.add(new Products(resultSet.getInt(1),resultSet.getInt(2),
                        resultSet.getString(3), resultSet.getString(4),resultSet.getString(5),resultSet.getString(6)));
            }
        }
        catch (Exception exception)
        {
            System.out.println("Exception found: " + exception);
            System.out.println("Class: DatabaseGetData");

        }
        return allProductsFromCategory;
    }
}
