package com.front.database;

import com.front.items.Categories;
import com.front.items.Products;

import java.util.ArrayList;

public class WriteDataFromDatabase
{
    //these data will be showed on the website
    private ArrayList dataToWrite;
    //obcect needed to get data
    DatabaseGetData data = new DatabaseGetData();
    public ArrayList WriteCategories()
    {
        //these data will be showed on the website
        dataToWrite = new ArrayList<>();
        //we get all the categories with all fields, which we will need to display they in correct order
        ArrayList <Categories> categories = data.getAllCategories();
        //as long, as we can get another category, we add them properties to list of objects to write
        for (Categories category: categories)
        {
            if(category.getStatus().equals("Zaakceptowane"))
            {
                dataToWrite.add("<a href=\"tea_list.jsp?kind=" + category.getProductGet() +
                        "\" class=\"col-11 col-sm-4 col-lg-2 menu-card-item\">" +
                        "<div>" +
                        "<img src=\"../IMG/" + category.getImageName()+ "\" class=\"img-fluid\" alt="+category.getCategoryName() + ">" +
                        "<h5 class=\"text-center\">" + category.getCategoryName() + "</h5>" +
                        "</div>" +
                        "</a>");
            }
        }
        return dataToWrite;
    }
    public ArrayList WriteProducts(String categoryName)
    {
        //these data will be showed on the website
        dataToWrite = new ArrayList<>();
        //we get all the products with all fields, which we will need to display they in correct order
        ArrayList <Products> products =  data.getAllProductsFromCategory(categoryName);
        //as long, as we can get another product, we add them properties to list of objects to write
        for(Products product : products)
        {
            if(product.getStatus().equals("Zaakceptowane"))
            {
                dataToWrite.add("<div class=\"col-12 col-lg-6\">" +
                        "<h3 class=\"text-center col-12 product-header\">" + product.getProductName() + "</h3>" +
                        "<div class=\"row justify-content-center tea-kind-item\">" +
                        "<div class=\"col-12 col-lg-4 tea-kind-item-img\">" +
                        "<img src=../IMG/" + product.getImageName() + " class=\"img-fluid\" alt=" + product.getProductName() + ">" +
                        "</div>" +
                        "<div class=\"col-12 col-lg-8 tea-kind-item-description\">" +
                        "<p>" +
                        product.getProductDescription() +
                        "</p>" +
                        "</div>" +
                        "</div>" +
                        "</div>");
            }
        }
        return dataToWrite;
    }
    public String getHeaderForProductKind(String productGet)
    {
        ArrayList <Categories> categories = data.getAllCategories();
        String header = "";
        for(Categories category : categories)
        {
            if(category.getProductGet().equals(productGet) && category.getStatus().equals("Zaakceptowane"))
            {
                header = ("<div class=\"col-12 my-3 text-center product-header\">" +
                        "<h2>" + category.getCategoryName() + "</h2>" +
                        "<p>" + category.getCategoryDescription() +  "</p>" +
                        "</div>");
            }
        }
        return header;
    }
}
