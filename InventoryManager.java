/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventory;

import java.util.List;

/**
 *
 * @author sbc-student
 */
public class InventoryManager {
    private List<Product> products;
    
    public InventoryManager(List<Product> products){
        this.products = products;
    }
     
    public List<Product> getProducts(){
     return products;   
    }
}
