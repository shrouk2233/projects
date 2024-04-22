/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication59;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author Experts
 */
public class JavaApplication59 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner= new Scanner(System.in);
        
         ElectronicProduct smartphone= new ElectronicProduct("samsung",1,1,"smart phone ", 599.9f );
          ClothingProduct tshirt= new ClothingProduct("medium","cotton",2,"t shirt", 19.99f);
          BookProduct oop=new BookProduct("O Reilly","x publication",3,"oop",39.99f);
          
                  JOptionPane.showMessageDialog(null, " welcome to e commerce system");

         
        int customrtid= Integer.parseInt(JOptionPane.showInputDialog("Enter Your ID: "));
        
         
        String customrtname=JOptionPane.showInputDialog("Enter Your name "); 
        
        String customrtaddress= JOptionPane.showInputDialog("Enter Your address ");
        
        Customer customer= new Customer(customrtid,customrtname, customrtaddress);
         
        int nomproducts= Integer.parseInt(JOptionPane.showInputDialog("Enter nomproducts "));
      
        Cart cart=new Cart(customrtid,nomproducts);
        
        for(int i=0; i< nomproducts;i++){
            JOptionPane.showMessageDialog(null, "choose product to add");
            JOptionPane.showMessageDialog(null, "1:smart phone, 2:t shirt ,3: oop book"); 
             
               int choise= Integer.parseInt(JOptionPane.showInputDialog("Enter Your choise "));
                
               product product= new product();
               switch(choise){
                    case 1:
                  product= smartphone;
                    break;
                        case 2:
                        product= tshirt;                  
                        break;
                     case 3:   
                     product= oop;
                    break;
                     default:
                         JOptionPane.showMessageDialog(null, "invalid choise");
                      
                    i--;
                    continue;
                      }
               cart.addProduct(product);
        }
       JOptionPane.showMessageDialog(null, " whould you like to place the order ? 1-yes/2-no");
            
        int choise2 = Integer.parseInt(JOptionPane.showInputDialog("Enter choise2: "));
        if (choise2== 1) {
            Order order = new Order(customer.getCustomerId(), 1 );
            cart.placeorder(order, cart);
           order.printOrderInfo();
        } 
        else {
             JOptionPane.showMessageDialog(null, "done");
        }

    }
             }
                   
        
        
        
        
       
       
    
    

