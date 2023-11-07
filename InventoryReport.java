/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventory;

import java.util.List;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toList;

/**
 *
 * @author sbc-student
 */
public class InventoryReport {
    public static void generateReport(InventoryManager manager){
        List<Product> products = manager.getProducts();
        
        List<String> productInfo = (List<String>) products.stream()
                .map(product -> "Id:" + product.getId() + ",name: " + product.getname() + ",price: $" + product.getprice())
                .collect(toList());
        
        productInfo.forEach(System.out::println);
    }
}