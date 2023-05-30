/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.fibonacci;

/**
 *
 * @author Administrator
 */
public class Main {

public static void main(String[] args) {
        System.out.println(printFibonacci(10));
    }
    
    public static int printFibonacci(int n){
        
        if (n == 1|| n==2)
        {
            return 1;
        }
        else{
            return printFibonacci(n-1)+printFibonacci(n-2);
        }
    }
    
}
