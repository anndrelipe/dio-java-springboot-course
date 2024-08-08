package edu.andre.semanadois; // Indica diretório de pacotes.
public class MinhaClasse {
    // Convenções ->
    //  1. Métodos em Camel Case no infinitivo;
    //  2. Variáveis em minúsculo, só permitem, letras, numeros de 0 a 9, _ e $;
    //  3. Classe com o mesmo nome do arquivo, em Pascal Case.
    //  4. Identação.

    public static void main (String [] args) {
        final String CONSTANTE = "Isto é uma constante";
        System.out.print(CONSTANTE + '\n');

        String primeiro_nome = "André";
        String segundo_nome = "Peixoto";
        int ano_fabricacao = 2022;
        boolean tenho_sono = true;
        boolean falsa;

        ano_fabricacao = 2018;

        String nome_completo = nomeCompleto(primeiro_nome, segundo_nome);
        System.out.print(nome_completo);

    }

    public static String nomeCompleto (String primeiro_nome, String segundo_nome) {
        return primeiro_nome.concat(" ").concat(segundo_nome);
    }
}
