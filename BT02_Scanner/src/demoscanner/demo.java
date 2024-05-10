/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoscanner;

import java.util.Scanner;


public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Your Name: ");
        String name = sc.nextLine();
        System.out.printf("Your Age: ");
        int age = sc.nextInt();
        System.out.printf("Your Address: ");
        String address = sc.nextLine();
        System.out.printf("Your Phone Number: ");
        String phoneNumber = sc.nextLine();
        System.out.printf("Your Major: ");
        String major = sc.nextLine();
        
        System.out.println("Your Name: " + name + " Your Age: " + age + " Your Address: " + address + " Your Phone Number: " + phoneNumber + " Your Major: " + major);
    }
 
}
