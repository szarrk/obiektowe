/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.zadanie;

/**
 *
 * @author inf154054
 */

final class Owner {
    int CatCount;
    String OwnerName;   
}

final class Cat {
    int CatIndex;
    String CatName;
    String CatColour;
    Owner CatOwner;
    
    void count(){
        System.out.print("This cat has number: " +CatIndex + "\n");
        System.out.print("Owner of this cat is: " + CatOwner.OwnerName);
    }
}

public class Zadanie {

    public static void main(String[] args) {
        
        Owner newCatOwner = new Owner();
        newCatOwner.CatCount = 10;
        newCatOwner.OwnerName = "Jacob";
        Cat myNewCat = new Cat();
        myNewCat.CatIndex = 3;
        myNewCat.CatName = "Fluff";
        myNewCat.CatColour = "black";
        myNewCat.CatOwner = newCatOwner;
        
        myNewCat.count();
    }

}

