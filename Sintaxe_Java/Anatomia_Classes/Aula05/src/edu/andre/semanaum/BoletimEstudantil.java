package edu.andre.semanaum; // Indica diretório de pacote.
public class BoletimEstudantil {
    
    // Observe que o código está devidamente tabulado em identação e segue um padrão hierarquico.
    
    public static void main (String [] args) {
        int media_final = 8;
        if (media_final < 7) {
            System.out.print("Reprovado, média menor que 7.");
        } else if (media_final == 7) {
            System.out.print("Em reavaliação, média igual a 7.");
        } else {
            System.out.print("Aprovado! Média maior do que 7.");
        }
    }
}
