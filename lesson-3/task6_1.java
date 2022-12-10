/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */


/**
 *
 * @author student
 */


public class Operations {
    private int firstNumber;
    private int secondNumber;
    
    Operations(int a, int b){
        this.firstNumber = a;
        this.secondNumber = b;
    }
    
    int max(){
        return firstNumber > secondNumber ? firstNumber : secondNumber ;
    }
    int min(){
        return firstNumber < secondNumber ? firstNumber : secondNumber ;
    }
    float avg(){
        return (firstNumber + secondNumber) /2.0f;
    }
    
    public static void main(String[] args) {
        Operations newOperation = new Operations(4, 2);
        
        System.out.println(Integer.toString(newOperation.max()));
        System.out.println(Integer.toString(newOperation.min()));
        System.out.println(Float.toString(newOperation.avg()));
        
    }
}



    

