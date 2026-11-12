package com.example.demo;

public class Calculando_em_java4 {
        public static void main (String[] args){
            int a, b;
            double resultado;

            a = 5;
            b = 2;

            resultado = (double)a/b; // Com Casting.
            resultado = a/b; // Sem Casting.

            System.out.println(resultado);
        }
}
