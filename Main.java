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

        // Eine Reihe weiterer Werte am Ende hinzufügen.
        e.next.setData(25, 17);
        e.next.next.setData(75, 107);
        e.next.next.next.setData(38, 55);

        // Die ganze Liste noch einmal ausgeben.
        System.out.println(e); // (42,15)
        System.out.println(e.next); // (25,17)
        System.out.println(e.next.next); // (75,107)
        System.out.println(e.next.next.next); // (38, 55)
        System.out.println(e.next.next.next.next); // (0,0) (ungültiges Element am Ende)
        System.out.println(e.next.next.next.next.next); // null
    }
}
