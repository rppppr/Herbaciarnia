package com.front.items;

public class Categories
{
    private int categoryID;
    private String categoryName;
    private String categoryDescription;
    private String imageName;
    private String productGet;
    private String status;
    public Categories(int categoryID, String categoryName, String categoryDescription, String imageName, String productGet,String status)
    {
        this.setCategoryID(categoryID);
        this.setCategoryName(categoryName);
        this.setCategoryDescription(categoryDescription);
        this.setImageName(imageName);
        this.setProductGet(productGet);
        this.setStatus(status);
    }

    public int getCategoryID() { return categoryID; }

    public void setCategoryID(int categoryID) { this.categoryID = categoryID; }

    public String getCategoryName() { return categoryName; }

    public void setCategoryName(String categoryName) { this.categoryName = categoryName; }

    public String getCategoryDescription() { return categoryDescription; }

    public void setCategoryDescription(String categoryDescription) { this.categoryDescription = categoryDescription; }

    public String getImageName() { return imageName; }

    public void setImageName(String imageName) { this.imageName = imageName; }

    public String getProductGet() { return productGet; }

    public void setProductGet(String productGet) { this.productGet = productGet; }

    public String getStatus() { return status; }

    public void setStatus(String status) { this.status = status; }
}
