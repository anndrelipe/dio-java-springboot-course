public class Ternario {
    public static void main (String [] args) {

        // Além da forma tradicional de se estabelecer um bloco condicional, existe a possibilidade de utilizar-se do 
        // operador ternário:
        // variável = <condição booleana> ? <resultado para se true> : <resultado para se false>;
        // logo,

        char a = 'a';
        char b = 'b';
        String resultado;

        if (a == b) {
            resultado = "Verdadeiro";
        } else {
            resultado = "Falso";
        }

        System.out.print(resultado + "\n");

        char a_ = 'a';

        resultado = (a == a_) ? "Verdadeiro" : "Falso";
        System.out.print(resultado);

    }
}
