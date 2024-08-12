public class Relacionais {
    public static void main (String [] args) {
        // Operadores Relacionais levantam a avaliação do relacionamento entre dois operandos e retorna a resposta em boolean

        // == => Igual a
        // != => Diferente de
        // < => Menor que
        // <= => Menor ou igual a
        // > => Maior que
        // >= Maior ou igual a

        // *OBS : Pode ser insatisfatório o uso de operadores relacionais para avaliar diferentes objetos, por isso, para avaliar
        // o relacionamento do conteúdo de objetos, é indicado usar .equals().

        String nome = "André";
        String nome_ = new String("André");

        int numero_um = 1;
        int numero_dois = 1;

        System.out.print(nome == nome_); // false
        System.out.print(numero_um != numero_dois); // false
        System.out.print(numero_um > numero_dois); // false
        System.out.print(numero_um >= numero_dois); // false
        System.out.print(numero_um < numero_dois); // false
        System.out.print(numero_um <= numero_dois); // false
        System.out.print(nome.equals(nome_)); // true

    }
}
