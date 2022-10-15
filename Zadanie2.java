/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.zadanie2;

/**
 *
 * @author inf154054
 */

final class Blouse {
    int blousePrice;
    String blouseColour;
    String blouseSize;
    
    public Blouse(int price, String colour, String size) {
    this.blousePrice = price;
    this.blouseColour = colour;
    this.blouseSize = size;
    }
    
    public Blouse(String price, String colour, String size) {
        this(Integer.parseInt(price), colour, size);
    }
    
    public Blouse(int price, String colour){
        this(price, colour, "one size");
    }
    
    void itemInfo(){
        System.out.println("Price is: " + blousePrice + "\nColour is: " + blouseColour + "\nSize is: " + blouseSize);
    }

}

public class Zadanie2 {

    public static void main(String[] args) {
        Blouse newItem = new Blouse(49, "black", "extra large");
        Blouse noSize = new Blouse (30, "pink");
        newItem.itemInfo();
        noSize.itemInfo();
    }
}
