package com.example.demo;
public class HelloController {
    public static void main(String[] args){
        double x = 10.562131;
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        System.out.print("BOM DIA!"); // Não possui a quebra de linha por conta do print.
        System.out.println("hello world"); // println realiza a quebra de linha.
        System.out.printf("Resultado da minha conta: " + x + " Reais%n");
        System.out.printf("Resultado = %.2f metros%n", x); // Regra para o printf: "Texto1 %f Texto2 %f Texto3 %f ", viriavel1, variavel2 ...
                                                            //%f = Ponto Flutuante.
                                                            //%n = Quebra de Linha. -  Só funcionioa se eu utilizar o pintf.
        System.out.printf("%s tem %d anos e ganha RS$ %.2f reais%n", nome, idade, renda);
    }
}