package com.platzi.market.domain;

public class Category
{
    private int categoryId;
    private String category;
    private boolean active;

    public int getCategoryId()
    {
        return categoryId;
    }

    public void setCategoryId( int categoryId )
    {
        categoryId = categoryId;
    }

    public String getCategory()
    {
        return category;
    }

    public void setCategory( String category )
    {
        category = category;
    }

    public boolean getActive()
    {
        return active;
    }

    public void setActive( boolean active )
    {
        active = active;
    }
}
