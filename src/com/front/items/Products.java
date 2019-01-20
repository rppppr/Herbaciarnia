package com.front.items;

public class Products
{
    private int productID;
    private int categoryID;
    private String productName;
    private String productDescription;
    private String imageName;
    private String status;

    public Products(int productID, int categoryID, String productName, String productDescription, String imageName,String status)
    {
        this.setProductID(productID);
        this.setCategoryID(categoryID);
        this.setProductName(productName);
        this.setProductDescription(productDescription);
        this.setImageName(imageName);
        this.setStatus(status);
    }

    public int getProductID() { return productID; }

    public void setProductID(int productID) { this.productID = productID; }

    public int getCategoryID() { return categoryID; }

    public void setCategoryID(int categoryID) { this.categoryID = categoryID; }

    public String getProductName() { return productName; }

    public void setProductName(String productName) { this.productName = productName; }

    public String getProductDescription() { return productDescription; }

    public void setProductDescription(String productDescription) { this.productDescription = productDescription; }

    public String getImageName() { return imageName; }

    public void setImageName(String imageName) { this.imageName = imageName; }

    public String getStatus() { return status; }

    public void setStatus(String status) { this.status = status; }
}