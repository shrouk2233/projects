/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication59;

/**
 *
 * @author Experts
 */
public class ClothingProduct extends product {
    String size, fabric;

    public ClothingProduct() {
    }

   

    public ClothingProduct(String size, String fabric, int productid, String name, float price) {
        super(productid, name, price);
        this.size = size;
        this.fabric = fabric;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getFabric() {
        return fabric;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }
    

   
    
}
