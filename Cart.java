/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication59;

/**
 *
 * @author Experts
 */
public class Cart {
     int customerId;
     int nProducts;
     product [] products;

    public Cart() {
    }
     

    public Cart(int customerId, int nProducts) {
        this.customerId = customerId;
        this.nProducts = nProducts;
        products=new product[nProducts];
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        if(customerId>0)
         this.customerId= this.customerId ;
        else
        this.customerId =Math.abs( this.customerId);
    }

    public int getnProducts() {
        return nProducts;
    }

    public void setnProducts(int nProducts) {
         if( nProducts>0)
         this. nProducts= this. nProducts;
        else
        this. nProducts =Math.abs( this. nProducts);
    }

    public product[] getProducts() {
        return products;
    }

    public void setProducts(product[] products) {
        this.products = products;
    }

  
    public void addProduct ( product product){
        for(int i=0; i<nProducts;i++ ){
            if (products[i]== null){
            products[i]=product;
            break ;
            }
            else if(i==nProducts-1){
                System.out.println("can not more");
            }
            }
       
    }
    public void removeProduct ( product product){
        for(int i=0; i<nProducts;i++ ){
            if (products[i]== product){
            products[i]= null; 
                System.out.println(" done ,removed");
            }
            }
        System.out.println("is not in the cart");
    }
    public float calculatePrice(){
        float totalprice=0;
        for(int i=0; i<nProducts;i++ ){
            if (products[i]!= null){
           totalprice+= products[i].getPrice();
            }
        
    }
        return totalprice;
    }
   public void placeorder(Order o , Cart c){

        o.c1 = c;
        o.products = new product[c.nProducts];
    } 
    
     
    
}
