/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thucchienscanner;

import java.util.Scanner;


public class BT02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Input number: ");
        int a = Integer.parseInt(sc.nextLine()); 
        
        if (a % 2 == 0){
            printSquare(a);
        } else {
            printTriangle(a);
        }
    }   
    
    public static void printSquare(int b){
        for (int i = 0; i < b; i++){
            for (int j = 0; j < b; j++){
                System.out.printf("* ");
            }
            System.out.println();
        }
    }
    
    public static void printTriangle(int c){
       for (int i = c / 2 + 1; i >= 1; i--){
            for(int j = 1; j <= i - 1; j++){
             System.out.printf(" ");
            }
            for(int j = 1; j <= (c / 2) + 1 - i + 1; j++){
             System.out.printf("*");
            }
            for(int j = 1; j <= (c / 2) + 1 - i; j++){
             System.out.printf("*");
            }
            System.out.println();
        }
    }
}
