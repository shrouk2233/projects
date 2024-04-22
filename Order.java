/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication59;
import javax.swing.JOptionPane;

/**
 *
 * @author Experts
 */
public class Order {
Cart c1;
    int customerId;
    int orderId;
     product [] products;
   float totalPrice;

    public Order() {
    }
   

    public Order(int customerId, int orderId) {
        this.customerId =Math.abs(customerId);
        this.orderId = Math.abs(orderId);
        
    }
     private double calculateTotalPrice() {
        double total = 0;
        for (product product : products) {
            if (product != null) {
                total += product.getPrice();
            }
        }
        return total;
    }

   public void printOrderInfo(){
     
       String message="order id: "+ orderId + ", customer id: "+ customerId +", products in order:" ;
         for(int i=0;i<c1.nProducts;i++){
            if(c1.products[i] != null){

              message+=  c1.products[i].tostring();
                
            }}
   
        
     message+= "total price:$ "+ c1.calculatePrice();
                JOptionPane.showMessageDialog(null,message  );
   }
   
    
}
