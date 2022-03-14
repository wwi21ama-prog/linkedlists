public class Main {


    public static void main(String[] args) {
        // demo1();
        // demo2();
        demo3();
    }

    /*
     * Demo-Funktion 1:
     * 
     * Erzeugt eine Liste und hängt nach und nach Elemente an.
     * Dies passiert nur mittels der Methode setData().
     * 
     * Dieses Beispiel soll die absolut grundlegenden Listenfunktionen zeigen.
     * Eine Liste ist am Anfang leer, in diesem Fall besteht sie aus einem einzigen
     * ungültigen Element. Neue Elemente werden angehängt, indem man am Ende neue Werte
     * setzt und jeweils neue leere Elemente anhängt.
     */
    public static void demo1() {
        
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

    /*
     * Demo-Funktion 2:
     * 
     * Erzeugt eine Reihe von Elementen und ermittelt dann die Liste.
     * Zeigt außerdem, wie man mittels einer Hilfsmethode getEnd() das Einfügen
     * erleichtern und von der Länge unabhängig machen kann. 
     */
    public static void demo2() {
        // Ein Element erzeugen und neue Elemente anhängen, wie in demo1().
        Element e = new Element();
        e.setData(42, 15);
        e.next.setData(25, 17);
        e.next.next.setData(75, 107);
        e.next.next.next.setData(38, 55);

        // Die Länge der Liste ausgeben.
        System.out.println(e.size());

        // Das Ende der Liste suchen und ausgeben.
        // Das Ende ist ein ungültiges Element.
        // Die Hilfsfunktion getEnd() liefert dieses Element und erleichtert
        // so das Einfügen weiterer Elemente.
        System.out.println(e.getEnd());

        // Weitere Elemente anhängen, dieses Mal unter Verwendung von getEnd().
        e.getEnd().setData(105, 67);
        e.getEnd().setData(200, 367);
        e.getEnd().setData(-2, 25);

        // Die Länge erneut ausgeben, um zu sehen, dass sich etwas getan hat.
        System.out.println(e.size());
    }

    public static void demo3() {
        // Wieder ein Element erzeugen.
        Element e = new Element();

        // Elemente anhängen, dieses Mal mittels der neuen Methode add().
        // Diese benutzt intern das Schema getEnd().setData() aus demo2().
        e.add(42,15);
        e.add(25,17);
        e.add(75,107);
        e.add(38,55);

        // Die Liste und ihre Länge ausgeben.
        System.out.println(e.size());
        System.out.println(e); // (42,15)
        System.out.println(e.next); // (25,17)
        System.out.println(e.next.next); // (75,107)
        System.out.println(e.next.next.next); // (38, 55)
    }
}
