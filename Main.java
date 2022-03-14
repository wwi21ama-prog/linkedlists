public class Main {
    public static void main(String[] args) {
        
        // Ein Element erzeugen.
        Element e = new Element();

        // Das Element ausgeben.
        System.out.println(e);
        
        // Ausgeben, ob das Element gültig ist.
        System.out.println(e.isValid());
        
        // Werte setzen.
        e.setData(42, 15);
        
        // Das Element und seine Gültigkeit wieder ausgeben.
        System.out.println(e);
        System.out.println(e.isValid());
    }
}
