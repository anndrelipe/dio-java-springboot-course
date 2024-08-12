public class Unario {
    public static void main (String [] args) {

        // + => define o número como positivo;
        // - => define o número como positivo;
        // ++ => incrementa o número em uma unidade;
        // -- => decrementa o número em uma unidade;
        // ! => nega uma operação booleana;

        int numero = 20; // +20
        int expressao_num = 1 - (14 + 56) + (14 + 85); // +30
        boolean expressao_bool = (true && false) || true; // true

        System.out.print(+numero + "\n"); // 20
        System.out.print(- expressao_num + "\n"); // -30

        numero++; // pega o valor, não faz nada, incrementa != ++numero, incrementa, pega o valor, incrementado, não faz nada.
        System.out.print( - numero + "\n"); // -21

        expressao_num--;
        expressao_num = -expressao_num ;
        
        System.out.print(expressao_num + "\n"); // -29

        System.out.print(!expressao_bool); // false
    }
}
