/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventory;

/**
 *
 * @author sbc-student
 */
public class Product {
 
 private int Id;
 private String name;
 private double price;
 
 public Product(int Id,String name, double price){
     this.Id = Id;
     this.name = name;
     this.price= price;
     
 }
 
 public int getId(){
  return Id;
  
 }
 
 public String getname(){
    return name;
    
 }
 
 public double getprice(){
     return price;
     
 }
 
}

