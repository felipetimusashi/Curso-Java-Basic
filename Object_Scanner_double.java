package com.example.demo;
import java.util.Locale;
import java.util.Scanner;

public class Object_Scanner_double {
    public static void main (String[] args ){
        
                Scanner sc = new Scanner(System.in);

                Locale.setDefault(Locale.US); // Informa o modelo que deve ser inserido no caso está apontando para EUA.
                Double x;
                x = sc.nextDouble();
                System.out.println("Voce digitou: "+ x); // Saida vai ser com . por conta do leito LN.
                System.out.printf("Você digitou: %.2f%n", x ); // Saida vai ser com , por conta do F que transmite o que foi inserido.

                sc.close();
            
        }
}
