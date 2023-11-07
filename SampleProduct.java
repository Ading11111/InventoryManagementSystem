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
public class SampleProduct {
    public static void main(String[]args){
        
        List<Product> products = List.of(
        
       new Product(1,"Laptop", 1000),
       new Product(1, "Mouse", 200),
       new Product(3, "Keyboad", 750)
            );
       
        InventoryManager manager = new InventoryManager(products);
        
        InventoryReport.generateReport(manager);
    }
}
