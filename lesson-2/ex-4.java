/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ex.java;

interface Vehicle{
    Vehicle pourGas(int factor);
    Vehicle changeSpeed(int factor);       
}

class Car implements Vehicle {
    private int gasLevel;
    private String carBrand;
    private int carSpeed;
    
    Car(int gasLevel, String carBrand, int carSpeed){
        this.gasLevel = gasLevel;
        this.carBrand = carBrand;
        this.carSpeed = carSpeed;
    }
    
    @Override       
    public Vehicle pourGas(int factor){
        return new Car(this.gasLevel + factor, this.carBrand, this.carSpeed);
    }
    
    @Override       
    public Vehicle changeSpeed(int newSpeed){
        return new Car(this.gasLevel, this.carBrand, newSpeed);
    }
    }

public class Ex4Java {

    public static void main(String[] args) {
        Car stoppedCar = new Car(10, "Audi", 0);
        //Car drivingCar = stoppedCar.changeSpeed(20); //com/mycompany/ex/java/Ex4Java.java:[39,48] incompatible types: com.mycompany.ex.java.Vehicle cannot be converted to com.mycompany.ex.java.Car
        Car fueledCar = stoppedCar.pourGas(40);
        
    }
}
