/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thucchienscanner;

import java.util.Scanner;

public class BT01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Input two integer number a and b: ");
        int a = Math.abs(Integer.parseInt(sc.nextLine()));
        int b = Math.abs(Integer.parseInt(sc.nextLine()));
        
        int sumA = 0;
        int sumB = 0;
        
        for (int i = 1; i <= a/2; i++){
            if (a % i == 0){
                sumA = sumA + i;
            }
        }
        if (a == sumA){
            System.out.println("True!");
        } else {
            System.out.println("False!");
        }
        
        for (int i = 1; i <= b/2; i++){
            if (b % i == 0){
                sumB = sumB + i;
            }
        }
        if (b == sumB){
            System.out.println("True!");
        } else {
            System.out.println("False!");
        }

    }

}
