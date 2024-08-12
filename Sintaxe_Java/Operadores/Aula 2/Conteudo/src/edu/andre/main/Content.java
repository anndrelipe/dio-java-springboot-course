package edu.andre.main;

public class Content {
    public static void main (String[] args) {
        System.out.print("Esse é o conteúdo de operadores java. \n");
        System.out.print("Este documento contempla: Operadores de Atribuição e Operadores Aritiméticos. \n");

        String meu_nome = "André"; // Atribuição.

        System.out.print("André, foi o valor atribuído à variável meu_nome, logo: \n");
        System.out.print("meu_nome : " + meu_nome + "\n");

        int numero_um = 10;
        int numero_dois = 45;

        int soma = numero_dois + numero_um; // Atribui a soma. 
        int dif = numero_dois - numero_um; // Atribui a dif.
        int mult = numero_dois * numero_um; // Atribui o prod.
        double div = numero_dois / numero_um; // Atribui a razão.
        int mod = numero_dois % numero_um; // Atribui o resto da divisão.

        System.out.print("Soma : " + soma + "\n" + "Dif : " + dif + "\n" + "Mult : " + mult + "\n" + "Div : " + div + "\n" + "Mod : " + mod + "\n");

        // Para strings/char o operador "+" aplica uma concatenação. A primeira necessidade de concatenação define a função de +.
        // logo, "1" + 1 + 1 = 111, porém 1 + 1 + "1" = 21 e "1" + (1 + 1) = 12

        System.out.print("1" + 1 + 1 + "\n");
        System.out.print(1 + 1 + "1" + "\n");
        System.out.print("1" + (1 + 1) + "\n");

    }
}
