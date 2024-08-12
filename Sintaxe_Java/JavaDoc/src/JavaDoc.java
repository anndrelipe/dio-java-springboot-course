    /** 
     * Este é o princípio da documentação nátiva Java.
     * Além dos textos de orientação, as tags principais:
     * @author André Lima Peixoto
     * @since 12/08/2024
    */
public class JavaDoc {
    /**
     * Esté método exibe o código terminal javadoc para gerar a pasta .docs
     */
    public static void main (String[] args) {
        javadoc_code();
    }

    public static void javadoc_code () {
        System.out.println("javadoc -encoding UTF-8  -docencoding  ISO-8859-1 -d ../docs src/*.java");
    }
}
