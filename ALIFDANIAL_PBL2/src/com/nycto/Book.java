package com.nycto;

public class Book
{

   //Variable declaration
   public String Title;
   public String Author;
   public String Qty;
   public String Ebook;
   public int Ebookprice;
   public int Physicalprice;

//Book Constructor
public Book(String title,String author,String qty,String ebook,int ebookprice,int physicalprice)
{
    Title = title;
    Author = author;
    Qty = qty;
    Ebook = ebook;
    Ebookprice = ebookprice;
    Physicalprice = physicalprice;
}

//Getter and setter
    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getQty() {
        return Qty;
    }

    public void setQty(String qty) {
        Qty = qty;
    }

    public String getEbook() {
        return Ebook;
    }

    public void setEbook(String ebook) {
        Ebook = ebook;
    }

    public int getEbookprice() {
        return Ebookprice;
    }

    public void setEbookprice(int ebookprice) {
        Ebookprice = ebookprice;
    }

    public int getPhysicalprice() {
        return Physicalprice;
    }

    public void setPhysicalprice(int physicalprice) {
        Physicalprice = physicalprice;
    }

    //Override method
    //To make system can display book name from a=boject without error
    @Override
    public String toString()
    {
        return Title;
    }

//End of book class
}
