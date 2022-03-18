public class Main {


    public static void main(String[] args) {
        // demo1();
        // demo2();
        // demo3();
        // demo4();
        // demo5();
        // demo6();
        demo7();
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

    /*
     * Demo-Funktion 3:
     * 
     * Hängt Elemente nun mit der Methode add() an.
     * Zeigt anschließend, wie man die Ausgabe simpler und flexibler als nur
     * mit hartcodierten next.next...-Ketten machen kann.
     */
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

        // Bequemere Methode: In einer Schleife alle Elemente ausgeben.
        for (Element current  = e; current.isValid(); current = current.next) {
            System.out.println(current);
        }

        // Oder mittels einer Methode der Klasse Element:
        System.out.println(e.allElementsToString());
    }

    public static void demo4() {
        // Wieder ein Element erzeugen.
        Element e = new Element();

        // Elemente anhängen, dieses Mal mittels der neuen Methode add().
        // Diese benutzt intern das Schema getEnd().setData() aus demo2().
        e.add(42,15);
        e.add(25,17);
        e.add(75,107);
        e.add(38,55);
        
        System.out.println(e.get(0));
        System.out.println(e.get(2));
        
        System.out.println(e.get(4)); // Ungültig
        System.out.println(e.get(-1)); // Ungültig
    }
  
    public static void demo5() {
        // Wieder ein Element erzeugen.
        Element e = new Element();

        e.add(42,15);
        e.add(25,17);
        e.add(75,107);
        e.add(38,55);

        e.insert(30000,30000);
        
        System.out.println(e.allElementsToString());
    }

  public static void demo6() {
        // Wieder ein Element erzeugen.
        Element e = new Element();

        e.add(42,15);
        e.add(25,17);
        e.add(75,107);  // A
        e.add(380000,55);   // B
        e.add(100,55);  // C
        e.add(200,55);
        e.add(300,55);  // D
        e.add(400000,55);  // E
        e.add(500,55);  // F
        e.add(600,55);

        System.out.println(e.allElementsToString());
        
        e.swap(3,7);
        
        System.out.println(e.allElementsToString());
    
        e.swap(0,7);
    
        System.out.println(e.allElementsToString());
    }


  public static void demo7() {
    // Eine Liste erzeugen.
    List l1 = new List();

    l1.add(42,15);
    l1.add(25,17);
    l1.add(75,107);
    l1.add(380000,55);
    l1.add(100,55);
    l1.add(200,55);
    l1.add(300,55);
    l1.add(400000,55);
    l1.add(500,55);
    l1.add(600,55);
  
    System.out.println(l1.head.allElementsToString());
    System.out.println(l1.size());

    l1.swap(0,7);
    System.out.println(l1.head.allElementsToString());
  }

}