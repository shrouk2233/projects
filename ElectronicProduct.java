/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication59;

/**
 *
 * @author Experts
 */
public class ElectronicProduct extends product {
    String brand;
    int warrantyperiod;

    public ElectronicProduct() {
    }

    public ElectronicProduct(String brand, int warrantyperiod, int productid, String name, float price) {
        super(productid, name, price);
        this.brand = brand;
        this.warrantyperiod = warrantyperiod;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWarrantyperiod() {
     
        return warrantyperiod;
    }

    public void setWarrantyperiod(int warrantyperiod) {
        if(warrantyperiod>0)
        this.warrantyperiod = warrantyperiod;
       else
            this.warrantyperiod =Math.abs( warrantyperiod);
    }

    
    
    
    
}
