/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication59;

/**
 *
 * @author Experts
 */
public class product {
    int productid;
    String name;
    float price;

    public product() {
    }

    public product(int productid, String name, float price) {
        this.productid = productid;
        this.name = name;
        this.price = price;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        if(productid>0)
        this.productid = productid;
        else
            this.productid=Math.abs(productid);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
         if(price>0)
        this.price = price;
        else
            this.price=Math.abs(price);
        
    }
  
    public String tostring(){
        return "name="+ name+ ",price"+ price;
    }
    
}
