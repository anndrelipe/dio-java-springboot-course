public class Logicos {
    public static void main (String [] args) {
        // Avaliam o resultado da combinação de expressões booleanas
        // && - e (todos)
        // || - ou (existe um)

        System.out.print( false && false); // false
        System.out.print( true && false); // false
        System.out.print( true && true); // true

        System.out.print( true || true); // true
        System.out.print( false || true); // true
        System.out.print( false || false); // false
   
    }
}
