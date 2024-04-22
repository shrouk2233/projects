/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication59;

/**
 *
 * @author Experts
 */
public class BookProduct extends product {
    String auther, publisher;

    public BookProduct() {
    }

    
    public BookProduct(String auther, String publisher, int productid, String name, float price) {
        super(productid, name, price);
        this.auther = auther;
        this.publisher = publisher;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    
    
    
    
    
    
    
    
    

   
}
