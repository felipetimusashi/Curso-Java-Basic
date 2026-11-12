package com.example.demo;

public class Calculando_em_java3 {
        public static void main (String[] args ){
            
            // double b, B, h, area; - Informando em uma linhas as váriaveis não preciso ficar informando linha a linha.
            // Por boas práticas você pode informar depois do número o f de Float Ex: b = 6f; Lembrando de informar antes o tipo da variável que é float.
            double b = 6.0; //Variáveis de um trapézio.
            double B = 8.0;
            double h = 5.0;
            
            double area = (b+B)/2.0 * h; // Função de um trapézio.

            System.out.println(area);
        }
}
