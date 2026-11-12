package com.example.demo;
import java.util.Scanner;

public class Object_Scanner_int {
    public static void main (String[] args ){
        
                Scanner sc = new Scanner(System.in);

                int x;
                x = sc.nextInt();
                System.out.println("Voce digitou: "+ x);

                sc.close();
            
        }
}
